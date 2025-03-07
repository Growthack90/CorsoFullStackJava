package ex2;

public class Main {
    public static void main(String[] args) {
    	 
        IO.println("Inserisci il tuo nome: ");
        String nome = IO.readString();
        IO.println("Ciao " + nome + "!");
    }
}