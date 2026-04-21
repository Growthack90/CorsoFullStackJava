/**********************************************************/
// Versione con Array statico
/**********************************************************/
import java.util.Scanner;
import Dati.Libro;

public class LibreriaArray {

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






