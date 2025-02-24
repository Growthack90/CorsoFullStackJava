/*******************************************************************************/
// INPUT DI INTERI
/*******************************************************************************/
/*
public class Main {
    public static void main(String[] args) {
        java.util.Scanner s;
        s = new java.util.Scanner(System.in);

        int n1, n2;

        System.out.println("Dammi il primo numero! ");
        String s1 = s.nextLine();

        n1 = Integer.parseInt(s1); 
        
        System.out.println("Dammi il secondo numero! ");
        String s2 = s.nextLine();

        n2 = Integer.parseInt(s2);

        System.out.println("La somma è: "+ (n1 + n2));
    }
}
*/
/*******************************************************************************/



/*******************************************************************************/
// INPUT DI DECIMALI
/*******************************************************************************/
/*
public class Main {
    public static void main(String[] args) {
        java.util.Scanner s;
        s = new java.util.Scanner(System.in);

        double n1, n2;

        System.out.println("Dammi il primo numero! ");
        String s1 = s.nextLine();
        n1 = Double.parseDouble(s1);

        System.out.println("Dammi il secondo numero! ");
        String s2 = s.nextLine();
        n2 = Double.parseDouble(s2);

        System.out.println("La somma è: " + (n1 + n2));
    }
}
 */
/*******************************************************************************/


/*******************************************************************************/
// INPUT DI DECIMALI (modificato)
/*******************************************************************************/
/*
public class Main {
    public static void main(String[] args) {
        java.util.Scanner s;
        s = new java.util.Scanner(System.in);

        double n1, n2;

        System.out.println("Dammi il primo numero! ");
        n1 = Double.parseDouble(s.nextLine());

        System.out.println("Dammi il secondo numero! ");
        n2 = Double.parseDouble(s.nextLine());

        double somma = n1 + n2;

        String risultatoFormattato = String.valueOf(somma).replace(".", ","); // il metodo replace funziona con le stringhe perciò viene convertito il double in String

        System.out.println("La somma è: " + risultatoFormattato);
        System.out.println("La somma è di tipo: " + risultatoFormattato.getClass().getSimpleName());
    }
}
 */
/*******************************************************************************/



/*******************************************************************************/
// CHIAMATA METODI DI UNA CLASSE ESTERNA
/*******************************************************************************/
/*
public class Main {
    public static void main(String[] args) {
    	
    	BuonaEducazione be = new BuonaEducazione();
    	
    	// metodo Saluta della classe BuonaEducazione
    	be.Saluta();
    	
    	// metodo Ringrazia della classe BuonaEducazione
    	be.Ringrazia();
    	
    	// metodo getNomeDelProgrammatore della classe BuonaEducazione
    	String nomep = be.getNomeDelProgrammatore();
    	System.out.println("Nome del programmatore: " + nomep);
        
        }       
}
*/
/*******************************************************************************/        




/*******************************************************************************/ 
// CHIAMATA CON METODO STATIC
/*******************************************************************************/ 
/*
public class Main {
    public static void main(String[] args) {
    	
    	// chiamata metodi di una classe interna
    	OperazioniBase op = new OperazioniBase();
    	
    	System.out.println("La somma tra 5 e 7 è: " + op.somma(5, 7));
        System.out.println("La sottrazione tra 5 e 7 è: " + op.sottrazione(5, 7));
        System.out.println("La moltiplicazione tra 5 e 7 è: " + op.moltiplicazione(5, 7));
        System.out.println("La divisione tra 5 e 7 è: " + op.divisione(5, 7));
    	
        
        // analogo a quanto sopra ma con STATIC method
        // (in questo modo eviteremo di scrivere la classe)
        
        // Chiamata ai metodi statici della classe OperazioniBase
        double somma = OperazioniBase.somma(5, 7);
        double sottrazione = OperazioniBase.sottrazione(5, 7);
        double moltiplicazione = OperazioniBase.moltiplicazione(5, 7);
        double divisione = 0; // Inizializzazione necessaria per gestire l'eccezione
        
        try {
            divisione = OperazioniBase.divisione(5, 7);
        } catch (ArithmeticException e) {
            System.err.println("Errore: " + e.getMessage()); // Stampa l'errore
        }
        
        // Stampa dei risultati
        System.out.println("Somma: " + somma);
        System.out.println("Sottrazione: " + sottrazione);
        System.out.println("Moltiplicazione: " + moltiplicazione);
        System.out.println("Divisione: " + divisione);
        
        }       
}
*/
/*******************************************************************************/ 


/*******************************************************************************/
// USANDO THIS SENZA METODO STATIC
/*******************************************************************************/
/*
public class Main {
    public static void main(String[] args) {      
    	OperazioniBase operazione1 = new OperazioniBase();
    	
    	OperazioniBase operazione2 = new OperazioniBase();
    	
    	operazione1.a = 3;
    	operazione1.b = 4;
    	
    	operazione2.a = 5;
    	operazione2.b = 6;
    	
    	double s = operazione1.somma();
    	System.out.println("La somma tra " + operazione1.a + " e " + operazione1.b + " è: " + s);
    	
    	double s2 = operazione2.somma();
    	System.out.println("La somma tra " + operazione2.a + " e " + operazione2.b + " è: " + s2);
    
		}       
}	
*/
/*******************************************************************************/

    	

/*******************************************************************************/
// RESTITUIRE RISULTATO IN BASE SCELTA OPERATORE
/*******************************************************************************/
/*
public class Main {
	public static void main(String[] args) { 
		
        OperatoreBase op1 = new OperatoreBase("somma");
        op1.a = 5;
        op1.b = 3;
        System.out.println("Risultato somma: " + op1.risultato());

        OperatoreBase op2 = new OperatoreBase("prodotto");
        op2.a = 5;
        op2.b = 3;
        System.out.println("Risultato prodotto: " + op2.risultato());

        OperatoreBase op3 = new OperatoreBase("sottrazione"); // Test sottrazione
        op3.a = 5;
        op3.b = 3;
        System.out.println("Risultato sottrazione: " + op3.risultato());

        OperatoreBase op4 = new OperatoreBase("divisione"); // Test divisione
        op4.a = 6;
        op4.b = 3;
        System.out.println("Risultato divisione: " + op4.risultato());

        OperatoreBase op5 = new OperatoreBase("divisione"); // Test divisione per zero
        op5.a = 6;
        op5.b = 0;
        System.out.println("Risultato divisione per zero: " + op5.risultato());

		
	}       
}
*/
/*******************************************************************************/
    

/*******************************************************************************/
// ALTERNATIVA
/*******************************************************************************/
public class Main {
    public static void main(String[] args) {

        OperatoreBase op = new OperatoreBase("somma"); // Crea una sola istanza


        op.a = 5;
        op.b = 3;
        
        op.operazione = "somma"; // Non necessario, ma esplicito
        System.out.println("Risultato somma: " + op.risultato());


        op.operazione = "prodotto";
        System.out.println("Risultato prodotto: " + op.risultato());


        op.operazione = "sottrazione";
        System.out.println("Risultato sottrazione: " + op.risultato());


        op.operazione = "divisione";
        System.out.println("Risultato divisione: " + op.risultato());

        // Divisione per zero
        op.a = 6;
        op.b = 0;
        op.operazione = "divisione";
        System.out.println("Risultato divisione per zero: " + op.risultato());
    }
}
/*******************************************************************************/
