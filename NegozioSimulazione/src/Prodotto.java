public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantitaDisponibile;

    public Prodotto(String nome, double prezzo, int quantitaDisponibile) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", quantitaDisponibile=" + quantitaDisponibile +
                '}';
    }
}