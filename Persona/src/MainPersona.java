
public class MainPersona {
    // Attributi della classe
    private String nome;
    private String cognome;
    private int eta;
    private String indirizzo;

    // Costruttore
    public MainPersona(String nome, String cognome, int eta, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.indirizzo = indirizzo;
    }

    // Metodi getter (per accedere agli attributi)
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    // Metodo per stampare le informazioni sulla persona
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);
        System.out.println("Indirizzo: " + indirizzo);
    }

    public static void main(String[] args) {
        // Creazione di due profili di persona
        MainPersona persona1 = new MainPersona("Mario", "Rossi", 30, "Via Roma 1");
        MainPersona persona2 = new MainPersona("Laura", "Bianchi", 25, "Via Milano 2");

        // Stampa delle informazioni
        System.out.println("Profilo 1:");
        persona1.stampaInformazioni();

        System.out.println("---------------------");
        
        System.out.println("Profilo 2:");
        persona2.stampaInformazioni();
    }
}
