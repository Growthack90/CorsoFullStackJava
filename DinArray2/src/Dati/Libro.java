package Dati;

public class Libro {
    private String autore;
    private String titolo;
    private int anno;

    public Libro(String autore, String titolo, int anno) {
        this.autore = autore;
        this.titolo = titolo;
        this.anno = anno;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                '}';
    }
}