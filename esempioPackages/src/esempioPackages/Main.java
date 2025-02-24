/*************************************************************/
// ESEMPIO 1
/*************************************************************/
/*
package esempioPackages;

public class Main {
    public static void main(String[] args) {
    	 
        IO.println("Inserisci il tuo nome: ");
        String nome = IO.readString();
        IO.println("Ciao " + nome + "!");
    }
}
*/
/*************************************************************/




/*************************************************************/
//ESEMPIO 2
/*************************************************************/
package esempioPackages;

public class Main {
 public static void main(String[] args) {
 	
 	// metodo readString() 
     IO.println("Inserisci il tuo nome: ");
     String nome = IO.readString();
     IO.println("Ciao " + nome + "!");
     System.out.println("La variabile nome è di tipo: " + nome.getClass().getSimpleName());

     // aggiuntivo: per comprendere la conversione di tipo stringa in intero
     IO.println("Inserisci la tua età: ");
     String etaStringa = IO.readString();       
     System.out.println("La variabile etaStringa è di tipo: " + etaStringa.getClass().getSimpleName());
     int eta = Integer.parseInt(etaStringa);
     IO.println("Hai " + eta + " anni.");
     System.out.println("La variabile eta è di tipo: " + Integer.TYPE.getSimpleName());
     
     System.out.println("-----------------------------------");

     // metodo readInt()
     IO.println("Inserisci la tua età: ");
     int eta2 = IO.readInt();
     IO.println("Hai " + eta2 + " anni.");
     
     System.out.println("-----------------------------------");
     
     // metodo readDouble()
     IO.println("Inserisci il tuo peso: ");
     double peso = IO.readDouble();
     IO.println("Il tuo peso è: " + peso + " kg.");
     
     System.out.println("-----------------------------------");
     
//     // metodo readBoolean()
//     IO.println("Sono un maggiore di 18 anni? (true/false): ");
//     boolean maggioreDi18 = IO.readBoolean();
//     IO.println("Sei " + (maggioreDi18? "maggiore" : "minore") + " di 18 anni.");
//     
//     // metodo readFloat()
//     IO.println("Inserisci il tuo altezza: ");
//     float altezza = IO.readFloat();
//     IO.println("La tua altezza è: " + altezza + " cm.");
        
 }
}
/*************************************************************/




/*************************************************************/
// ESEMPIO 3
/*************************************************************/

/*************************************************************/



