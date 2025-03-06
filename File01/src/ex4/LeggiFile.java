package ex4;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;

import classiMie.IO;

public class LeggiFile {

	  public static void main(String[] args) {
		String nomeFile = "pippo.txt";
		FileReader reader;
		String testo = "";
		
		File F = new File(nomeFile);
		
	    if (!F.exists()) {
            System.out.println("Il file non esiste! Per fare l'esperimento crealo, pirla!");
            return;
	    }
		
		
		try {
			reader = new FileReader(nomeFile);
			
			char carattere;
			
			do
			{
                carattere = (char) reader.read();
                if (carattere != (char)-1)
                {
                	testo += carattere;
                }
                
            } while (carattere != (char) -1);
			
			
			IO.println(testo);
			
		}	
		catch(
		IOException e)
		{
			System.out.println("Errore nella lettura: " + e.getMessage());
		}
	  }
}


/*************************************************************/
// VERSIONE EFFICIENTE RISPETTANDO LE BEST PRATIQUE
/*************************************************************/

/**
Modifiche e spiegazioni:

- Uso di BufferedReader:
Ho sostituito FileReader con BufferedReader. 
BufferedReader è più efficiente per la lettura di file perché legge i dati 
in blocchi (bufferizzati) anziché carattere per carattere.
Questo riduce il numero di chiamate al sistema operativo e migliora le prestazioni.

- Uso di StringBuilder:
Ho sostituito la concatenazione di stringhe con StringBuilder. 
La concatenazione di stringhe con += crea nuovi oggetti stringa ogni volta, 
il che può essere inefficiente per file di grandi dimensioni. 
StringBuilder è più efficiente per la costruzione di stringhe.

- Lettura riga per riga:
Ho modificato il ciclo di lettura per leggere il file riga per riga utilizzando 
reader.readLine(). Questo è un modo più comune e leggibile per leggere file di testo.
Ho aggiunto System.lineSeparator() per conservare le interruzioni di riga originali.

- Try-with-resources:
Ho utilizzato un blocco try-with-resources per gestire la chiusura del BufferedReader. Questo garantisce che il file venga chiuso correttamente anche in caso di eccezioni.

- Nome variabile più descrittivo:
Ho cambiato il nome della variabile F in file per una maggiore chiarezza.

- Rimozione di commento inappropriato:
Ho rimosso il termine "pirla" dal messaggio di errore, rendendo il messaggio più professionale.

- Miglioramenti generali:
Il codice è ora più efficiente, leggibile e robusto.
La gestione delle eccezioni è rimasta la stessa, ma il codice è ora meno incline a 
generare eccezioni grazie all'uso di BufferedReader e StringBuilder. 
 */



//package ex4;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.File;
//import java.io.BufferedReader; // Aggiunto per una lettura più efficiente
//import classiMie.IO; // Assumendo che IO.println sia una tua classe
//
//public class LeggiFile {
//
//    public static void main(String[] args) {
//        String nomeFile = "pippo.txt";
//        File file = new File(nomeFile); // Usa un nome di variabile più descrittivo
//
//        if (!file.exists()) {
//            System.out.println("Il file non esiste! Per fare l'esperimento crealo!"); // Rimosso "pirla"
//            return;
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // Usa try-with-resources
//            StringBuilder testo = new StringBuilder(); // Usa StringBuilder per efficienza
//
//            String line;
//            while ((line = reader.readLine()) != null) { // Lettura riga per riga
//                testo.append(line).append(System.lineSeparator()); // Aggiunge la riga e un newline
//            }
//
//            IO.println(testo.toString()); // Stampa il contenuto del file
//
//        } catch (IOException e) {
//            System.out.println("Errore nella lettura: " + e.getMessage());
//        }
//    }
//}


