package ereditarietà.archivio;

public abstract class Casa {

	protected int superficie;
	protected int numeroStanze;
	
	public abstract int costoCasa();

	
	
	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getNumeroStanze() {
		return numeroStanze;
	}

	public void setNumeroStanze(int numeroStanze) {
		this.numeroStanze = numeroStanze;
	}

	public Casa(int s, int n) {
		this.numeroStanze = n;
		this.superficie = s;
	}
	
}
