// Nicolas Eldering
// Find the max value of two numbers entered

import java.util.*;

public class FindMax {
   
   public static void main(String[] args)
   {
   int num1, num2, max;
   
   Scanner kb = new Scanner(System.in);
   
   System.out.println("You will be asked to enter two numbers. And I will print the larger");
   
   System.out.print("Enter your first number. > ");
   
   num1 = kb.nextInt();
   
   System.out.print("Enter your second number. > ");
   
   num2 = kb.nextInt();
   
   max = Findlarge(num1, num2);
   
   System.out.println("The Largest number is " + max);
   }


public static int Findlarge(int x, int y) {
   int max;
   if (x<y)
      max = y;
   else max = x;
      
   return max;
}
}
