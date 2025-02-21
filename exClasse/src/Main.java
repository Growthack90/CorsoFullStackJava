import classiMie.io;

public class Main {
    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("METODI STRINGA");
        System.out.println("**********************");
        
        String messaggio = "Ciao, mondo!";

        int lunghezza = messaggio.length(); 
        System.out.println(lunghezza);
        char primoCarattere = messaggio.charAt(0);
        System.out.println(primoCarattere);
        boolean contieneMondo = messaggio.contains("mondo");
        System.out.println(contieneMondo);
        String maiuscolo = messaggio.toUpperCase(); 
        System.out.println(maiuscolo);
        String sottostringa = messaggio.substring(6); 
        System.out.println(sottostringa);
        String senzaSpazi = messaggio.trim(); // trim rimuove spazi solo a inizio e fine
        System.out.println(senzaSpazi);
        
        System.out.println("**********************");
        System.out.println("CLASSE PERSONA");
        System.out.println("**********************");
        
    	System.out.println("\n--- Prima persona ---");
        Persona persona1 = new Persona();
        System.out.println(" Indirizzo persona1: " + persona1);
        
        persona1.nome = "Mario";
        persona1.cognome = "Rossi";

        System.out.println("Nome: " + persona1.nome);
        System.out.println("Cognome: " + persona1.cognome);
        persona1.faccioQualcosa(); 
        
        System.out.println("\n--- Seconda persona ---");
        Persona persona2 = new Persona();
        System.out.println(" Indirizzo persona2: " + persona2);
        persona2.nome = "Luigi";
        persona2.cognome = "Verdi";

        System.out.println("Nome: " + persona2.nome);
        System.out.println("Cognome: " + persona2.cognome);
        persona2.faccioQualcosa(); 
        
        
        persona1 = persona2;
        System.out.println("Oggetti nello stesso indirizzo di memoria:");     
        System.out.println(persona1);     
        System.out.println(persona2);          
        
        System.out.println("Stampa COSTANTE");
        Persona.info();
        
        System.out.println("**********************");
        System.out.println("CLASSE AUTO");
        System.out.println("**********************");
        
        Auto auto = new Auto("Audi", 10);
        System.out.println(auto);
        System.out.println(auto.nome);
        System.out.println(auto.eta);
        System.out.println(auto.toString());
        
 
        System.out.println("**********************");
        System.out.println("CLASSE IO");
        System.out.println("**********************");
        
        io.print("stampo su stessa riga");
        
        io.println("\nstampo andando poi a capo");
        
        int eta = io.inputInt("Inserisci la tua età: ");
        io.println("La tua età è: " + eta);
        
        String nome = io.inputString("Come ti chiami?");
        io.println("Ciao "+ nome);        
               
    }
    
}