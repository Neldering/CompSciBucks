import java.util.*;

public class ArrayProblem
{
   public static void main(String[] args)
   {
      
      int[] scores;
      int sum, max, min, numberOfScores;
      double average, total;
      
      Scanner kb = new Scanner(System.in);
      
      System.out.print("How many scores do you want to enter? ");
      numberOfScores = kb.nextInt();
      
      scores = new int[numberOfScores];
      
      for (int i=0; i<numberOfScores; i++) {
         System.out.print("Enter score number " + (i+1)+ " here: ");
         scores[i] = kb.nextInt();
      }
      
      System.out.println("You have entered the following scores: ");
      for (int i=0; i< scores.length; i++)
         System.out.print( scores[i] + "  " );
         
      System.out.println();
      
      //calculate the largest number on the list
      max = scores[0];
      for (int i=0; i<scores.length; i++)
      {
         if (scores[i]>max)
            max = scores[i];
      }
      System.out.println("The largest number on the list is " + max);
      
      //smallest
      min = scores[0];
      for (int i=0; i<scores.length; i++)
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
      System.out.println("The total of the numbers on the list is " + total);
      
      average = total/numberOfScores;
      System.out.println("The average number of the list is " + average);
   }
}
