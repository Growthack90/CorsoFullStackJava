package ex1;

import java.io.FileWriter;
import java.io.IOException;

public class CreaFile {
    public static void main(String[] args) {
        String nomeFile = "nuovoFile.txt";

        try {
//    			FileWriter writer = new FileWriter(nomeFile);
    			FileWriter writer = new FileWriter(nomeFile, true); // non sovrascrive il file ma aggiunge testo
        	    writer.write("Questo file è stato creato da Java!\n");
        	    writer.write("E sta funzionando alla grande!\n");
        	    writer.close();
        	    System.out.println("Scrittura completata! Il file è stato creato.");
        } 
       catch (IOException e) 
       {
            System.out.println("Errore nella scrittura: " + e.getMessage());
        }
    }
}

