package ex_AntonioPagano.oopClass.exLibreria;

public class Libro {
    private String titolo;
    private String autore;
    private int prezzo;

    public Libro(String t, String a, int p) {
        titolo = t;
        autore = a;
        prezzo = p;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getPrezzo() {
        return prezzo;
    }
}
