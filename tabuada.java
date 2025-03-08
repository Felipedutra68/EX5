package EX5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class tabuada {
    
    public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);  
  
System.out.println("Digite um numero");
  int n1 = teclado.nextInt();
  
  int c1 = 0; 
  
  while (n1 < 1) {
   System.out.println("Invalido");
   System.out.println("Digite um numero");
   n1 = teclado.nextInt();    
  }
   
while (c1 <= 10) {
    
c1++;
    
System.out.println(c1+"X"+n1+"="+c1*n1);
    
}
    
    
    }
}