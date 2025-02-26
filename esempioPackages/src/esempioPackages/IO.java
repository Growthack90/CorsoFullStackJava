
/*************************************************************/
// ESEMPIO 1
/*************************************************************/
//package esempioPackages;
//import java.util.Scanner;
//
//public class IO {
//
//    public static void println(Object s) {
//        System.out.println(s);
//    }
//    
//    public static String readString() {
//    	Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//}



/*************************************************************/
// ESEMPIO 2
/*************************************************************/
package esempioPackages;
import java.util.Scanner;

public class IO {

    public static void println(Object x) {
        System.out.println(x);
    }

    // Implementazione di readString() usando uno Scanner
    public static String readString() {
        Scanner sc = new Scanner(System.in);
        String testoDaAcquisire = sc.nextLine();
        return testoDaAcquisire;
    }

    // Implementazione di readInt() usando uno Scanner
    public static int readInt() {
//        Scanner sc = new Scanner(System.in);
//        int numeroIntero = sc.nextInt();
//        return numeroIntero;
    	// GESTIONE DEGLI ERRORI
        try {
          Scanner sc = new Scanner(System.in);
            int numeroIntero = sc.nextInt();
            return numeroIntero;
        } catch (Exception e) {
            System.err.println("Errore: Inserisci un numero intero valido.");
            return -1; // Puoi restituire un valore di default o gestire l'errore in altro modo
        }
    }
   
    // Implementazione di readDouble() usando uno Scanner
    public static double readDouble() {
    		Scanner sc = new Scanner(System.in);
        double numeroReale = sc.nextDouble();
        return numeroReale;
    }
    
}
/*************************************************************/




/*************************************************************/

//ESEMPIO 3
/*************************************************************/


/*************************************************************/

