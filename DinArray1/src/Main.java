import classiMie.DynamicArray;

public class Main {

	public static void main(String[] args) {
		
		DynamicArray a = new DynamicArray();
		System.out.println("Dimensione array di origine: " + a.size());
		
		System.out.println("Indirizzo di memoria array di origine: " + a);
		
		a.add("pippo");
		a.add("Topolino");
		a.add("Pluto");
		a.add("Paperino");
		a.add(10);

		System.out.println("Dimensione array con aggiunta elementi: " + a.size());
		
		System.out.println("Stampa elemento ad indice 1: " + a.get(1));
		
        System.out.println("Indirizzo di memoria elemento ad indice 1: " + System.identityHashCode(a.get(1)));

		System.out.println("Stampa elementi aggiunti:");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("--------");
		
		a.remove(3);
		
		System.out.println("Dimensione array dopo rimozione elemento: " + a.size());

		System.out.println("Stampa elementi senza di quello eliminato (indice 3):");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		

	}

}
