package ex_AntonioPagano.oopClass.exGestoreTelefonico;

public class Sim {
    private int numero;
    private int importo;
    private int numeroTelefonateFatte = 0;
    private int numeroTelefonateRicevute = 0;

    private Telefonata[] elencoTelefonateFatte = new Telefonata[10];
    private Telefonata[] elencoTelefonateRicevute = new Telefonata[10];

    public Sim() {
    }

    public Sim(int numero, int importo) {
        this.numero = numero;
        this.importo = importo;
    }

    public void aggiungiTelefonataFatta(Telefonata t) {
        if (numeroTelefonateFatte < elencoTelefonateFatte.length) {
            elencoTelefonateFatte[numeroTelefonateFatte] = t;
            numeroTelefonateFatte++;
        } else {
            System.out.println("Numero massimo di telefonate fatte raggiunto.");
        }

    }

    public void aggiungiTelefonataRicevuta(Telefonata t) {
        if (numeroTelefonateRicevute < elencoTelefonateRicevute.length) {
            elencoTelefonateRicevute[numeroTelefonateRicevute] = t;
            numeroTelefonateRicevute++;
        } else {
            System.out.println("Numero massimo di telefonate ricevute raggiunto.");
        }
    }

    public int costoTotaleChiamate() {
        int costoTotale = 0;
        for (int i = 0; i < numeroTelefonateFatte; i++) {
            if (elencoTelefonateFatte[i] != null)
                costoTotale += elencoTelefonateFatte[i].getCosto();
        }

        return costoTotale;
    }

    public int durataTotaleChiamate() {
        int durataTotale = 0;
        for (int i = 0; i < numeroTelefonateFatte; i++) {
            if (elencoTelefonateFatte[i] != null)
                durataTotale += elencoTelefonateFatte[i].getDurata();
        }

        for (int i = 0; i < numeroTelefonateRicevute; i++) {
            if (elencoTelefonateRicevute[i] != null)
                durataTotale += elencoTelefonateRicevute[i].getDurata();
        }

        return durataTotale;
    }

    public void stampaTelefonateFatte() {
        System.out.println("Telefonate Fatte:");
        for (int i = 0; i < numeroTelefonateFatte; i++) {
            if (elencoTelefonateFatte[i] != null)
                System.out.println(elencoTelefonateFatte[i].getNumero());
        }
    }

    public void stampaTelefonateRicevute() {
        System.out.println("Telefonate Ricevute:");
        for (int i = 0; i < numeroTelefonateRicevute; i++) {
            if (elencoTelefonateRicevute[i] != null)
                System.out.println(elencoTelefonateRicevute[i].getNumero());
        }
    }
}