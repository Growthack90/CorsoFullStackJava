package ereditarietà.archivio;

public class Archivio {

	private Casa[] v = new Casa[10];
	
	public Archivio(Casa[] c)
	{
		this.v = c;
	}
	
	public int mediaCase(int n) {
		
		int media = 0, count = 0, somma = 0;
		for (Casa casa : v) {
			if(casa != null && casa.getSuperficie() > n )
			{
				somma = somma + casa.costoCasa();
				count ++;
			}
		}
		
		media = somma / count; 
		return media;
	}
	
	
	public static void main(String[] args) {
		
		Appartamento a = new Appartamento(100,3000,1);
		Appartamento b = new Appartamento(1000,4000,1);

		
		Villa c = new Villa(100,30000,true);

		Casa[] ar = new Casa[10];
		ar[0] = a;
		ar[1] = b;
		ar[2] = c;
		Archivio arch = new Archivio(ar);
		
		System.out.println(arch.mediaCase(50));
	}
}
