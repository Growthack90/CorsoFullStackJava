/**********************************************************/
//Versione con Vector
/**********************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import Dati.IO;
import Dati.Libro;

public class LibreriaVector {

	public static void main(String[] args) {
		
		ArrayList<Libro> list = new ArrayList();

		list.add(new Libro("20mila leghe sotto i mari", "Jules Verne", 1870));
		list.add(new Libro("Prima di Adamo", "Jack London", 1907));
		list.add(new Libro("Il vecchio e il mare", "Ernest Hemingway", 1952));
		
		for (int i = 0; i < list.size(); i++) {
			IO.println(list.get(i));
		}
		
		IO.println("-------------------------");
				
		
		list.add(new Libro("Il ritratto di Dorian Gray", "Oscar Wilde", 1890));
		for (int i = 0; i < list.size(); i++) {
			IO.println(list.get(i));
		}
		
		Vector<Libro> v = new Vector();
		v.add(new Libro("Il ritratto di Dorian Gray", "Oscar Wilde", 1890));
		v.add(new Libro("Il ritratto di Dorian Gray", "Oscar Wilde", 1890));
		
		List<Libro> l;
		l = list;
		
		
		l = v;
	}

}


