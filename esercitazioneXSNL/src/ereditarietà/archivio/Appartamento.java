package ereditarietà.archivio;

public class Appartamento extends Casa {

	private int codiceEnergetico;

	public Appartamento(int s, int n, int c)
	{
		super(s,n);
		this.codiceEnergetico = c;
		
	}
	
	@Override
	public int costoCasa() {
		int costo = superficie * 1500 + numeroStanze* codiceEnergetico;
		return costo;
	}
	
}
