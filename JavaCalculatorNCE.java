import java.util.Scanner;
import java.lang.Math;

public class JavaCalculatorNCE {
   public static void main ( String[] args ) {
      int num1Int = 0, num2Int = 0; 
      double num1 = 0, num2 = 0, finishedValue = 0;
      char operat = ' ';
      String num1String = " ", num2String = " ", operatString = " ";
      
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("This calculator will take 3 inputs from you");
	  System.out.println("The first two will be integers between 0-9");
	  System.out.println("The third will be the operator you would like to preform");
	  System.out.println(" '+' addition, '-' subtraction, '*' multiplication, '/' division, '^' to the power of ");

      
      System.out.print("Please enter your first number. > ");
      num1Int = kb.nextInt();
      num1 = (double)num1Int;
      System.out.println();
      
      
      System.out.print("Please enter your second number > ");
      num2Int = kb.nextInt();
      num2 = (double)num2Int;
      System.out.println();
      
      System.out.println("Please enter your operator" );
      System.out.print(" '+' addition, '-' subtraction, '*' multiplication, '/' division, '^' to the power of > " );
      operat = kb.next().charAt(0);
      System.out.println();

      switch (num1Int)
      {
		 case 0:
			num1String = "zero";
			break;
         case 1:
            num1String = "one";
            break;
         case 2:
            num1String = "two";
            break;
         case 3:
            num1String = "three";
            break;
         case 4:
            num1String = "four";
            break;
         case 5:
            num1String = "five";
            break;
         case 6:
            num1String = "six";
            break;
         case 7:
            num1String = "seven";
            break;
         case 8:
            num1String = "eight";
            break;
         case 9:
            num1String = "nine";
            break;
         default:
            System.out.println("Invalid number");
            System.exit(0);
            break;
      }
      
      switch (num2Int)
      {
		 case 0:
			num2String = "zero";
			break;
         case 1:
            num2String = "one";
            break;
         case 2:
            num2String = "two";
            break;
         case 3:
            num2String = "three";
            break;
         case 4:
            num2String = "four";
            break;
         case 5:
            num2String = "five";
            break;
         case 6:
            num2String = "six";
            break;
         case 7:
            num2String = "seven";
            break;
         case 8:
            num2String = "eight";
            break;
         case 9:
            num2String = "nine";
            break;
         default: 
            System.out.println("Invalid number");
            System.exit(0);
            break;
      }

      switch (operat)
      {
         case '+':
            finishedValue = num1 + num2;
            operatString = "plus";
            break;
         case '-':
            finishedValue = num1 - num2;
            operatString = "minus";
            break;
         case '*':
            finishedValue = num1 * num2;
            operatString = "multiplied by";
            break;
         case '/':
            if( num2 == 0) {
               System.out.println("Division by zero is not allowed");
               System.exit(0);
            }
            else {
               finishedValue = num1 / num2;
               operatString = "divided by";
            }
            break;
         case '^':
            finishedValue = Math.pow(num1, num2);
            operatString = "to the power of";
            break;
         default:
            System.out.println("Invalid Operator");
            System.exit(0);
            break;
      }
  
      System.out.printf("%s %s %s is %.2f\n", num1String, operatString,  num2String, finishedValue);
   }
}  
