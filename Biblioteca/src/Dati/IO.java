// ESEMPIO 1

//package esercizio3;
//
//import java.util.Scanner;
//
//public class IO {
//		
//	public static void println(Object o) {
//		System.out.println(o);
//	}
//	
//	public static void print(Object o) {
//		System.out.print(o);
//	}
//	
//	public static String getString()
//	{
//		Scanner scanner = new Scanner(System.in);
//		return scanner.nextLine();
//	}
//	
//	public static int getInt(String mess, String messaggioDIErrore) {
//		boolean isInt;
//		int res = 0;
//		
//		do
//		{
//			println(mess); // Stampo il messaggio (che mi è stato passato come parametro)
//			String datos = getString(); // Uso getString() per farmi inserire un dato, 
//			// che in questo momento acquisto come stringa
//			// MA spero che venga inserita una stringa numerica intera
//			// dopo dovrò convertirla 
//			// Arrivato qui, devo convertire la stringa in un intero
//			// Posso usare la classe Integer e il suo metodo statico parseInt
//			// parseInt prende una stringa e la converte in un intero, se questa è numerica
//			try 
//			{
//				res = Integer.parseInt(datos);
//				isInt = true;
//			}
//			catch (NumberFormatException e) {
//				println(messaggioDIErrore);
//				isInt = false;
//			}
//		} while (!isInt);
//		// tutto fatto... devo solo restituire il risultato
//		return res;
//	}
//		
//}


//ESEMPIO 1 (modificato)
//package esercizio3;
//
//import java.util.Scanner;
//
//public class IO {
//
//	private static boolean hasError;
//
//	public static boolean getHasError() {
//		return hasError;
//	}
//
//	public static void println(Object o) {
//		System.out.println(o);
//	}
//
//	public static void print(Object o) {
//		System.out.print(o);
//	}
//
//	public static String getString() {
//		hasError = false;
//		Scanner scanner = new Scanner(System.in);
//		return scanner.nextLine();
//	}
//
//	public static int getInt() {
//		hasError = false;
//		int res = 0;
//		String datos = getString();
//		try {
//			res = Integer.parseInt(datos);
//			hasError = false;
//		} catch (NumberFormatException e) {
//			hasError = true;
//		}
//// tutto fatto... devo solo restituire il risultato
//		return res;
//	}
//
//	public static int getInt(String msg) {
//		println(msg);
//		return getInt();
//	}
//
//	public static double getDouble() {
//		hasError = false;
//		double res = 0;
//		String datos = getString();
//		datos = datos.replace(',', '.');
//		try {
//			res = Double.parseDouble(datos);
//			hasError = false;
//		} catch (NumberFormatException e) {
//			hasError = true;
//		}
//// tutto fatto... devo solo restituire il risultato
//		return res;
//	}
//
//	public static double getDouble(String msg) {
//		println(msg);
//		return getDouble();
//	}
//
//}


package Dati;
import java.util.Scanner;

public class IO {
		
	private static boolean hasError;
	
	public static boolean getHasError() {
		return hasError;
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public static void print(Object o) {
		System.out.print(o);
	}

	public static String getString()
	{
		hasError = false;
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public static String getString(String msg) {
		println(msg);
		return getString();
	}
	
	
	public static int getInt() {
		hasError = false;
		int res = 0;
		String datos = getString();		
		try 
		{
			res = Integer.parseInt(datos);	
			hasError = false;
		}
		catch (NumberFormatException e) 
		{
			hasError = true;
		}
		// tutto fatto... devo solo restituire il risultato
		return res;
	}
	
	public static int getInt(String msg) {
		println(msg);
		return getInt();
	}
	
	public static double getDouble() {
		hasError = false;
		double res = 0;
		String datos = getString();
		datos = datos.replace(',', '.');
		try {
			res = Double.parseDouble(datos);
			hasError = false;
		} catch (NumberFormatException e) {
			hasError = true;
		}
		// tutto fatto... devo solo restituire il risultato
		return res;
	}
	
	public static double getDouble(String msg) {
		println(msg);
		return getDouble();
	}
	
	public static char getChar() {
		hasError = false;
		String datos = getString();
		if (datos.length() == 0) {
			hasError = true;
			return ' ';
		}
		return datos.charAt(0);
	}
	
	public static char getChar(String msg) {
		println(msg);
		return getChar();
	}
	
	public static boolean getBoolean() {
		hasError = false;
		String datos = getString();
		if (datos.equalsIgnoreCase("si") || datos.equalsIgnoreCase("s") || datos.equalsIgnoreCase("yes")
				|| datos.equalsIgnoreCase("y")) {
			return true;
		}
		if (datos.equalsIgnoreCase("no") || datos.equalsIgnoreCase("n")) {
			return false;
		}
		hasError = true;
		return false;
	}
	
	public static boolean getBoolean(String msg) {
		println(msg);
		return getBoolean();
	}
	

}


