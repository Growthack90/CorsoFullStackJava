package ex2;

import java.util.Scanner;

public class IO {

    public static void println(Object s) {
        System.out.println(s);
    }
    
    public static String readString() {
    	Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
