package esercitazione_AntonioPagano;

import java.util.Objects; // Importa la classe Objects per usare Objects.equals() e Objects.hash()

public class Persona {

    private String nome;
    private String cognome;
    private String indirizzo;
    private int numTel;

    /**
     * Costruttore con tutti i parametri.
     *
     * @param nome      Il nome della persona.
     * @param cognome   Il cognome della persona.
     * @param indirizzo L'indirizzo della persona.
     * @param numTel    Il numero di telefono della persona.
     */
    public Persona(String nome, String cognome, String indirizzo, int numTel) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numTel = numTel;
    }

    /**
     * Metodo equals per confrontare due oggetti Persona.
     * Due persone sono considerate uguali se hanno lo stesso nome, cognome, indirizzo e numero di telefono.
     *
     * @param obj L'oggetto da confrontare.
     * @return true se gli oggetti sono uguali, false altrimenti.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return numTel == persona.numTel &&
                Objects.equals(nome, persona.nome) &&
                Objects.equals(cognome, persona.cognome) &&
                Objects.equals(indirizzo, persona.indirizzo);
    }

    /**
     * Metodo hashCode per generare un codice hash univoco per ogni oggetto Persona.
     * È importante implementare hashCode quando si sovrascrive equals.
     *
     * @return Il codice hash dell'oggetto Persona.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, indirizzo, numTel);
    }

    /**
     * Metodo toString per ottenere una rappresentazione in stringa dell'oggetto Persona.
     *
     * @return Una stringa che rappresenta l'oggetto Persona.
     */
    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", numTel=" + numTel + "]";
    }

    // Metodi getter e setter per gli attributi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Pippo", "Disney", "via A", 38983);
        Persona p1 = new Persona("Pippo", "Disney", "via A", 38983);

        System.out.println(p); // Stampa la rappresentazione in stringa di p

        System.out.println(p.equals(p1)); // true, perché p e p1 hanno gli stessi attributi

        p.setCognome("Rossi"); // Cambia il cognome di p
        System.out.println(p.equals(p1)); // false, perché ora p e p1 hanno cognomi diversi
    }
}