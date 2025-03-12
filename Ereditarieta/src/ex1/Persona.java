package ex1;

public class Persona {
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public Persona(String nome, String cognome, String codiceFiscale) {
		this.nome = "";
		this.cognome = "";
		this.codiceFiscale = "";
		// dopo aver impostato i valori di base
		// uso i metodi per impostare i valori passati come argomenti
		// in modo che, se venissero passati valori non validi i filtri eventuali li bloccherebbero		
		this.setNome(nome);
		this.setCognome(cognome);
		this.setCodiceFiscale(codiceFiscale);
		
	}
	
	public Persona() {
		this("", "", "");
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {		
		this.cognome = cognome;
	}
	
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
	}
}