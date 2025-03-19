package it.yourcompany.GestioneBiblioteca;

import java.util.ArrayList;

public class GestoreBiblioteca {
    private ArrayList<Libro> catalogo = new ArrayList<>();

    public void aggiungiLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro aggiunto con successo.");
    }

    public void mostraLibri() {
        if (catalogo.isEmpty()) {
            System.out.println("Nessun libro disponibile.");
        } else {
            for (Libro libro : catalogo) {
                libro.mostraDettagli();
            }
        }
    }

    public void cercaLibro(String titolo) {
        for (Libro libro : catalogo) {
            if (libro.titolo.equalsIgnoreCase(titolo)) {
                libro.mostraDettagli();
                return;
            }
        }
        System.out.println("Libro non trovato.");
    }

    public void prestitoLibro(int idLibro, Lettore lettore) {
        for (Libro libro : catalogo) {
            if (libro.id == idLibro && libro.disponibile) {
                libro.disponibile = false;
                System.out.println("Libro prestato a " + lettore.nome + " " + lettore.cognome);
                return;
            }
        }
        System.out.println("Libro non disponibile.");
    }

    public void restituisciLibro(int idLibro) {
        for (Libro libro : catalogo) {
            if (libro.id == idLibro && !libro.disponibile) {
                libro.disponibile = true;
                System.out.println("Libro restituito.");
                return;
            }
        }
        System.out.println("ID non valido o libro già disponibile.");
    }

    public int getCatalogoSize() {
        return catalogo.size();
    }
}