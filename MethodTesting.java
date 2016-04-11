// Nicolas Eldering
// Find the max value of two numbers entered

import java.util.*;

public class MethodsTesting {
   
   public static void main(String[] args)
   {
   int num1, num2, add, multi, sub, num1copy, num2copy;
   
   
   Scanner kb = new Scanner(System.in);
 
   
   System.out.print("Enter your first number. > ");
   num1 = kb.nextInt();
   num1copy = Mirror(num1);
   StringOut(num1copy);
   
   System.out.print("Enter your second number. > ");
   num2 = kb.nextInt();
   num2copy = Mirror(num2);
   StringOut(num2copy);
   
   add = Addition(num1, num2);
   StringOut(add);
   
   multi = Multiply(num1, num2);
   StringOut(multi);
   
   sub = Subtraction(num1, num2);
   StringOut(sub);
   
   }


   public static int Mirror(int x) {
      return x;
   }
   public static int Addition(int x, int y) {
      int add;
      add = x + y;
      return add;
   }
   public static int Multiply (int x, int y) {
      int multi;
      multi = x * y;
      return multi;
   }
   public static int Subtraction(int x, int y) {
      int sub;
      sub = x - y;
      return sub;
   }
      public static void StringOut(int x) {
      System.out.println(x);
      
   }

} 
