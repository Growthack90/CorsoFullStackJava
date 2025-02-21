package classiMie;

import java.util.Scanner;

public class io {

	// COMANDO 1
	public static void print(Object s) { // Accetta un Object come parametro, ovvero qualsiasi tipo di dato.
		System.out.print(s);
	}

	// COMANDO 2
	public static void println(Object s) {
		System.out.println(s);
	}

	
	
	// COMANDO 3
	public static int inputInt(String richiesta) {
	    println(richiesta);
	    Scanner in = new Scanner(System.in);
	    int ris = in.nextInt();
	    in.nextLine(); // Consuma il \n
	    return ris;
	}
	

	// COMANDO 4
	public static String inputString() {
		Scanner in = new Scanner(System.in);
		String ris = in.nextLine();
		return ris;
	}
	
	public static String inputString(String richiesta) {
		println(richiesta);
		return inputString();
	}
	
}
