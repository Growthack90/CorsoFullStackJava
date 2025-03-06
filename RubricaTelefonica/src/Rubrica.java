import java.util.ArrayList;
import java.util.Scanner;

public class Rubrica {
    private ArrayList<Contatto> contatti;
    private Scanner scanner;

    public Rubrica() {
        contatti = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void aggiungiContatto() {
        System.out.print("Inserisci il nome del contatto: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il numero di telefono: ");
        String numeroTelefono = scanner.nextLine();
        Contatto nuovoContatto = new Contatto(nome, numeroTelefono);
        contatti.add(nuovoContatto);
        System.out.println("Contatto aggiunto con successo!");
    }

    public void visualizzaContatti() {
        if (contatti.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Contatti in rubrica:");
            for (Contatto contatto : contatti) {
                System.out.println(contatto);
            }
        }
    }

    public void cercaContatto() {
        System.out.print("Inserisci il nome del contatto da cercare: ");
        String nomeCercato = scanner.nextLine();
        for (Contatto contatto : contatti) {
            if (contatto.getNome().equalsIgnoreCase(nomeCercato)) {
                System.out.println("Contatto trovato: " + contatto);
                return;
            }
        }
        System.out.println("Contatto non trovato.");
    }

    public void eliminaContatto() {
        System.out.print("Inserisci il nome del contatto da eliminare: ");
        String nomeElimina = scanner.nextLine();
        contatti.removeIf(contatto -> contatto.getNome().equalsIgnoreCase(nomeElimina));
        System.out.println("Contatto eliminato.");
    }

    public void esegui() {
        int scelta;
        do {
            System.out.println("\n--- Rubrica Telefonica ---");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Visualizza contatti");
            System.out.println("3. Cerca contatto");
            System.out.println("4. Elimina contatto");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    aggiungiContatto();
                    break;
                case 2:
                    visualizzaContatti();
                    break;
                case 3:
                    cercaContatto();
                    break;
                case 4:
                    eliminaContatto();
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

    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.esegui();
    }
}