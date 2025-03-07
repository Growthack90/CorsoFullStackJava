/***********************************************************/
// VERSIONE MODIFICATA CON SOSTITUZIONE di FileReader con BufferedReader
/***********************************************************/
package ex5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
 
import classiMie.IO;
 
public class LeggiFile2 {
 
	  public static void main(String[] args) {
 
		int scelta;
		do {
			IO.println("1) Leggi un file");
			IO.println("2) Esci");
			scelta = IO.getInt("Cosa vuoi fare?");
			if (scelta==1)
			{
						// !!! inserisci il percorso reale a cui vuoi fare riferimento !!!
						String cartella = "C:\\projects\\JAVA\\wp\\File01\\tests\\";
						// Elenchiamo i file nella cartella indicata nella variabile cartella
						File dir = new File(cartella); // dir diventa l'oggetto che gestisce la cartella cartella ("C:\\projects\\JAVA\\wp\\File01\\tests\\") 
 
 
						File[] files = dir.listFiles(); // file è un array fi File (File[]) in cui dentro ci saranno i file che sono dentro cartella
						// Adesso elenchiamo i file, ma solo i file e con estensione .txt (perchè normalmente mi darà la lista di qualunque file o cartella sotto)
						ArrayList<String> nomiFile = new ArrayList<>();
 
						for (int i = 0; i < files.length; i++) {
							if (files[i].isFile())
							{
								String nomeFile = files[i].getName();
								if (nomeFile.endsWith(".txt"))
								{
									//IO.println(files[i].getName());
									nomiFile.add(nomeFile);
								}
 
							}
						}
 
						for (int i = 0; i < nomiFile.size(); i++) {
							IO.println((i+1)+" ] "+nomiFile.get(i));
						}
 
						IO.println("Quale file vuoi leggere?");
						int sceltafile = IO.getInt();
						if (scelta < 1 || scelta > nomiFile.size()) {
							IO.println("Scelta non valida!");
							return;
						}
						// dentro l'ArrayList gli indici partono da 0 non da 1
						sceltafile--;
						String nomeFile = cartella + nomiFile.get(sceltafile);
 
 
						BufferedReader reader;
 
						try
						{
							reader = new BufferedReader(new FileReader(nomeFile));
 
							String linea;
 
							do {
								linea = reader.readLine();
								if (linea != null)  {
									IO.println(linea);
								}
							} while (linea != null);
 
 
						} catch (IOException e) {
							System.out.println("Errore nella lettura: " + e.getMessage());
 
						}
 
						IO.getString("PREMI INVIO PER TORNARE AL MENU...");
			}
 
		} while (scelta != 2);
		IO.println("Arrivederci!");
	  }
}