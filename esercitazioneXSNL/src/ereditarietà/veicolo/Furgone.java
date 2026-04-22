package ereditarietà.veicolo;

public class Furgone extends Veicolo{

	
	private int capacita;

	@Override
	public String toString() {
		return "Furgone [capacita=" + capacita + "]";
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}
	
	
}
