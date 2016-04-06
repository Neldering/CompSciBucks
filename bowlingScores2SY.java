//Scott Yates (thanks to Scott for lending this to my notes)
//3/26/2016
//Bowling score program2

import java.lang.Math;
import java.util.*;
import java.io.*;

public class bowlingScores2SY
{
   public static void main(String[] args) throws IOException
   {
      double g1, g2, g3, avg;
      
   
      Scanner keyboard = new Scanner(System.in);
      
      File file = new File("Bowling Scores.txt");
      Scanner inputFile = new Scanner(file);
      
      System.out.printf("%6s %3s %-6s %3s %-6s %6s %3s %6s %3s ", "Bowler","", "Game 1","", "Game 2","", "Game 3","", "Average");
      System.out.println("");
      
      
      
      for(int i=1; i <= 5; i++)
      {
         
         g1 = inputFile.nextDouble();     
                 
         g2 = inputFile.nextDouble();
                  
         g3 = inputFile.nextDouble();
         
         avg = (g1+g2+g3)/3;
         
         System.out.printf("%8s %5.0f %10.0f %13.0f %16.2f","Bowler "+i, g1, g2, g3, avg);
         System.out.println("");
         
      }
      
      
      
      
      
     }
} 
