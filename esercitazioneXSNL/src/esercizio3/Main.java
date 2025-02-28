// ESEMPIO 1
//package esercizio3;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		int num = IO.getInt("Inserisci un numero", "A stronzo, metti n'intero!");
//		IO.println("Hai inserito il numero " + num);
//	}
//
//}

//ESEMPIO 1 (modificato)
package esercizio3;

public class Main {

	public static void main(String[] args) {
		
		double num = IO.getDouble("Inserisci un numero: ");
		
		if (IO.getHasError() ) {
			IO.println("Errore: il dato inserito non è un valido");
			return;
		}
		
		IO.println("Hai inserito il numero " + num);
	}

}
