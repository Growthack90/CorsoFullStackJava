import com.azienda.nomeprogetto.Calcolatrice;

public class Main {
    public static void main(String[] args) {
        int risultatoSomma = Calcolatrice.somma(10, 5);
        int risultatoSottrazione = Calcolatrice.sottrazione(10, 5);

        System.out.println("Somma: " + risultatoSomma);
        System.out.println("Sottrazione: " + risultatoSottrazione);
    }
}
