//// GIOCHINO CARTA, SASSO, FORBICE (correggere)
///package esercitazione_giochi;
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Random rand = new Random();
//		
//		int sceltaComputer = rand.nextInt(3);
//		
//		
////		System.out.println("Il numero casuale generato è: " + sceltaComputer);
//		
//		System.out.println("---------------------------");		
//		
//		// SCELTA DELL'UTENTE
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Scrivi la tua scelta (sasso, carta, forbice): ");
//        String sceltaUtente = scanner.nextLine().toUpperCase();
//        System.out.println("Tu --> " + sceltaUtente);        
//        scanner.close();
//
//		System.out.println("---------------------------");	
//		
//		// SCELTA DEL COMPUTER
//		if (sceltaComputer == 0)
//			System.out.println("PC --> SASSO");
//        else if (sceltaComputer == 1)
//        	System.out.println("PC --> CARTA");
//        else if (sceltaComputer == 2)
//            System.out.println("PC --> FORBICE");
//		
//		System.out.println("---------------------------");	
//		System.out.println("---------------------------");	
//		
//        // DETERMINAZIONE DEL VINCITORE
//        if (sceltaUtente.equals("SASSO")) {
//            if (sceltaComputer == 0) {
//                System.out.println("Pareggio!");
//            } else if (sceltaComputer == 1) {
//                System.out.println("Vince: " + sceltaComputer); // Carta batte sasso
//            } else {
//                System.out.println("Vince: " + sceltaUtente); // Sasso batte forbice
//            }
//        } else if (sceltaUtente.equals("CARTA")) {
//            if (sceltaComputer == 1) {
//                System.out.println("Pareggio!");
//            } else if (sceltaComputer == 2) {
//                System.out.println("Vince: " + sceltaComputer); // Forbice batte carta
//            } else {
//                System.out.println("Vince: " + sceltaUtente); // Carta batte sasso
//            }
//        } else if (sceltaUtente.equals("FORBICE")) {
//            if (sceltaComputer == 2) {
//                System.out.println("Pareggio!");
//            } else if (sceltaComputer == 0) {
//                System.out.println("Vince: " + sceltaComputer); // Sasso batte forbice
//            } else {
//                System.out.println("Vince: " + sceltaUtente); // Forbice batte carta
//            }
//        } else {
//            System.out.println("Scelta non valida!");
//        }
//        
//		System.out.println("---------------------------");              
//		
//	}
//	
//}


