package ex1;

public class Dipendente extends Persona{
	
	private String matricola;
	private String email;
	
	public Dipendente(String nome, String cognome, String codiceFiscale, String matricola, String email) {
		super(nome, cognome, codiceFiscale);
		
		this.matricola = "";
		this.email = "";
		
		this.setMatricola(matricola);
		this.setEmail(email);
		// TODO Auto-generated constructor stub
	}
	
	public Dipendente() {
		this("", "", "", "", "");
		
	}
	
	
	public String getMatricola() {
		return matricola;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "["+this.getNome()+" "+this.getCognome()+" "+this.getCodiceFiscale()+" "+this.getMatricola()+" "+this.getEmail()+"]";
		
	}
	
}