package ex_AntonioPagano.oopClass.exGestioneImpiegati;

import java.util.ArrayList;
import java.util.List;

public class Gestionale {
    private List<Impiegato> impiegati = new ArrayList<>();
    private List<Dipartimento> dipartimenti = new ArrayList<>();
    private List<Progetto> progetti = new ArrayList<>();

    public void aggiungiImpiegato(Impiegato i) {
        impiegati.add(i);
    }

    public void eliminaImpiegato(String codFisc) {
        for (Impiegato impiegato : impiegati) {
            if (impiegato.getCodiceFiscale().equals(codFisc)) {
                impiegati.remove(impiegato);
                break;
            }
        }
    }

    public void aggiungiProgetto(Progetto p) {
        progetti.add(p);
    }

    public void associaImpiegatoProgetto(Progetto p, Impiegato i) {
        for (Progetto prog : progetti) {
            if (prog.getNome().equals(p.getNome())) {
                prog.getPartecipanti().add(i);
                return;
            }
        }
    }

    public void aggiungiDipartimento(Dipartimento d) {
        dipartimenti.add(d);
    }

    public static void main(String[] args) {
        Gestionale g = new Gestionale();

        Impiegato i1 = new Impiegato();
        i1.setCodiceFiscale("iii");
        i1.setNome("Mario");
        i1.setCognome("Rossi");
        g.aggiungiImpiegato(i1);

        Impiegato i2 = new Impiegato();
        i2.setCodiceFiscale("ffffffffff");
        i2.setNome("Luigi");
        i2.setCognome("Verdi");
        g.aggiungiImpiegato(i2);

        Progetto p = new Progetto("provaProgetto");
        g.aggiungiProgetto(p);

        g.associaImpiegatoProgetto(p, i1);
        g.associaImpiegatoProgetto(p, i2);

        Dipartimento d = new Dipartimento();
        d.setNome("provaDipartimento");
        g.aggiungiDipartimento(d);

        System.out.println("Impiegati: " + g.impiegati);
        System.out.println("Progetti: " + g.progetti);
        System.out.println("Dipartimenti: " + g.dipartimenti);
        System.out.println("Partecipanti al progetto " + p.getNome() + ": " + p.getPartecipanti());
    }
}
