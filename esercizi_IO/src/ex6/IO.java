package ex6;

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

	public static String getString() {
		hasError = false;
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static int getInt() {
		hasError = false;
		int res = 0;
		String datos = getString();
		try {
			res = Integer.parseInt(datos);
			hasError = false;
		} catch (NumberFormatException e) {
			hasError = true;
		}
//tutto fatto... devo solo restituire il risultato
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
//tutto fatto... devo solo restituire il risultato
		return res;
	}

	public static double getDouble(String msg) {
		println(msg);
		return getDouble();
	}

}
