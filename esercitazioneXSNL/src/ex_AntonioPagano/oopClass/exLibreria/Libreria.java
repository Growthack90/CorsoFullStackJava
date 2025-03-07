package ex_AntonioPagano.oopClass.exLibreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private Libro[] lista;

    public Libreria(Libro[] r) {
        lista = r;
    }

    public Libro[] ricerca(String a, int k) {
        List<Libro> resList = new ArrayList<>();
        for (Libro libro : lista) {
            if (libro != null && libro.getAutore().equals(a) && libro.getPrezzo() > k) {
                resList.add(libro);
            }
        }
        return resList.toArray(new Libro[0]);
    }

    public String[] ricercaPerAutore(String a) {
        List<String> resList = new ArrayList<>();
        for (Libro libro : lista) {
            if (libro != null && libro.getAutore().equals(a)) {
                resList.add(libro.getTitolo());
            }
        }
         return resList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Libro l = new Libro("divina commedia", "Dante", 30);
        Libro l1 = new Libro("decamerone", "Dante", 30);
        Libro l2 = new Libro("divina commedia due", "Foscolo", 30);
        Libro l3 = new Libro("divina commedia tre", "Dante", 10);
        Libro[] lis = new Libro[10];
        lis[0] = l;
        lis[1] = l1;
        lis[2] = l2;
        lis[3] = l3;

        Libreria lib = new Libreria(lis);

        Libro[] r = lib.ricerca("Dante", 15);
        for (Libro libro : r) {
            System.out.println(libro.getTitolo());
        }

        String[] r2 = lib.ricercaPerAutore("Dante");
        for (String titolo : r2) {
            System.out.println(titolo);
        }
    }
}