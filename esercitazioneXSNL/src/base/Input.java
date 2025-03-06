/**********************************************************/
//import java.util.Scanner;
//
//public class Input {
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("INSERIRE IL PRIMO NUMERO");
//		int primo = scan.nextInt();
//
//		System.out.println("INSERIRE IL SECONDO NUMERO");
//		int secondo = scan.nextInt();
//
//		System.out.println("INSERIRE IL TERZO NUMERO");
//		int terzo = scan.nextInt();
//
//		int media = (primo + secondo + terzo) / 3;
//		System.out.println("La media è:" + media);
//	}
//
//}

/**********************************************************/

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        
//        Scanner x = new Scanner(System.in); 	// Dichiarazione e inizializzazione insieme
//        String nome;
//        System.out.println("Inserisci il tuo nome:");
//        nome = x.nextLine();
//        System.out.println("Ciao " + nome);
//    }
//}


/**********************************************************/

// (alternativa sopra)
// ISTANZIARE una variabile, cioè rendere la variabile un OGGETTO (grazie alla keyword "new")

//public class Main {
//
//	public static void main(String[] args) {
//			
//		String nome;
//			
//		java.util.Scanner sc; 	// Solo dichiarazione
//	
//		sc = new java.util.Scanner(System.in); 	// Inizializzazione successiva
//		
//		System.out.println("Come ti chiami?");
//		nome = sc.nextLine(); 
//		System.out.println("Ciao " + nome + "!");
//	}
//}

/**********************************************************/

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {        
//        String nome;
//        int anni;
//        int altezza;
//        Scanner sc;
//        sc = new Scanner(System.in);
//        
//        System.out.println("Come ti chiami?");
//        nome = sc.nextLine();
//        System.out.println("Quanti anni hai?");
//        anni = sc.nextInt();
//        
//        System.out.println("Quanto sei alto, in cm?");
//        altezza = sc.nextInt();
//        
//        System.out.println("Ciao " + nome + "! A quanto par hai "+anni+" anni e sei alto "+altezza+" cm.");
//    }
//
//}

/**********************************************************/

// (modifica al precedente)
package base;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {        
        String nome;
        int anni;
        int altezza;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Quanti anni hai?");
        anni = sc.nextInt();
        sc.nextLine();	// // Consuma il \n
        
        System.out.println("Come ti chiami?");
        nome = sc.nextLine();
        
        System.out.println("Quanto sei alto, in cm?");
        altezza = sc.nextInt();
        
        sc.close();

        System.out.println("Ciao " + nome + "! A quanto par hai "+anni+" anni e sei alto "+altezza+" cm.");
    }

}


/**********************************************************/







