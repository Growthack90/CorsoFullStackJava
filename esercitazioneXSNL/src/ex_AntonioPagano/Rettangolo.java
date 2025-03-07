package ex_AntonioPagano;

public class Rettangolo {

	int base;
	int altezza;
	
	// costruttore
	public Rettangolo(int base, int altezza) {	
		this.base = base;
		this.altezza = altezza;		
	}
	
	public void CalcolaArea() {
		int area = base * altezza;
		System.out.println("l'area è: " + area);
	}

	public void calcolaPerimetro() {
		int perimetro = 2 * base + 2 * altezza;
		System.out.println("il perimentro è: " + perimetro);
	}
	
	
    public static void main(String[] args) {
    	
    	Rettangolo rect = new Rettangolo(2, 3);
    	
    	rect.CalcolaArea();
    	
    	rect.calcolaPerimetro();


    }
}
