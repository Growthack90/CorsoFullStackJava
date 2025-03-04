package esercitazione_AntonioPagano;

//******************************************************//
//ESERCIZI UTILI
//******************************************************//

import java.util.Scanner;

public class Cicli {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserire un numero");
		int v = s.nextInt();

		for (int x = 0; x < v; x++) {
			for (int y = x + 1; y < v; y++) {
				for (int z = y + 1; z < v; z++) {
					if (x + y + z == v) {
						System.out.println(x + "+" + y + "+" + z + "=" + v);
					}
				}
			}
		}
	}

}

//******************************************************//

//import java.util.Scanner;
//
//public class Cicli {
//	public static void main(String[] args) {
//
//		System.out.println("Divisibili per 5");
//		for (int i = 0; i < 100; i++) {
//			if (i % 5 == 0) {
//				System.out.println(i + ",");
//			}
//
//		}
//		System.out.println("");
//		System.out.println("Divisibili per 3");
//		for (int i = 0; i < 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i + ",");
//			}
//
//		}
//
//		System.out.println("");
//		System.out.println("Divisibili per 3 e per 5 ");
//		for (int i = 0; i < 100; i++) {
//			boolean divTre = false;
//			if (i % 3 == 0) {
//				divTre = true;
//			}
//			boolean divCinque = false;
//			if (i % 5 == 0) {
//				divCinque = true;
//			}
//			if (divTre && divCinque) {
//				System.out.println(i + ",");
//			}
//
//		}
//	}
//
//}


//******************************************************//

//import java.util.Scanner;
//
//public class Cicli {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Inserire il  numero di righe");
//		int numRighe = scan.nextInt();
//
//		for (int i = 0; i < numRighe; i++) {
//			for (int j= 1; j < i; j++) 
//				System.out.print(j);
//			System.out.println();
//		}
//	}
//
//}

//******************************************************//

//import java.util.Scanner;
//
//public class Cicli {
//
//	public static void main(String[] args) {
//
//		int n = 7;
//		
//		for (int i = 0; i <= n; i++) {
//			
//			// 1° for
//			for (int j = i; j > 0; j--) {
//				System.out.print(j);
//			}
//			
//			// 2° for
//			for (int k = 2; k <= i; k++) {
//				System.out.print(k);
//			}
//			
//			System.out.println("");
//		}
//		
//		for (int i = n-1; i > 0; i--) {
//			// 1° for
//			for (int j = i; j > 0; j--) {
//				System.out.print(j);
//			}
//			
//			// 2° for
//			for (int k = 2; k <= i; k++) {
//				System.out.print(k);
//			}
//			
//			System.out.println("");
//		}
//	}
//
//}
