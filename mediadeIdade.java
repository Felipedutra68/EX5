package EX5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class mediadeIdade {
    
public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);    
    
  int m1 = 0;
 
  int c1 = -1;
  
  System.out.println("Digite uma idade");
  int n1 = teclado.nextInt();  
  
  while (n1 != 0) {
  
   System.out.println("Digite uma idade");
   n1 = teclado.nextInt();  
  
c1++;
    m1 = m1 + n1;
  }
  
  m1 = m1 + n1;
  
 System.out.println("A media das idades eh"+ m1/c1); 
  
 }
}
