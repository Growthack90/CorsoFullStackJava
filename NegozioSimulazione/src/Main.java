import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Negozio negozio = new Negozio();
        Scanner scanner = new Scanner(System.in);

        int scelta;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Visualizza prodotti");
            System.out.println("3. Acquista prodotto");
            System.out.println("4. Rimuovi prodotto");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (scelta) {
                case 1:
                    System.out.print("Nome prodotto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Quantità: ");
                    int quantita = scanner.nextInt();
                    negozio.aggiungiProdotto(new Prodotto(nome, prezzo, quantita));
                    break;
                case 2:
                    negozio.visualizzaProdotti();
                    break;
                case 3:
                    System.out.print("Nome prodotto da acquistare: ");
                    String nomeAcquisto = scanner.nextLine();
                    System.out.print("Quantità da acquistare: ");
                    int quantitaAcquisto = scanner.nextInt();
                    negozio.acquistaProdotto(nomeAcquisto, quantitaAcquisto);
                    break;
                case 4:
                    System.out.print("Nome prodotto da rimuovere: ");
                    String nomeRimozione = scanner.nextLine();
                    negozio.rimuoviProdotto(nomeRimozione);
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