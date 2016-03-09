/* Nicolas Eldering
Comp sci
max min */

import java.util.*;

public class Minmax {
   public static void main( String[] args ) {
      int min;
      int max;
      int val, decision = 1;
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("This program will take 2 or more integers and compair one at a time for min and max");
      System.out.print("Please enter your first number > ");
      val = kb.nextInt();
      min = val;
      max = val;
      
          
      do {
         
         System.out.print("Please enter another number > ");
         val = kb.nextInt();

         
         if ( max < val ) {
            max = val;
         }
         else {
         }
         
         if ( min > val ) {
            min = val;
         }
         else {
         }
         
         System.out.println("Please enter 1 for another entry or any Integer to exit");
         decision = kb.nextInt();
         
      } while ( decision == 1 );
      
      System.out.println("The max number is " + max);
      System.out.println("The min number is " + min);
      
   }
}
      
          
            
      
  
