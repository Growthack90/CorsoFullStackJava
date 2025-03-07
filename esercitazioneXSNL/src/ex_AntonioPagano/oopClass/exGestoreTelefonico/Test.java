package ex_AntonioPagano.oopClass.exGestoreTelefonico;

public class Test {

    public static void main(String[] args) {

        Sim s = new Sim();

        Telefonata t1 = new Telefonata(1, 15, 20);
        s.aggiungiTelefonataRicevuta(t1);
        Telefonata t2 = new Telefonata(2, 5, 2);
        s.aggiungiTelefonataRicevuta(t2);
        Telefonata t3 = new Telefonata(3, 15, 20);
        s.aggiungiTelefonataRicevuta(t3);
        Telefonata t4 = new Telefonata(4, 5, 2);
        s.aggiungiTelefonataRicevuta(t4);
        Telefonata t5 = new Telefonata(5, 5, 2);
        s.aggiungiTelefonataRicevuta(t5);
        Telefonata t6 = new Telefonata(6, 15, 20);
        s.aggiungiTelefonataRicevuta(t6);
        Telefonata t7 = new Telefonata(7, 5, 2);
        s.aggiungiTelefonataRicevuta(t7);
        Telefonata t8 = new Telefonata(8, 15, 20);
        s.aggiungiTelefonataRicevuta(t8);
        Telefonata t9 = new Telefonata(9, 5, 2);
        s.aggiungiTelefonataRicevuta(t9);

        Telefonata t10 = new Telefonata(10, 15, 20);
        s.aggiungiTelefonataFatta(t10);
        Telefonata t11 = new Telefonata(11, 15, 20);
        s.aggiungiTelefonataFatta(t11);

        s.stampaTelefonateRicevute();
        s.stampaTelefonateFatte();

        System.out.println("costo totale:" + s.costoTotaleChiamate());
        System.out.println("durata totale:" + s.durataTotaleChiamate());
    }
}
