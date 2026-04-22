package ereditarietà.veicolo;

public class Moto extends Veicolo {

	private int tempi;

	public int getTempi() {
		return tempi;
	}

	public void setTempi(int tempi) {
		this.tempi = tempi;
	}

	@Override
	public String toString() {
		return "Moto [tempi=" + tempi + "]";
	}

}
