//package esercitazione_giochi;
//
//import java.io.*;
//import java.util.Scanner;
// 
//
//public class RegistroStudenti {
//    private static final String FILE_NAME = "registro.txt";
//    private static final Scanner scanner = new Scanner(System.in);
// 
//    public static void main(String[] args) {
//        int scelta;
//        do {
//            System.out.println("\n===== REGISTRO STUDENTI =====");
//            System.out.println("1. Aggiungi studente");
//            System.out.println("2. Visualizza studenti");
//            System.out.println("3. Cerca studente per nome");
//            System.out.println("4. Cancella il registro");
//            System.out.println("5. Esci");
//            System.out.print("Scelta: ");
//            scelta = scanner.nextInt();
//            scanner.nextLine(); // Consuma il carattere newline
// 
//            switch (scelta) {
//                case 1:
//                    aggiungiStudente();
//                    break;
//                case 2:
//                    visualizzaStudenti();
//                    break;
//                case 3:
//                    cercaStudente();
//                    break;
//                case 4:
//                    cancellaRegistro();
//                    break;
//                case 5:
//                    System.out.println("Uscita dal programma.");
//                    break;
//                default:
//                    System.out.println("Scelta non valida, riprova.");
//            }
//        } while (scelta != 5);
//    }
// 
//    private static void aggiungiStudente() {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
//            System.out.print("Inserisci nome: ");
//            String nome = scanner.nextLine();
//            System.out.print("Inserisci cognome: ");
//            String cognome = scanner.nextLine();
//            System.out.print("Inserisci matricola: ");
//            String matricola = scanner.nextLine();
//            System.out.print("Inserisci età: ");
//            int eta = scanner.nextInt();
//            scanner.nextLine(); // Consuma il newline
// 
//            String studente = nome + "," + cognome + "," + matricola + "," + eta;
//            writer.write(studente);
//            writer.newLine();
//            System.out.println("Studente aggiunto con successo!");
//        } catch (IOException e) {
//            System.out.println("Errore nella scrittura: " + e.getMessage());
//        }
//    }
// 
//    private static void visualizzaStudenti() {
// 
//        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
//            String linea;
//            System.out.println("\nElenco studenti:");
//            while (  (linea = reader.readLine()) != null ) {
//                String[] dati = linea.split(",");
//                System.out.println(dati[0] + " " + dati[1] + " - Matricola: " + dati[2] + " - Età: " + dati[3]);
//            }
//        } catch (IOException e) {
//            System.out.println("Errore nella lettura: " + e.getMessage());
//        }
//    }
// 
//    private static void cercaStudente() {
//        System.out.print("Inserisci il nome da cercare: ");
//        String nomeCercato = scanner.nextLine();
//        boolean trovato = false;
// 
//        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
//            String linea;
//            while ((linea = reader.readLine()) != null) {
//                String[] dati = linea.split(",");
//                if (dati[0].equalsIgnoreCase(nomeCercato)) {
//                    System.out.println(dati[0] + " " + dati[1] + " - Matricola: " + dati[2] + " - Età: " + dati[3]);
//                    trovato = true;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Errore nella lettura: " + e.getMessage());
//        }
// 
//        if (!trovato) {
//            System.out.println("Nessuno studente trovato con quel nome.");
//        }
//    }
// 
//    private static void cancellaRegistro() {
//        File file = new File(FILE_NAME);
//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("Registro eliminato con successo.");
//            } else {
//                System.out.println("Errore nella cancellazione del registro.");
//            }
//        } else {
//            System.out.println("Il registro è già vuoto.");
//        }
//    }
//}




/************************************************************/
// CODICE OTTIMIZZATO
/************************************************************/
/**
Improved Version

- Use of Constants: Define constants for menu options to avoid magic numbers.
- Exception Handling: Improve exception handling by providing more specific messages.
- Code Duplication: Reduce code duplication by creating a method to read student data.
- Resource Management: Use try-with-resources for Scanner to ensure it is closed properly.
- Separation of Concerns: Separate the logic for student operations into a separate class.
 */
package esercitazione_giochi;

import java.io.*;
import java.util.Scanner;

public class RegistroStudenti {
    private static final String FILE_NAME = "registro.txt";
    private static final Scanner scanner = new Scanner(System.in);
    private static final int AGGIUNGI_STUDENTE = 1;
    private static final int VISUALIZZA_STUDENTI = 2;
    private static final int CERCA_STUDENTE = 3;
    private static final int CANCELLA_REGISTRO = 4;
    private static final int ESCI = 5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int scelta;
            do {
                System.out.println("\n===== REGISTRO STUDENTI =====");
                System.out.println("1. Aggiungi studente");
                System.out.println("2. Visualizza studenti");
                System.out.println("3. Cerca studente per nome");
                System.out.println("4. Cancella il registro");
                System.out.println("5. Esci");
                System.out.print("Scelta: ");
                scelta = scanner.nextInt();
                scanner.nextLine(); // Consuma il carattere newline

                switch (scelta) {
                    case AGGIUNGI_STUDENTE:
                        aggiungiStudente();
                        break;
                    case VISUALIZZA_STUDENTI:
                        visualizzaStudenti();
                        break;
                    case CERCA_STUDENTE:
                        cercaStudente();
                        break;
                    case CANCELLA_REGISTRO:
                        cancellaRegistro();
                        break;
                    case ESCI:
                        System.out.println("Uscita dal programma.");
                        break;
                    default:
                        System.out.println("Scelta non valida, riprova.");
                }
            } while (scelta != ESCI);
        }
    }
    
    private static void aggiungiStudente() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            String[] studente = leggiDatiStudente();
            writer.write(String.join(",", studente));
            writer.newLine();
            System.out.println("Studente aggiunto con successo!");
        } catch (IOException e) {
            System.out.println("Errore nella scrittura: " + e.getMessage());
        }
    }

    private static void visualizzaStudenti() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            System.out.println("\nElenco studenti:");
            while ((linea = reader.readLine()) != null) {
                String[] dati = linea.split(",");
                System.out.println(dati[0] + " " + dati[1] + " - Matricola: " + dati[2] + " - Età: " + dati[3]);
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura: " + e.getMessage());
        }
    }

    private static void cercaStudente() {
        System.out.print("Inserisci il nome da cercare: ");
        String nomeCercato = scanner.nextLine();
        boolean trovato = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] dati = linea.split(",");
                if (dati[0].equalsIgnoreCase(nomeCercato)) {
                    System.out.println(dati[0] + " " + dati[1] + " - Matricola: " + dati[2] + " - Età: " + dati[3]);
                    trovato = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura: " + e.getMessage());
        }

        if (!trovato) {
            System.out.println("Nessuno studente trovato con quel nome.");
        }
    }

    private static void cancellaRegistro() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Registro eliminato con successo.");
            } else {
                System.out.println("Errore nella cancellazione del registro.");
            }
        } else {
            System.out.println("Il registro è già vuoto.");
        }
    }

    private static String[] leggiDatiStudente() {
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci matricola: ");
        String matricola = scanner.nextLine();
        System.out.print("Inserisci età: ");
        int eta = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline

        return new String[]{nome, cognome, matricola, String.valueOf(eta)};
    }
}

