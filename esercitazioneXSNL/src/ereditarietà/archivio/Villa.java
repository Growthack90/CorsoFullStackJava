package ereditarietà.archivio;

public class Villa extends Casa {

	private boolean piscina;
	
	public Villa(int s, int n, boolean p)
	{
		super(s,n);
		this.piscina = p;
	}
	
	@Override
	public int costoCasa() {
		int costo = superficie * 2000;
		if(piscina)
			costo = costo + 20000;
		if(numeroStanze >= 10)
			costo = costo + 10000;
		return costo;

	}
}
