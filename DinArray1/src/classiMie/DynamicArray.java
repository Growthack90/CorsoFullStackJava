package classiMie;

public class DynamicArray {
	
	// L'array interno array è di tipo Object, quindi può contenere elementi di qualsiasi tipo.
	private Object[] array;
	
	// Il costruttore inizializza l'array con un array vuoto.
	public DynamicArray() {
		this.array = new Object[0];
	}
	
	// I metodi size(), add(), get(), set() e remove() forniscono le operazioni di base per gestire l'array dinamico.
	
	// SIZE
	//	Restituisce il numero di elementi nell'array.
	public int size() {
		return this.array.length;
	}
	
	// ADD
	// Aggiunge un elemento alla fine dell'array. Per fare ciò, crea un nuovo array di dimensione maggiore, copia gli elementi dal vecchio array al nuovo array e aggiunge il nuovo elemento alla fine.
	public void add(Object o)
	{
		// Crea un nuovo array di dimensione maggiore.
		int nd = this.size() + 1;
		
		// Crea un nuovo array di dimensione maggiore, copia gli elementi dal vecchio array al nuovo array.
		Object[] newArray = this.array;
		
		this.array = new Object[nd];
            
        // Aggiunge l'elemento alla fine dell'array.
		for (int i = 0; i < newArray.length; i++) {
            this.array[i] = newArray[i];
        }
        // Imposta l'elemento all'ultimo indice dell'array con il nuovo elemento.'
		int p = this.size() - 1;
		// Accede all'elemento dell'array all'indice p, ovvero all'ultimo elemento dell'array, e gli assegna "o" ovvero il valore dell'oggetto (che è l'elemento da aggiungere) all'ultimo elemento dell'array.
		this.array[p] = o;
	}
	
	// GET
	//	Restituisce l'elemento all'indice specificato. Se l'indice non è valido, restituisce null.
	public Object get(int i)
	{
		// Se l'indice non è valido, restituisce null.'
		if (i < 0 || i >= this.size()) {
			return null;
		}
		return this.array[i]; // Restituisce l'elemento all'indice specificato. Se l'indice non è valido, restituisce null.'
	}
	
	// SET
	// Imposta l'elemento all'indice specificato con il nuovo valore. Se l'indice non è valido, non fa nulla.
	public void set(int i, Object o)
	{
		if (i < 0 || i >= this.size()) {
			return;
		}
		this.array[i] = o;
	}
	
	// REMOVE
	// Rimuove l'elemento alla posizione specificata. Per fare ciò, crea un nuovo array di dimensione minore, copia gli elementi dal vecchio array al nuovo array, saltando l'elemento da rimuovere.
	public void remove(int p)
	{
		if (p < 0 || p >= this.size()) {
            return;
        }
        
        Object[] newArray = this.array;
        
        int nd = this.size() - 1;
        
        this.array = new Object[nd];
        
        int j = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (i != p) {
				this.array[j] = newArray[i];
				j++;
			}
		}		
	}
}

