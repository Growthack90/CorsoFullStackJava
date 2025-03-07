/***********************************************************/
// RIEPILOGO CON BUFFEREDWRITER
/***********************************************************/
package ex5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
 
import classiMie.IO;
 
public class LeggiFile5 {
	public static void main(String[] args) {
 
		String nomeFile = "infoDomenico.txt";
		String informazioni = IO.getString("Scrivimi un segreto");
		IO.println("Ok mi hai detto questo \""+informazioni+"\"");
		File filecrist = new File(nomeFile);
		if (filecrist.exists())
		{
			IO.println("Il file esiste già!");
			return;
		}
		IO.println("Il file non esiste ora lo creo!");
 
		try {
			BufferedWriter f = new BufferedWriter(new FileWriter(nomeFile));
			f.write(informazioni);
			f.close();
			IO.println("FILE SALVATO CORRETTAMENTE");
		} 
		catch (IOException e) 
		{
 
			e.printStackTrace();
		}
	}
}