import java.util.Scanner;

public class gestErrori {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		try {
				System.out.println("Inserisci un numero: ");
				numero = sc.nextInt();
				sc.nextLine();
				int risultato = 100 / numero;
				System.out.println("Il risultato è: " + risultato);	
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println("Perdindirindina! Non hai inserito un numero!");
			System.out.println("Normalmente JAVA direbbe:");
			e.printStackTrace();
			System.out.println("Ma noi siamo più gentili, quindi ti diciamo solo che non hai inserito un numero e soprattuto non blocchiamo il programma. VAI E SII FELICE!");
		}
	}

}