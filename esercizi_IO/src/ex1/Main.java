package ex1;

public class Main {
    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("CLASSE IO");
        System.out.println("**********************");
        
        // COMANDO 1
        IO.print("Stampo su stessa riga");
        
        // COMANDO 2
        IO.println("\nStampo andando poi a capo");
        
        // COMANDO 3
        int eta = IO.inputInt("Inserisci la tua età: ");
        IO.println("La tua età è: " + eta);
        
        // COMANDO 4
        String nome = IO.inputString("Come ti chiami?");
        IO.println("Ciao "+ nome + "\n" + "Ho inserito il nome?\n" + !nome.isEmpty());        
               
    }
    
}