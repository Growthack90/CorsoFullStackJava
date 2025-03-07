package ex_AntonioPagano.oopClass.exUfficio;

public class Ufficio {
    private Impiegato[] listaImpiegati; 

    public Ufficio(Impiegato[] listaImpiegati) {
        this.listaImpiegati = listaImpiegati;
    }

    public int media(int[] m) { 
        int somma = 0;
        int numImpiegatiTrovati = 0;
        for (Impiegato impiegato : listaImpiegati) {
            for (int matricola : m) {
                if (impiegato.getMatricola() == matricola) {
                    numImpiegatiTrovati++;
                    somma += impiegato.getRetribuzione();
                    break;
                }
            }
        }
        return numImpiegatiTrovati > 0 ? somma / numImpiegatiTrovati : 0;
    }

    public String[] dipendentiPiuPagati(int[] a) { 
        String[] cognomi = new String[listaImpiegati.length]; 
        int pos = 0;
        int media = media(a);
        for (Impiegato imp : listaImpiegati) {
            if (imp.getRetribuzione() > media) {
                cognomi[pos++] = imp.getCognome();
            }
        }
        return cognomi;
    }

    public static void main(String[] args) { 
        Impiegato r = new Impiegato(1, "pagano", "antonio", 50000);
        Impiegato r1 = new Impiegato(2, "lagana", "cesare", 4000);
        Impiegato r2 = new Impiegato(3, "rossi", "flavio", 1000);

        Impiegato[] elencoImp = new Impiegato[3];
        elencoImp[0] = r;
        elencoImp[1] = r1;
        elencoImp[2] = r2;

        Ufficio u = new Ufficio(elencoImp);

        int[] m = new int[4];
        m[0] = 2;
        m[1] = 3;
        m[2] = 40;
        m[3] = 10;

        int media = u.media(m);
        System.out.println("Media: " + media);

        String[] res = u.dipendentiPiuPagati(m);
        System.out.println("Dipendenti più pagati:");
        for (String s : res) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}