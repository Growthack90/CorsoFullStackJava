package ex_AntonioPagano.oopClass.exGestoreTelefonico;

public class Telefonata {

    private int numero;
    private int costo;
    private int durata;

    public Telefonata(int numero, int costo, int durata) {
        super();
        this.numero = numero;
        this.costo = costo;
        this.durata = durata;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
