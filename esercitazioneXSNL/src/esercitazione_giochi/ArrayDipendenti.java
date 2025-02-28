package esercitazione_giochi;
import java.util.Scanner;

public class ArrayDipendenti {
	public static void main(String[] args) {
		int[] numeri = new int[0];

		Scanner sc = new Scanner(System.in);
		String scelta;
		do
		{
			System.out.println("1) Aggiungi un dipendente");
			System.out.println("2) Elenca i dipendenti");
			System.out.println("3) Cerca i dipendenti");
			System.out.println("4) Elimina un dipendente");
			System.out.println("5) Esci");
			
			scelta = sc.nextLine();
			
	} while (!scelta.equals("5"));
	System.out.println("TERMINE PROGRAMMA");

}

}




