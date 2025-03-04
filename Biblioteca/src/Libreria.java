/**********************************************************/
// Versione con Array statico
/**********************************************************/
import java.util.Scanner;
import Dati.Libro;

public class Libreria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro[] libri = new Libro[100]; // Dimensione fissa dell'array
        int numeroLibri = 0;

        int scelta;
        do {
            System.out.println("\n--- Menu Libreria ---");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Visualizza libri");
            System.out.println("3. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    if (numeroLibri < libri.length) {
                        aggiungiLibro(scanner, libri, numeroLibri);
                        numeroLibri++;
                    } else {
                        System.out.println("Libreria piena.");
                    }
                    break;
                case 2:
                    visualizzaLibri(libri, numeroLibri);
                    break;
                case 3:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 3);

        scanner.close();
    }

    private static void aggiungiLibro(Scanner scanner, Libro[] libri, int indice) {
        System.out.print("Autore: ");
        String autore = scanner.nextLine();
        System.out.print("Titolo: ");
        String titolo = scanner.nextLine();
        System.out.print("Anno: ");
        int anno = scanner.nextInt();
        scanner.nextLine();

        libri[indice] = new Libro(autore, titolo, anno);
        System.out.println("Libro aggiunto con successo!");
    }

    private static void visualizzaLibri(Libro[] libri, int numeroLibri) {
        if (numeroLibri == 0) {
            System.out.println("Nessun libro presente in libreria.");
        } else {
            System.out.println("\n--- Elenco Libri ---");
            for (int i = 0; i < numeroLibri; i++) {
                System.out.println(libri[i]);
            }
        }
    }
}


/**********************************************************/
//// Versione con Dynamic Array
/**********************************************************/



/**********************************************************/
// // Versione con ArrayList
/**********************************************************/
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import Dati.Libro;
//
//public class Libreria {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Libro> libri = new ArrayList<>();
//
//        int scelta;
//        do {
//            System.out.println("\n--- Menu Libreria ---");
//            System.out.println("1. Aggiungi libro");
//            System.out.println("2. Visualizza libri");
//            System.out.println("3. Esci");
//            System.out.print("Scelta: ");
//            scelta = scanner.nextInt();
//            scanner.nextLine(); // Consuma il newline
//
//            switch (scelta) {
//                case 1:
//                    aggiungiLibro(scanner, libri);
//                    break;
//                case 2:
//                    visualizzaLibri(libri);
//                    break;
//                case 3:
//                    System.out.println("Uscita dal programma.");
//                    break;
//                default:
//                    System.out.println("Scelta non valida.");
//            }
//        } while (scelta != 3);
//
//        scanner.close();
//    }
//
//    // Implementazione metodi aggiungiLibro e visualizzaLibri per gestire la libreria
//    private static void aggiungiLibro(Scanner scanner, List<Libro> libri) {
//        System.out.print("Autore: ");
//        String autore = scanner.nextLine();
//        System.out.print("Titolo: ");
//        String titolo = scanner.nextLine();
//        System.out.print("Anno: ");
//        int anno = scanner.nextInt();
//        scanner.nextLine(); // Consuma il newline
//
//        Libro libro = new Libro(autore, titolo, anno);
//        libri.add(libro);
//        System.out.println("Libro aggiunto con successo!");
//    }
//
//    private static void visualizzaLibri(List<Libro> libri) {
//        if (libri.isEmpty()) {
//            System.out.println("Nessun libro presente in libreria.");
//        } else {
//            System.out.println("\n--- Elenco Libri ---");
//            for (Libro libro : libri) {
//                System.out.println(libro);
//            }
//        }
//    }
//}