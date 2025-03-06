package ex3;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import classiMie.IO;

public class CreaFile {
    public static void main(String[] args) {
 
 
        String nomeFile;
        File F;
        do
        {	   
        	nomeFile = IO.getString("Inserisci il nome del file da creare: ");
        	F = new File(nomeFile);
			if (F.exists()) {
				System.out.println("Il file esiste già!");			
			}
        }while (F.exists());
 
 
        String testo = IO.getString("Inserisci il testo che vuoi salvare e premi INVIO");
 
        try {
    			FileWriter writer = new FileWriter(nomeFile, true);
        	    writer.write(testo);
 
        	    writer.close();
        	    System.out.println("Scrittura completata! Il file è stato creato.");
        } 
       catch (IOException e) 
       {
            System.out.println("Errore nella scrittura: " + e.getMessage());
        }
    }
}
