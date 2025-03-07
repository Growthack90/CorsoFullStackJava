package ex6;

public class Main {
    public static void main(String args) {
        // Esempio di utilizzo dei metodi della classe IO

        IO.println("Inserisci una stringa:");
        String inputStringa = IO.getString();
        IO.println("Hai inserito: " + inputStringa);

        int inputInt = IO.getInt("Inserisci un numero intero:");
        if (IO.getHasError()) {
            IO.println("Errore: input non valido.");
        } else {
            IO.println("Hai inserito: " + inputInt);
        }

        double inputDouble = IO.getDouble("Inserisci un numero decimale:");
        if (IO.getHasError()) {
            IO.println("Errore: input non valido.");
        } else {
            IO.println("Hai inserito: " + inputDouble);
        }
    }
}