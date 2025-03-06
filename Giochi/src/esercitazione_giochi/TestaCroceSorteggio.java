// GIOCO TESTA O CROCE (correggere)
package esercitazione_giochi;

import java.util.Random;

import java.util.Scanner;

public class TestaCroceSorteggio {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuti al gioco Testa o Croce con sorteggio!");

        while (true) {
            // Sorteggio iniziale per decidere chi sfida chi
            int sorteggio = random.nextInt(2); // 0 = Utente sfida PC, 1 = PC sfida Utente
            boolean utenteSfida = (sorteggio == 0);

            String sfidante = utenteSfida ? "utente" : "computer";
            System.out.println("Il " + sfidante + " sfiderà l'altro!");

            // Scelta del giocatore che sfida
            String sceltaSfidante;
            if (utenteSfida) {
                // Scelta dell'utente
                while (true) {
                    System.out.print("Scegli Testa (T) o Croce (C): ");
                    sceltaSfidante = scanner.nextLine().toUpperCase();
                    if (sceltaSfidante.equals("T") || sceltaSfidante.equals("C")) {
                        break;
                    } else {
                        System.out.println("Scelta non valida. Riprova.");
                    }
                }
            } else {
                // Scelta del computer
                int sceltaCasuale = random.nextInt(2);
                sceltaSfidante = (sceltaCasuale == 0) ? "T" : "C";
                System.out.println("Il computer ha scelto: " + sceltaSfidante);
            }

            // Scelta dell'altro giocatore
            String sceltaAltroGiocatore = utenteSfida ? ((sceltaSfidante.equals("T")) ? "C" : "T") : ((sceltaSfidante.equals("T")) ? "C" : "T");
            System.out.println((utenteSfida ? "Computer" : "Utente") + " sceglie automaticamente: " + sceltaAltroGiocatore);

            // Determina il vincitore
            if (sceltaSfidante.equals(sceltaAltroGiocatore)) {
                System.out.println("Pareggio!");
            } else {
                System.out.println((utenteSfida ? "Hai vinto!" : "Hai perso!"));
            }

            // Chiedi se l'utente vuole rigiocare
            System.out.print("Vuoi rigiocare? (s/n): ");
            String risposta = scanner.nextLine().toLowerCase();
            if (!risposta.equals("s")) {
                break;
            }
        }

        System.out.println("Grazie per aver giocato!");
        scanner.close();
    }
}
