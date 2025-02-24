// INPUT DI INTERI
//public class Main {
//    public static void main(String[] args) {
//        java.util.Scanner s;
//        s = new java.util.Scanner(System.in);
//
//        int n1, n2;
//
//        System.out.println("Dammi il primo numero! ");
//        String s1 = s.nextLine();
//
//        n1 = Integer.parseInt(s1); 
//        
//        System.out.println("Dammi il secondo numero! ");
//        String s2 = s.nextLine();
//
//        n2 = Integer.parseInt(s2);
//
//        System.out.println("La somma è: "+ (n1 + n2));
//    }
//}



//// INPUT DI DECIMALI
//public class Main {
//    public static void main(String[] args) {
//        java.util.Scanner s;
//        s = new java.util.Scanner(System.in);
//
//        double n1, n2;
//
//        System.out.println("Dammi il primo numero! ");
//        String s1 = s.nextLine();
//        n1 = Double.parseDouble(s1);
//
//        System.out.println("Dammi il secondo numero! ");
//        String s2 = s.nextLine();
//        n2 = Double.parseDouble(s2);
//
//        System.out.println("La somma è: " + (n1 + n2));
//    }
//}


// INPUT DI DECIMALI (modificato)
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
