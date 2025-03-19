package it.yourcompany.GestioneBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestoreBiblioteca gestore = new GestoreBiblioteca();
        DatabaseManager dbManager = new DatabaseManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sistema di Gestione Biblioteca ---");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Mostra tutti i libri");
            System.out.println("3. Cerca un libro");
            System.out.println("4. Prestito libro");
            System.out.println("5. Restituisci libro");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci autore: ");
                    String autore = scanner.nextLine();
                    System.out.println("Inserisci anno pubblicazione: ");
                    int anno = scanner.nextInt();
                    scanner.nextLine();

                    int nextId = gestore.getCatalogoSize() + 1;
                    Libro libro = new Libro(nextId, titolo, autore, anno, true);
                    gestore.aggiungiLibro(libro);
                    dbManager.salvaLibro(libro);
                    break;
                case 2:
                    gestore.mostraLibri();
                    break;
                case 3:
                    System.out.println("Inserisci titolo libro:");
                    gestore.cercaLibro(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Inserisci ID libro:");
                    int idPrestito = scanner.nextInt();
                    scanner.nextLine();
                    gestore.prestitoLibro(idPrestito, new Lettore(1, "Mario", "Rossi", "mario@email.com"));
                    break;
                case 5:
                    System.out.println("Inserisci ID libro:");
                    int idRestituzione = scanner.nextInt();
                    scanner.nextLine();
                    gestore.restituisciLibro(idRestituzione);
                    break;
                case 6:
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}