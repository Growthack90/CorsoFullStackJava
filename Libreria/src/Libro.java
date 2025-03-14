/*
 * 
 * Inziate con progetto LIBRERIA
- create una classe Libro con la possibilità di inserire id, titolo, autore, editore. 
- id è Integer
- gli altri sono strighe
- Di base il libro si istianzia con un costruttore senza parametri, dove mette l'id a null e gli altri a strighe vuote
- Prevedete anche un costruttore in cui inserite i campi ma non l'id e quello lo lasciate null, per ora
- Prevedete anche un costruttore in cui inserite tutti i campi , compreso un id intero
- Prevedete i metodi get e set
- prevedete un metodo  save, dove se l'id è nullo allora fa un insert altrimenti fa un update
 */

public class Libro {
    private Integer id;
    private String titolo;
    private String autore;
    private String editore;

    // Costruttore senza parametri:
    // inizializza id a null e le stringhe a vuote.
    public Libro() {
        this.id = null;
        this.titolo = "";
        this.autore = "";
        this.editore = "";
    }

    // Costruttore con parametri (senza id):
    // permette di creare un oggetto libro, senza indicare l'ID, utile in fase di 
    // creazione di un nuovo libro.
    public Libro(String titolo, String autore, String editore) {
        this.id = null;
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
    }

    // Costruttore con tutti i parametri:
    // permette la creazione completa dell'oggetto.
    public Libro(Integer id, String titolo, String autore, String editore) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
    }

    // Metodi getter e setter:
    // i metodi get e set permettono di accedere e modificare gli attributi della classe.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    // Metodo save (simulazione di insert o update):
    // Questo metodo simula un'operazione di salvataggio. 
    // Se id è null, simula un INSERT (aggiunta di un nuovo libro). 
    // Altrimenti, simula un UPDATE (aggiornamento di un libro esistente).
    public void save() {
        if (this.id == null) {
            // Simulazione di INSERT (il nuovo libro non ha un ID)
            System.out.println("INSERT: Nuovo libro aggiunto - Titolo: " + this.titolo);
        } else {
            // Simulazione di UPDATE (il libro esistente ha un ID)
            System.out.println("UPDATE: Libro con ID " + this.id + " aggiornato - Titolo: " + this.titolo);
        }
    }

    //Esempio di utilizzo nel main.
     public static void main(String[] args) {
        //Esempio di utilizzo dei costruttori
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", "Bompiani");
        Libro libro3 = new Libro(1, "1984", "George Orwell", "Mondadori");

        //Esempio di utilizzo dei metodi set
        libro1.setTitolo("Cronache del ghiaccio e del fuoco");
        libro1.setAutore("George R.R. Martin");
        libro1.setEditore("Mondadori");

        //Esempio di utilizzo del metodo save
        libro1.save(); //Simulazione di INSERT
        libro2.save(); //Simulazione di INSERT
        libro3.save(); //Simulazione di UPDATE

     }
}
