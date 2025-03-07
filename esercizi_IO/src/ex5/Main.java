package ex5;

public class Main {
    public static void main(String args) {
        // Esempio di utilizzo dei metodi della classe IO

        IO.println("Inserisci una stringa:");
        String inputStringa = IO.getString();
        IO.println("Hai inserito: " + inputStringa);

        int inputInt = IO.getInt("Inserisci un numero intero:", "Input non valido. Inserisci un numero intero.");
        IO.println("Hai inserito: " + inputInt);
    }
}