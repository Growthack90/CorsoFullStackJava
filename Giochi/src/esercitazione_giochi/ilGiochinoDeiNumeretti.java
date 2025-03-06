package esercitazione_giochi;
import java.util.Scanner;

public class ilGiochinoDeiNumeretti {
	public static void main(String[] args) {
		int[] numeri = new int[0];

		Scanner sc = new Scanner(System.in);
		String scelta;
		do
		{
			System.out.println("1) Aggiungi un numero");
			System.out.println("2) Vedi lista numeri");
			System.out.println("3) Modifica un numero in posizione");
			System.out.println("4) Elimina un numero in posizione");
			System.out.println("5) Esci");
			
			scelta = sc.nextLine();
			if (scelta.equals("1"))
			{
				int n = numeri.length;
				int[] arrayTemporaneoDeStoCazzoDeNumeri = numeri;
				numeri = new int[n+1];
				for (int i = 0; i < n; i++) {
					numeri[i] = arrayTemporaneoDeStoCazzoDeNumeri[i];
				}
				System.out.println("Inserisci il numero da aggiungere");
				numeri[n] = sc.nextInt();
				sc.nextLine();
			}
			else if (scelta.equals("2"))
			{
				System.out.println("Devo visualizzare la Lista numeri");
				int n = numeri.length;
				for (int i=0;i<n;i++)
				{
					System.out.println(numeri[i]);					
				}
			}
			else if (scelta.equals("3"))
			{
				System.out.println("In che posizione vuoi modificare il numero?");
				int posizione = sc.nextInt();
				sc.nextLine();
				if (posizione < 0 || posizione >= numeri.length) 
				{
					System.out.println("Posizione non valida");
				}
				else
				{
					System.out.println("In questa posizione c'è il numero " + numeri[posizione]);
					System.out.println("Inserisci il nuovo numero");
					numeri[posizione] = sc.nextInt();
					sc.nextLine();
				}
			}
			
			else if (scelta.equals("4")) {
				
				System.out.println("In che posizione vuoi eliminare il numero?");
				int posizione = sc.nextInt();
				sc.nextLine();
				if (posizione < 0 || posizione >= numeri.length) 
				{
					System.out.println("Posizione non valida");
				}
				else
				{
													  // 0   1   2
					//arrayTemporaneoDeStoCazzoDeNumeri [4] [12][7]
					//numeri             				[4] [  ]
					// posizione = 1
					
					int[] arrayTemporaneoDeStoCazzoDeNumeri = numeri;
					numeri = new int[numeri.length-1];
					int j = 0;
					for (int i = 0; i < arrayTemporaneoDeStoCazzoDeNumeri.length; i++) {
						if (i != posizione) {
							numeri[j] = arrayTemporaneoDeStoCazzoDeNumeri[i];
							j++;
						}
						
					}
				}
				
			} else if (!scelta.equals("5")) {
				System.out.println("Scelta non valida");
			}
			
			if (!scelta.equals("5")) {
				System.out.println("Premi invio per continuare");
				sc.nextLine();
			}
		} while (!scelta.equals("5"));
		System.out.println("Arrivederci");
	
	}
	
}


