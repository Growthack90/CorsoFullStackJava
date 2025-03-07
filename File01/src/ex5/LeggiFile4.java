/***********************************************************/
// VERSIONE CON AGGIUNTA DI INPUT PER SCEGLIERE IL FILE DA LEGGERE
/***********************************************************/
package ex5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import classiMie.IO;

public class LeggiFile4 {

    public static void main(String[] args) {

        int scelta;
        do {
            IO.println("1) Leggi un file dalla lista");
            IO.println("2) Leggi un file specifico");
            IO.println("3) Esci");
            scelta = IO.getInt("Cosa vuoi fare?");

            if (scelta == 1) {
                leggiFileDaLista();
            } else if (scelta == 2) {
                leggiFileSpecifico();
            }

        } while (scelta != 3);
        IO.println("Arrivederci!");
    }

    public static void leggiFileDaLista() {
        String cartella = "CC:\\projects\\JAVA\\wp\\File01\\tests\\"; // !!! inserisci il percorso reale a cui vuoi fare riferimento !!!
        File dir = new File(cartella);
        File[] files = dir.listFiles();
        ArrayList<String> nomiFile = new ArrayList<>();

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                nomiFile.add(file.getName());
            }
        }

        for (int i = 0; i < nomiFile.size(); i++) {
            IO.println((i + 1) + " ] " + nomiFile.get(i));
        }

        int sceltaFile = IO.getInt("Quale file vuoi leggere?");
        if (sceltaFile < 1 || sceltaFile > nomiFile.size()) {
            IO.println("Scelta non valida!");
            return;
        }

        String nomeFile = cartella + nomiFile.get(sceltaFile - 1);
        leggiFile(nomeFile);
    }

    public static void leggiFileSpecifico() {
        String cartella = "CC:\\projects\\JAVA\\wp\\File01\\tests\\"; // !!! inserisci il percorso reale a cui vuoi fare riferimento !!!
        String nomeFile = IO.getString("Inserisci il nome del file (compresa estensione .txt):");
        String percorsoCompleto = cartella + nomeFile;
        leggiFile(percorsoCompleto);
    }

    public static void leggiFile(String nomeFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                IO.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura: " + e.getMessage());
        }

        IO.getString("PREMI INVIO PER TORNARE AL MENU...");
    }
}