package ereditarietà.veicolo;

public class Garage {

	private Veicolo[] posti = new Veicolo[15];
	
	
	public boolean aggiungi(Veicolo v) {
		
		for(int i =0; i< 15; i++) {
			if(posti[i] == null) {
				posti[i] = v;
				System.out.println("inserimento effettuato");
				return true;
			}
		}
		System.out.println("inserimento NON effettuato");
		return true;

	}
	
	public Veicolo estrazione(int i) {
		Veicolo v = posti[i];
		posti[i] = null;
		return v;
	}
	
	public void stampa() {
		System.out.println("veicolo nel garage");
		for(int i=0; i< 15 ; i++) {
			System.out.println(posti[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		
		Auto a = new Auto();
		a.setAlimentazione("diesel");
		a.setAnno(1990);
		a.setCilindrata(2000);
		a.setMarca("fiat");
		a.setPorte(2);
		
		
		g.aggiungi(a);
		
		g.stampa();
//		
		g.estrazione(0);
		g.stampa();
		
	}
}
