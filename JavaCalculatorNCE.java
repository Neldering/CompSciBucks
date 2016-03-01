import java.util.Scanner;
import java.lang.Math;

public class JavaCalculatorNCE {
   public static void main ( String[] args ) {
      int num1Int = 0, num2Int = 0; 
      double num1 = 0, num2 = 0, finishedValue = 0;
      char operat = ' ';
      String num1String = " ", num2String = " ", operatString = " ";
      
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("INSTRUCTIONS");
      
      System.out.print("Num1 ");
      num1Int = kb.nextInt();
      num1 = (double)num1Int;
      System.out.println();
      
      
      System.out.print("Num2 ");
      num2Int = kb.nextInt();
      num2 = (double)num2Int;
      System.out.println();
      
      System.out.print("1 is +, 2 is -, 3 is *, 4 is /, 5 is %, 6 is ^ \n Please enter your operator: " );
      operat = kb.next().charAt(0);
      System.out.println();

      switch (num1Int)
      {
         case 1:
            num1String = "One";
            break;
         case 2:
            num1String = "Two";
            break;
         case 3:
            num1String = "Three";
            break;
         case 4:
            num1String = "Four";
            break;
         case 5:
            num1String = "Five";
            break;
         case 6:
            num1String = "Six";
            break;
         case 7:
            num1String = "Seven";
            break;
         case 8:
            num1String = "Eight";
            break;
         case 9:
            num1String = "Nine";
            break;
         default:
            System.out.println("Invalid Entry");
            System.exit(0);
            break;
      }
      
      switch (num2Int)
      {
         case 1:
            num2String = "One";
            break;
         case 2:
            num2String = "Two";
            break;
         case 3:
            num2String = "Three";
            break;
         case 4:
            num2String = "Four";
            break;
         case 5:
            num2String = "Five";
            break;
         case 6:
            num2String = "Six";
            break;
         case 7:
            num2String = "Seven";
            break;
         case 8:
            num2String = "Eight";
            break;
         case 9:
            num2String = "Nine";
            break;
         default: 
            System.out.println("Invalid Entry");
            System.exit(0);
            break;
      }

      switch (operat)
      {
         case '+':
            finishedValue = num1 + num2;
            operatString = "Plus";
            break;
         case '-':
            finishedValue = num1 - num2;
            operatString = "Minus";
            break;
         case '*':
            finishedValue = num1 * num2;
            operatString = "Mutiply by";
            break;
         case '/':
            if( num2 == 0) {
               System.out.println("Invalid Entry Cannot Divide by 0");
               System.exit(0);
            }
            else {
               finishedValue = num1 / num2;
               operatString = "Divide by";
            }
            break;
         case '%':
            finishedValue = num1 % num2;
            operatString = "Modular";
            break;
         case '^':
            finishedValue = Math.pow(num1, num2);
            operatString = "Power of";
            break;
         default:
            System.out.println("Invalid Operator");
            System.exit(0);
            break;
      }
  
      System.out.printf("This is where we put all the nums and the string operators");
   }
}  
