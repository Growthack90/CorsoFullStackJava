import java.util.ArrayList;

public class Negozio {
    private ArrayList<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void visualizzaProdotti() {
        if (prodotti.isEmpty()) {
            System.out.println("Il negozio è vuoto.");
        } else {
            for (Prodotto prodotto : prodotti) {
                System.out.println(prodotto);
            }
        }
    }

    public void acquistaProdotto(String nomeProdotto, int quantita) {
        for (Prodotto prodotto : prodotti) {
            if (prodotto.getNome().equalsIgnoreCase(nomeProdotto)) {
                if (prodotto.getQuantitaDisponibile() >= quantita) {
                    prodotto.setQuantitaDisponibile(prodotto.getQuantitaDisponibile() - quantita);
                    System.out.println(quantita + " unità di " + nomeProdotto + " acquistate con successo.");
                    return;
                } else {
                    System.out.println("Quantità insufficiente di " + nomeProdotto + " disponibile.");
                    return;
                }
            }
        }
        System.out.println("Prodotto " + nomeProdotto + " non trovato.");
    }

    public void rimuoviProdotto(String nomeProdotto) {
        prodotti.removeIf(prodotto -> prodotto.getNome().equalsIgnoreCase(nomeProdotto));
        System.out.println("Prodotto " + nomeProdotto + " rimosso dall'inventario.");
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }
}