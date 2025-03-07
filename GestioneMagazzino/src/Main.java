import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino("magazzino.txt");
        Scanner scanner = new Scanner(System.in);

        int scelta;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Visualizza prodotti");
            System.out.println("3. Cerca prodotto");
            System.out.println("4. Aggiorna quantità prodotto");
            System.out.println("5. Rimuovi prodotto");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome prodotto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Quantità: ");
                    double quantita = scanner.nextDouble();
                    magazzino.aggiungiProdotto(new Prodotto(nome, categoria, prezzo, quantita));
                    break;
                case 2:
                    magazzino.visualizzaProdotti();
                    break;
                case 3:
                    System.out.print("Nome prodotto da cercare: ");
                    String nomeCerca = scanner.nextLine();
                    magazzino.cercaProdotto(nomeCerca);
                    break;
                case 4:
                    System.out.print("Nome prodotto da aggiornare: ");
                    String nomeAggiorna = scanner.nextLine();
                    System.out.print("Nuova quantità: ");
                    double nuovaQuantita = scanner.nextDouble();
                    magazzino.aggiornaQuantita(nomeAggiorna, nuovaQuantita);
                    break;
                case 5:
                    System.out.print("Nome prodotto da rimuovere: ");
                    String nomeRimuovi = scanner.nextLine();
                    magazzino.rimuoviProdotto(nomeRimuovi);
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
}