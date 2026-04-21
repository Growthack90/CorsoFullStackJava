package Dati;
import java.util.Scanner;

public class IO2 {
		
	public static void println(Object o) {
		System.out.println(o);
	}
	

	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static String getString()
	{
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public static int getInt(String mess, String messaggioDIErrore) {
		boolean isInt;
		int res = 0;
		
		do
		{
			println(mess); // Stampo il messaggio (che mi è stato passato come parametro)
			String datos = getString(); // Uso getString() per farmi inserire un dato, 
			// che in questo momento acquisto come stringa
			// MA spero che venga inserita una stringa numerica intera
			// dopo dovrò convertirla 
			// Arrivato qui, devo convertire la stringa in un intero
			// Posso usare la classe Integer e il suo metodo statico parseInt
			// parseInt prende una stringa e la converte in un intero, se questa è numerica
			try 
			{
				res = Integer.parseInt(datos);
				isInt = true;
			}
			catch (NumberFormatException e) {
				println(messaggioDIErrore);
				isInt = false;
			}
		} while (!isInt);
		// tutto fatto... devo solo restituire il risultato
		return res;
	}
		
}