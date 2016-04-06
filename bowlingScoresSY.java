//Scott Yates (thanks for lending this to my notes)
//3/26/2016
//Bowling score program

import java.lang.Math;
import java.util.*;
import java.io.*;

public class bowlingScoresSY
{
   public static void main(String[] args) throws IOException
   {
      
      String scores = "";
      int scores1 = 5, scores2 = 2, scores3 = 2, bScore;
      
      Scanner keyboard = new Scanner(System.in);
      PrintWriter outputFile = new PrintWriter("Bowling Scores.txt");
      
      for(int i =1; i <= scores1; i++)
         {
             System.out.print("Enter game 1 score for bowler " +i+ " here: ");
             scores = keyboard.nextLine();
             outputFile.println(scores);
             
             for(int j =1; j < scores2; j++)
               {  
                 { 
                  System.out.print("Enter game 2 score for bowler " +i+ " here: ");
                  scores = keyboard.nextLine();
                  outputFile.println(scores);
                 } 
             
             
               for(int k =1; k < scores3; k++)
               {
                 System.out.print("Enter game 3 score for bowler " +i+ " here: ");
                 scores = keyboard.nextLine();
                 outputFile.println(scores);
               }
             }
          }
          outputFile.close();
   }       
}             
