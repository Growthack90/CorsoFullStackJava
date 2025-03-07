import java.io.Serializable;

/*
 * L'interfaccia Serializable è un'interfaccia marker (non contiene metodi) che indica 
 * che gli oggetti di questa classe possono essere convertiti in un flusso di byte (serializzati) 
 *e ricostruiti da quel flusso (deserializzati). Questo è essenziale per salvare oggetti in file 
 *o trasmetterli attraverso la rete.
 *La classe implementa Serializable in modo che i suoi oggetti possano essere salvati e recuperati
 */
public class Persona implements Serializable {  // implementa l'interfaccia serializable che rendegli oggetti della classe Persona oggetti serilizzabili
	// dichiarazione delle variabili di istanza
	String nome;	
	int anni;
	
	// Il costruttore permette di inizializzare gli oggetti Persona
	public Persona(String nome, int anni) {
        this.nome = nome; // assegna il valore del parametro nome alla variabile di istanza nome
        this.anni = anni;
    }
	// "this" viene usato per fare riferimento alla variabile di istanza della classe, per distinguerla dal parametro del costruttore
	
	
	// Metodi getter e setter: modi per accedere e modificare le variabili di istanza della classe
	// - getter: metodo che restituisce il valore della variabile di istanza
	// - setter: metodo che imposta il valore della variabile di istanza
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	
}
