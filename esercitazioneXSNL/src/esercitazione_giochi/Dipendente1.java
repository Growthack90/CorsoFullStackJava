/************************************************/
// GESTIONE DEGLI ERRORI ED ECCEZIONI
/************************************************/

//package	esercitazione_giochi;
//
//import java.util.Scanner;
//
//public class Dipendente1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int anni = 0;
//				
//		boolean errore = false;
////		boolean errore;
//		do
//		{
//			System.out.println("Inserisci il numero di anni: ");
//			try
//			{
////				errore = false;
//				anni  = sc.nextInt();
//				sc.nextLine();		
//				int giorni = anni * 365;
//				int ore = giorni * 24;
//				int minuti = ore * 60;
//				int secondi = minuti * 60;
//				System.out.println("Esisti da " + anni + " anni e quindi da " + giorni + " giorni, o anche da " + ore + " ore, o ancora da " + minuti + " minuti, o infine da " + secondi + " secondi.");
//			}
//			catch (java.util.InputMismatchException e)
//			{
//				System.out.println("ORCA L'OCA!!! C'è stato un errore di inserimento... sei conglione! Il codice di errore e': "+ e.toString());
//				errore = true;
//				sc.nextLine();	
//			}
//		} while (errore);
//		
//		System.out.println("Ciao ciao!");
//	}
//
//}

//*************************************************************//

package	esercitazione_giochi;
import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Dipendente1 {

public static void main(String[] args) {
double numero;
Scanner sc = new Scanner(System.in);
System.out.println("Inserisci un numero: ");
try {
numero = sc.nextDouble();
sc.nextLine();
double risultato = 100 / numero;
System.out.println("Il risultato è: " + risultato);
}
catch (ArithmeticException | InputMismatchException e)
{
System.out.println("Valore non consentito");
}

catch (Exception e) {
System.out.println("Errore generico");
} 
}

}

//*************************************************************//


