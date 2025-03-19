import java.util.ArrayList;
import java.util.Scanner;

class Prenotazione {
    private int id;
    private String nomeCliente;
    private String data; // Formato: AAAA-MM-GG

    public Prenotazione(int id, String nomeCliente, String data) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Cliente: " + nomeCliente + ", Data: " + data;
    }
}

public class GestionePrenotazioniHotel {
    private static ArrayList<Prenotazione> prenotazioni = new ArrayList<>(); // utilizzato un ArrayList per memorizzare le prenotazioni
    private static int prossimoId = 1; // tiene traccia dell'ID autoincrementante

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n--- Gestione Prenotazioni Hotel ---");
            System.out.println("1. Aggiungi prenotazione");
            System.out.println("2. Visualizza prenotazioni");
            System.out.println("3. Cerca prenotazione per ID");
            System.out.println("4. Elimina prenotazione");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    aggiungiPrenotazione(scanner);
                    break;
                case 2:
                    visualizzaPrenotazioni();
                    break;
                case 3:
                    cercaPrenotazione(scanner);
                    break;
                case 4:
                    eliminaPrenotazione(scanner);
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);

        scanner.close();
    }

    private static void aggiungiPrenotazione(Scanner scanner) {
        System.out.print("Nome cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Data (AAAA-MM-GG): ");
        String data = scanner.nextLine();

        Prenotazione prenotazione = new Prenotazione(prossimoId++, nomeCliente, data);
        prenotazioni.add(prenotazione);
        System.out.println("Prenotazione aggiunta con ID: " + prenotazione.getId());
    }

    private static void visualizzaPrenotazioni() {
        if (prenotazioni.isEmpty()) {
            System.out.println("Nessuna prenotazione trovata.");
        } else {
            System.out.println("--- Prenotazioni ---");
            for (Prenotazione prenotazione : prenotazioni) {
                System.out.println(prenotazione);
            }
        }
    }

    private static void cercaPrenotazione(Scanner scanner) {
        System.out.print("ID prenotazione: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline

        for (Prenotazione prenotazione : prenotazioni) {
            if (prenotazione.getId() == id) {
                System.out.println(prenotazione);
                return;
            }
        }
        System.out.println("Prenotazione con ID " + id + " non trovata.");
    }

    private static void eliminaPrenotazione(Scanner scanner) {
        System.out.print("ID prenotazione da eliminare: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline

        prenotazioni.removeIf(prenotazione -> prenotazione.getId() == id);
        System.out.println("Prenotazione con ID " + id + " eliminata (se esistente).");
    }
}