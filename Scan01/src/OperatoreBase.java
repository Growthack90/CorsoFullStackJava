
public class OperatoreBase {

    public String operazione;
    public double a;
    public double b;

    public OperatoreBase(String op) {
        this.operazione = op;
    }

    public double risultato() {
        if (this.operazione.equals("somma")) {
            return this.a + this.b;
        } else if (this.operazione.equals("prodotto")) {
            return this.a * this.b;
        } else if (this.operazione.equals("sottrazione")) { // Aggiunto per sottrazione
            return this.a - this.b;
        } else if (this.operazione.equals("divisione")) { // Aggiunto per divisione
            if (this.b != 0) {
                return this.a / this.b;
            } else {
                System.err.println("Errore: Divisione per zero!");
                return Double.NaN; // Restituisce NaN (Not a Number) in caso di divisione per zero
            }
        }
        return 0; // Valore di default se l'operazione non è riconosciuta
    }
}