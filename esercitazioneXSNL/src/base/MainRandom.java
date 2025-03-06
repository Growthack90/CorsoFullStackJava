/***********************************************************/

//import java.util.Random;


//public class MainRandom {
//
//	public static void main(String[] args) {
//
//		Random rand = new Random();
//		
//		int numeroCasuale = rand.nextInt(100);
//		
//        System.out.println("Il numero casuale generato è: " + numeroCasuale);
//	}
//
//}


/***********************************************************/
package base;

import java.util.Random;

public class MainRandom {
	
	public static void main(String[] args) {
		
		int min = 5;
		int max = 15;
		
		Random rand = new Random();
		
		int numeroCasuale = min + rand.nextInt(max - min +1);
		
		System.out.println("Il numero casuale generato è: " + numeroCasuale);
	}
	
}






