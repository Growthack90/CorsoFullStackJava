/***********************************************************/
// VERIFICA ESISTENZA FILE (SE VERO STAMPA CONTENUTO)
/***********************************************************/
package ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import classiMie.IO;

public class LeggiFile6 {
    public static void main(String[] args) {

        String nomeFile = "infoDomenico.txt";
        File filecrist = new File(nomeFile);
        if (filecrist.exists()) {
            try (BufferedReader f = new BufferedReader(new FileReader(nomeFile))) { // try-with-resources
                String testo;
                while ((testo = f.readLine()) != null) {
                    IO.println(testo);
                }
                // f.close(); // Non necessario con try-with-resources
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            IO.println("Il file " + nomeFile + " non esiste.");
        }
    }
}