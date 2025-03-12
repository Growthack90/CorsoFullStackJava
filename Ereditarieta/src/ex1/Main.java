package ex1;

public class Main {

	public static void main(String[] args) {

		Persona p = new Persona("Mario", "Rossi", "RSSMRA80A01H501A");
			
		Dipendente d = new Dipendente();
	
		System.out.println(d);

		Dipendente d2 = new Dipendente("Mario", "Bianchi", "BNCMRA80A01H501B", "123456", "mario.bianchi@example.com");
		System.out.println(d2);

		System.out.println(p);
	}
	
}