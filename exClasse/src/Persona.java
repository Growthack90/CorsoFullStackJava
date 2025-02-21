
public class Persona {
	public String nome;
	public String cognome;
	
	public void faccioQualcosa() {
		System.out.println("Ciao " + nome + " " + cognome);
	}
	
	public static final String AUTORE = "Maurizio FIGO Postiglione";

	public static void info() {
	System.out.println("Questa è una classe fighissima realizzata da " + AUTORE);
	}
	
}
