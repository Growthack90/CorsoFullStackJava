// "GET" AND "SET" METHODS

// Metodi Set (o setter):
// Sono metodi pubblici che accettano un parametro dello stesso tipo dell'attributo e non restituiscono alcun valore (void).

// Metodi Get (o getter):
// Sono metodi pubblici che non accettano parametri e restituiscono un valore dello stesso tipo dell'attributo.'

package esercitazione_giochi;

public class Dipendente {
    private String nome;
    private String cognome;
    private String email;
    private int anni;

    public Dipendente() {
        this.nome = "";
        this.cognome = "";
        this.email = "";
        this.anni = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {  // Aggiunto getter per l'email
        return this.email;
    }

    public void setAnni(int anni) {
        if (anni >= 0 && anni <= 100) {
            this.anni = anni;
        } else {
            System.err.println("Errore: età non valida."); // Segnalazione di errore
        }
    }

    public int getAnni() {
        return this.anni;
    }

    
    // Main per testare la classe Dipendente
    public static void main(String[] args) {
    	// Creazione e visualizzazione di un dipendente
        Dipendente dipendente1 = new Dipendente();
        dipendente1.setNome("Mario");
        dipendente1.setCognome("Rossi");
        dipendente1.setEmail("mario.rossi@gmail.com");
        dipendente1.setAnni(35);

        System.out.println("Nome: " + dipendente1.getNome());
        System.out.println("Cognome: " + dipendente1.getCognome());
        System.out.println("Email: " + dipendente1.getEmail());
        System.out.println("Anni: " + dipendente1.getAnni());
    }
}