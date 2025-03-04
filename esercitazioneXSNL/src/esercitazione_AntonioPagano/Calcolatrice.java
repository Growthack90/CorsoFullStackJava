package esercitazione_AntonioPagano;

public class Calcolatrice {

    int a;
    int b;
    
    // Costruttore per inizializzare a e b
    public Calcolatrice(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void somma() {
        int s = a + b;
        System.out.println("La somma è: " + s);
    }

    public void sottrazione() {
        int s = a - b;
        System.out.println("La sottrazione è: " + s);
    }

    public void divisione() {
        if (b == 0) {
            System.out.println("Errore: divisione per zero!");
        } else {
            int s = a / b;
            System.out.println("La divisione è: " + s);
        }
    }

    public void moltiplicazione() {
        int s = a * b;
        System.out.println("La moltiplicazione è: " + s);
    }

    public static void main(String[] args) {
    	// viene creato un oggetto Calcolatrice e vengono chiamati i suoi metodi per eseguire le operazioni
        Calcolatrice calc = new Calcolatrice(10, 5); // vengono passati i valori di a e b al costruttore
        calc.somma();
        calc.sottrazione();
        calc.divisione();
        calc.moltiplicazione();
    }
}