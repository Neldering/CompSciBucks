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
      System.out.print
      
      //Input 8 Scores
      for (int i=0; i<scores.length; i++) {
         System.out.print("Enter score number " + (i+1)+ " here: ");
         scores[i] = kb.nextDouble();
      }
      
      System.out.println("You have entered the following scores: ");
      for (int i=0; i< scores.length; i++)
         System.out.print( scores[i] + "  " );
         
      System.out.println();
      
      //calculate the largest number on the list
      max = scores[0];
      for (int i=1; i<scores.length; i++)
      {
         if (scores[i]>max)
            max = scores[i];
      }
      System.out.println("The largest number on the list is " + max);
      
      //smallest
      min = scores[0];
      for (int i=1; i<scores.length; i++)
      {
         if (scores[i]<min)
            min = scores[i];
      }
      System.out.println("The smallest number on the list is " + min);
      
      total = 0;
      for (int i=0; i<scores.length; i++)
      {
         total += scores[i];
      }
      
      total -= min;
      total -= max;

     
      
      System.out.println("The total points for this gymnastics competiton is: " + total);
   }
}
