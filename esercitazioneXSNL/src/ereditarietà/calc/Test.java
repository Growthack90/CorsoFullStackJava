package ereditarietà.calc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Addizione a = new Addizione();
		a.calcola(3, 2);

		Moltiplicazione m = new Moltiplicazione();
		m.calcola(3, 2);

		Divisioni d = new Divisioni();
		d.calcola(3, 2);

		Sottrazione s = new Sottrazione();
		s.calcola(3, 2);

	}

}