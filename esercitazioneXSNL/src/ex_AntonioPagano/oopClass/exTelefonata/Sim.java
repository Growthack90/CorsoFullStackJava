package ex_AntonioPagano.oopClass.exTelefonata;

public class Sim {
    private int numeroSim;
    private int importo;

    Telefonata[] telefonateFatte = new Telefonata[10];
    Telefonata[] telefonateRicevute = new Telefonata[10];
    int numeroTelefonateFatte = 0;
    int numeroTelefonateRicevute = 0;

    public void costoTotaleTelefonate() {
        int costoTotale = 0;
        for (int i = 0; i < numeroTelefonateFatte; i++) {
            if (telefonateFatte[i] != null) {
                costoTotale = costoTotale + telefonateFatte[i].getCosto();
            }
        }
        System.out.println("Costo Totale è: " + costoTotale);
    }

    public void durataTotaleTelefonate() {
        int durataTotale = 0;
        for (int i = 0; i < numeroTelefonateFatte; i++) {
            if (telefonateFatte[i] != null) {
                durataTotale = durataTotale + telefonateFatte[i].getDurata();
            }
        }
        System.out.println("Durata Totale è: " + durataTotale);
    }

    public void aggiungiTelefonataFatta(Telefonata f) {
        if (numeroTelefonateFatte < telefonateFatte.length) {
            telefonateFatte[numeroTelefonateFatte] = f;
            numeroTelefonateFatte++;
        } else {
            System.out.println("Numero massimo di telefonate fatte raggiunto.");
        }
    }

    public void aggiungiTelefonataRicevuta(Telefonata r) {
        if (numeroTelefonateRicevute < telefonateRicevute.length) {
            telefonateRicevute[numeroTelefonateRicevute] = r;
            numeroTelefonateRicevute++;
        } else {
            System.out.println("Numero massimo di telefonate ricevute raggiunto.");
        }
    }

    public void stampaTelefonataFatte() {
        System.out.println("ELENCO TELEFONATE FATTE");
        for (int i = 0; i < numeroTelefonateFatte; i++) {
            if (telefonateFatte[i] != null) {
                System.out.println("Numero: " + telefonateFatte[i].getNumero());
            }

        }
    }

    public void stampaTelefonataRicevute() {
        System.out.println("ELENCO TELEFONATE RICEVUTE");
        for (int i = 0; i < numeroTelefonateRicevute; i++) {
            if (telefonateRicevute[i] != null) {
                System.out.println("Numero: " + telefonateRicevute[i].getNumero());
            }

        }
    }

    public static void main(String[] args) {
        Telefonata t = new Telefonata();
        t.setNumero(122);
        t.setDurata(100);
        t.setCosto(200);

        Telefonata t1 = new Telefonata();
        t1.setNumero(123);
        t1.setDurata(100);
        t1.setCosto(200);

        Telefonata t2 = new Telefonata();
        t2.setNumero(321);
        t2.setDurata(50);
        t2.setCosto(100);

        Sim s = new Sim();
        s.aggiungiTelefonataFatta(t);
        s.aggiungiTelefonataFatta(t1);
        s.aggiungiTelefonataRicevuta(t2);

        s.stampaTelefonataFatte();
        s.stampaTelefonataRicevute();
        s.costoTotaleTelefonate();
        s.durataTotaleTelefonate();
    }
}