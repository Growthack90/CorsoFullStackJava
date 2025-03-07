package ex4;

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