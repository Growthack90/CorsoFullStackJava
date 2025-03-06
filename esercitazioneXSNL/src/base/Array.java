// STESSO ARRAY CON INDIRIZZI MEMORIA DIVERSI

package base;

public class Array {
    public static void main(String[] args) {
        int[] numeri = new int[3];

        numeri[0] = 5;
        numeri[1] = 2;
        numeri[2] = 4;
        System.out.println(numeri);

        numeri = new int[5];
        System.out.println(numeri);
    }
}



// RIDIMENSIONAMENTO ARRAY (1° MODO - con metodi built-in)
//import java.util.Arrays;
//
//public class RidimensionaArray {
//
//    public static void main(String[] args) {
//        // Crea un array di dimensione 3
//        int[] arrayOriginale = new int[3];
//
//        // Inizializza l'array originale (opzionale)
//        arrayOriginale[0] = 1;
//        arrayOriginale[1] = 2;
//        arrayOriginale[2] = 3;
//
//        System.out.println("Array originale: " + Arrays.toString(arrayOriginale));
//
//        // Ridimensiona l'array a 5
//        arrayOriginale = Arrays.copyOf(arrayOriginale, 5);
//
//        // Ora l'array ha dimensione 5. I nuovi elementi sono inizializzati a 0 (valore di default per int)
//        System.out.println("Array ridimensionato: " + Arrays.toString(arrayOriginale));
//
//        // Puoi anche inizializzare i nuovi elementi
//        arrayOriginale[3] = 4;
//        arrayOriginale[4] = 5;
//
//        System.out.println("Array ridimensionato e inizializzato: " + Arrays.toString(arrayOriginale));
//    }
//}




// RIDIMENSIONAMENTO ARRAY (2° MODO - senza metodi built-in)
//package exArray;
//public class Main {
//
//    public static void main(String[] args) {
//        // Crea un array di dimensione 3
//        int[] arrayOriginale = new int[3];
//
//        // Inizializza l'array originale (opzionale)
//        arrayOriginale[0] = 1;
//        arrayOriginale[1] = 2;
//        arrayOriginale[2] = 3;
//
//        System.out.print("Array originale: ");
//        stampaArray(arrayOriginale);
//        System.out.println("locazione di memoria array originale: " + arrayOriginale);
//
//        // Ridimensiona l'array a 5
//        int[] arrayRidimensionato = new int[5];
//        
//        System.out.println("locazione di memoria array ridimensionato: " + arrayRidimensionato);
//
//        // Copia gli elementi dall'array originale al nuovo array
//        for (int i = 0; i < arrayOriginale.length; i++) {
//            arrayRidimensionato[i] = arrayOriginale[i];
//        }
//
//        arrayOriginale = arrayRidimensionato; // Aggiorna il riferimento all'array originale
//
//        System.out.print("Array ridimensionato: ");
//        stampaArray(arrayOriginale);
//
//        // Inizializza i nuovi elementi
//        arrayOriginale[3] = 4;
//        arrayOriginale[4] = 5;
//
//        System.out.print("Array ridimensionato e inizializzato: ");
//        stampaArray(arrayOriginale);
//        
//        System.out.println("locazione di memoria array originale: " + arrayOriginale);
//
//    }
//    
//    public static void stampaArray(int[] array) {
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if (i < array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//}


/*******************************************************/
//import java.util.Scanner;
//
//public class Array {
//
//	public static void main(String[] args) {
//		
//		System.out.println("---------------------------");
//		
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		
//        System.out.println(cars);
// 
//		System.out.println("---------------------------");
//		
//        for (int i = 0; i < 4; i++) {
//        	System.out.println(cars[i]);
//        }
//        
//		System.out.println("---------------------------");
//		
//		cars[0] = "Opel";
//		System.out.println(cars[0]);
//		
//		System.out.println("---------------------------");
//		
//		System.out.println(cars.length);
//		
//		System.out.println("---------------------------");
//		
//		for (String car : cars) {
//            System.out.println(car);
//        }
//		
//		System.out.println("---------------------------");
//		
//		int[] numbers = new int[3];
//		
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        
//        do {
//        		System.out.println("Aggiungi un numero: ");
//        		System.out.println("Vedi lista numeri: ");
//        		System.out.println("Esci");
//        		
//        		Scanner sc = new Scanner(System.in);
//
//        		int scelta = sc.nextInt();
//        		sc.nextLine();;
//        } while
//}
//}
	


