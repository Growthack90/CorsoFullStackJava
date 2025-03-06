//******************************************************//
//Ciclo DO-WHILE con Debug
//******************************************************//
package base;

public class Cicli {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println("---Un ciclo---");    
      System.out.println(i);
      System.out.println("La condizione è ancora vera? (Se V vai avanti, se F fermati: " + (i<5));
      i++;
      System.out.println(i);
      System.out.println("---fine ciclo---");
      
    }
    while (i < 5);  
  }
}
