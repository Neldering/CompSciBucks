import java.util.*;

public class Gymnastics
{
   public static void main(String[] args)
   {
      
      double[] scores;
      double max, min;
      double total;
      
      Scanner kb = new Scanner(System.in);
      
      scores = new double[8];
      
      //Instructions
      System.out.println("This program will calculate the score for one Gymnist at a time");
      System.out.println("It will ask for the scores of the 8 judges");
      System.out.println("then calculate the max and min and subtract them from the printed total\n");
      
      //Input 8 Scores
      for (int i=0; i<scores.length; i++) {
         System.out.print("Enter score number " + (i+1)+ " here: ");
         scores[i] = kb.nextDouble();
         while (scores[i] < 0 || scores[i] > 10)
         {
            System.out.println("Scores can only be between 0 and 10");
            System.out.print("Enter score number " + (i+1)+ " here: ");
            scores[i] = kb.nextDouble();
         }
      }
      
      System.out.println(); // creates space
      
      System.out.println("You have entered the following scores: ");
      for (int i=0; i< scores.length; i++)
         System.out.print( scores[i] + "  " );
         
      System.out.println("\n");
      
      //calculate the largest number on the list
      max = scores[0];
      for (int i=1; i<scores.length; i++)
      {
         if (scores[i]>max)
            max = scores[i];
      }
      System.out.println("The largest number on the list is: " + max);
      System.out.println(); // creates space
      
      //smallest
      min = scores[0];
      for (int i=1; i<scores.length; i++)
      {
         if (scores[i]<min)
            min = scores[i];
      }
      System.out.println("The smallest number on the list is: " + min);
      System.out.println();
      
      //total
      total = 0;
      for (int i=0; i<scores.length; i++)
      {
         total += scores[i];
      }
      
      total -= min;
      total -= max;

     
      
      System.out.printf("The total points for this gymnist is: %8.2f ", total);
   }
}
