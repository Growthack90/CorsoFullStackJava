import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Magazzino {
    private String nomeFile;

    public Magazzino(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile, true))) {
            writer.write(prodotto.toString());
            writer.newLine();
            System.out.println("Prodotto aggiunto correttamente!");
        } catch (IOException e) {
            System.err.println("Errore durante l'aggiunta del prodotto: " + e.getMessage());
        }
    }

    public void visualizzaProdotti() {
        List<Prodotto> prodotti = caricaProdotti();
        if (prodotti.isEmpty()) {
            System.out.println("Nessun prodotto in magazzino.");
        } else {
            for (Prodotto p : prodotti) {
                System.out.println(p);
            }
        }
    }

    private List<Prodotto> caricaProdotti() {
        List<Prodotto> prodotti = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    try {
                        prodotti.add(new Prodotto(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3])));
                    } catch (NumberFormatException e) {
                        System.err.println("Errore nella conversione dei dati: " + line);
                    }
                } else {
                    System.err.println("Riga del file non valida: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura dei prodotti: " + e.getMessage());
        }
        return prodotti;
    }

    private void salvaProdotti(List<Prodotto> prodotti) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for (Prodotto p : prodotti) {
                writer.write(p.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Errore durante il salvataggio dei prodotti: " + e.getMessage());
        }
    }

    public void cercaProdotto(String nome) {
        List<Prodotto> prodotti = caricaProdotti();
        for (Prodotto p : prodotti) {
            if (p.getName().equalsIgnoreCase(nome)) {
                System.out.println("Prodotto trovato: " + p);
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public void aggiornaQuantita(String nome, double nuovaQuantita) {
        List<Prodotto> prodotti = caricaProdotti();
        for (Prodotto p : prodotti) {
            if (p.getName().equalsIgnoreCase(nome)) {
                p.setQuantity(nuovaQuantita);
                salvaProdotti(prodotti);
                System.out.println("Quantità aggiornata con successo!");
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public void rimuoviProdotto(String nome) {
        List<Prodotto> prodotti = caricaProdotti();
        boolean rimosso = prodotti.removeIf(p -> p.getName().equalsIgnoreCase(nome));
        if (rimosso) {
            salvaProdotti(prodotti);
            System.out.println("Prodotto rimosso con successo!");
        } else {
            System.out.println("Prodotto non trovato.");
        }
    }
}