package it.yourcompany.GestioneBiblioteca;

public class Libro {
    int id;
    String titolo;
    String autore;
    int annoPubblicazione;
    boolean disponibile;

    public Libro(int id, String titolo, String autore, int annoPubblicazione, boolean disponibile) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = disponibile;
    }

    public void mostraDettagli() {
        System.out.println("ID: " + id + " | Titolo: " + titolo + " | Autore: " + autore + " | Anno: " +
                annoPubblicazione + " | Disponibile: " + (disponibile ? "Si" : "No"));
    }
}