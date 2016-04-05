import java.util.Scanner;

public class BuildaSquare{

     public static void main(String []args){
        int num1 = 0, count = 0, count2 = 0;
        
        System.out.println("This Program will take a number between 0 to 15");
        System.out.println("And print out a square of x's with collums and rows = to x");
        System.out.print("Please enter your number > ");
        
        Scanner kb = new Scanner(System.in);
        
        
        num1 = kb.nextInt();
        
        while (num1 > 15 || num1 < 0) {
            System.out.println("That is not in the range of this program");
            System.out.print("Please enter your number between 0 to 15 > ");
            num1 = kb.nextInt();
        }
        System.out.println();
    
        for(count = 1; count <= num1 ;  count++)
        {
            for(count2 = 1; count2 <= num1; count2++)
            {
                System.out.print("X");
            }
            System.out.println();
        }       
     }
}
