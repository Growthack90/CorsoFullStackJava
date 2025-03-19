public class Main {
    public static void main(String[] args) {
        Cane fido = new Cane("Fido", 3);
        System.out.println("Il nome del cane è: " + fido.getNome());
        System.out.println("L'età del cane è: " + fido.getEta());
        fido.abbaia();
    }
}