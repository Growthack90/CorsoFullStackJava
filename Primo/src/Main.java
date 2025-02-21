public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.nome = "Mario";
        persona1.cognome = "Rossi";

        System.out.println("\n--- Prima persona ---");
        System.out.println("Nome: " + persona1.nome);
        System.out.println("Cognome: " + persona1.cognome);
        persona1.faccioQualcosa(); 
        
        Persona persona2 = new Persona();
        persona2.nome = "Luigi";
        persona2.cognome = "Verdi";

        System.out.println("\n--- Seconda persona ---");
        System.out.println("Nome: " + persona2.nome);
        System.out.println("Cognome: " + persona2.cognome);
        persona2.faccioQualcosa(); 
    }
}