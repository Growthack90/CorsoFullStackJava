// STESSO ARRAY CON INDIRIZZI MEMORIA DIVERSI

//public class Main {
//    public static void main(String[] args) {
//        int[] numeri = new int[3];
//
//        numeri[0] = 5;
//        numeri[1] = 2;
//        numeri[2] = 4;
//        System.out.println(numeri);
//
//        numeri = new int[5];
//        System.out.println(numeri);
//    }
//}



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






//package exArray;
//
//import java.util.Scanner;
//
//public class Main {
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
//        	
//
//	}
//
//}



/*******************************************************/
// ESERCIZI ANTONIO PAGANO
/*******************************************************/
// ARRAY 1
//public class Array {
//
//	public static void main(String[] args) {
//
//		int[] tmp = {1,3,46,89,90,4,3,2,7,8};
//	
//
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] %2 != 0)
//			{
//				for (int j = i+1; j < tmp.length; j++) {
//					if(tmp[j] %2 == 0)
//					{
//						int t = tmp[i];
//						tmp[i]= tmp[j];
//						tmp[j] = t;
//					}
//				}
//
//			}
//		}
//		
//		
//	}
//
//}


// ARRAY 2
//public class Array {
//
//	public static void main(String[] args) {
//
//		int[] tmp = {3,4,7,10,30,37,5};
//		int[] tmp2 = new int[7];
//
//		//trovo tutti i numeri pari
//		int posPari = 0;
//		for (int i = 1; i < tmp.length; i++) {
//			if(tmp[i] %2 == 0)
//			{
//				tmp2[posPari] = tmp[i];
//				posPari++;
//
//			}
//		}
//		
//		//trovo tutti i numeri dipari
//		int posDispari = posPari;
//		for (int i = 1; i < tmp.length; i++) {
//			if(tmp[i] %2 != 0)
//			{
//				tmp2[posDispari] = tmp[i];
//				posDispari++;
//
//			}
//		}		
//		
//		//stampa array ordinato
//		for (int i = 1; i < tmp.length; i++) {
//			System.out.println(tmp2[i]);
//		}
//	}
//
//}


// ARRAY 3
//public class Array {
//	public static void main(String[] args) {
//		int[] r = { 20, 10, 5, 4, 3, 2, 1 };
//
//		int index = r.length - 1;
//		for (int i = 0; i < r.length / 2; i++) {
//			int tmp = r[i];
//			r[i] = r[index];
//			r[index] = tmp;
//			index--;
//		}
//
//		for (int k = 0; k < r.length; k++) {
//			System.out.println(r[k]);
//		}
//	}
//
//}


// ARRAY 4
//public class Array {
//	public static void main(String[] args) {
//		int[] r = { 20, 10, 5, 4, 3, 2, 1 };
//
//		int index = r.length - 1;
//		for (int i = 0; i < r.length / 2; i++) {
//			int tmp = r[i];
//			r[i] = r[index];
//			r[index] = tmp;
//			index--;
//		}
//
//		for (int k = 0; k < r.length; k++) {
//			System.out.println(r[k]);
//		}
//	}
//
//}



// ARRAY 5
//public class Array {
//
//	public static void main(String[] args) {
//
//		int[] tmp = {10,3,2,2,3};
//		
//		//troviamo il piu piccolo
//		int min = tmp[0];
//		int indexMin = 0;
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] < min)
//			{
//				min = tmp[i];
//				indexMin = i;
//			}
//		}
//		
//		int minSecondo = 0;	
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] != min)
//			{
//				minSecondo = tmp[i];
//			}
//		}
//		
//		// troviamo il secondo più piccolo
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] < minSecondo && tmp[i] != min)
//			{
//				minSecondo = tmp[i];
//			}
//		}
//		
//		System.out.println("il minimo è:"+min);
//		System.out.println("il secondo minimo è:"+minSecondo);		
//	}
//
//}



// ARRAY 6
//public class Array {
//
//	public static void main(String[] args) {
//
//		int n = 5;
//		int[][] matrix = new int[n][n];
//
//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				if (j == 0 || j == i) {
//					matrix[i][j] = 1;
//
//				} else {
//					int tmp = matrix[i - 1][j - 1] + matrix[i - 1][j];
//					matrix[i][j] = tmp;
//				}
//			}
//
//		}
//
//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println("");
//		}
//
//	}
//
//}



// ARRAY 7
//public class Array {
//
//	public static void main(String[] args) {
//
//		int[] tmp = { 3, 4, 6, 8 };
//
////		// shift verso sinistra
////		for (int i = 0; i < tmp.length - 1; i++) {
////			tmp[i] = tmp[i + 1];
////		}
//
//		
//		// shift verso destra
////		for (int i = tmp.length-1; i>0 ; i--) {
////			
////			tmp[i] = tmp[i-1];
////					
////		}
//		
//		
////		// rotazione verso sinistra
////		int first = tmp[0];
////		for (int i = 0; i < tmp.length - 1; i++) {
////			tmp[i] = tmp[i + 1];
////		}	
////		tmp[tmp.length-1] = first;
//
//		
//		// rotazione verso destra
//		int last = tmp[tmp.length-1];
//		for (int i = tmp.length-1; i>0 ; i--) {
//			
//			tmp[i] = tmp[i-1];
//					
//		}
//		tmp[0] = last;
//		
//		// stampa
//		for (int i = 0; i < tmp.length; i++) {
//			System.out.println(tmp[i]);
//
//		}
//
//	}
//
//}
/*******************************************************/
/*******************************************************/
/*******************************************************/
