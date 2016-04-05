// Nicolas Eldering
// Assignment 10
// 4/6/2016

/*
A bowling team consists of five people.
 Each person bowls three games. 
 Write a Java program that uses a nested 
 loop to enter each player’s individual score and stores 
 this information in a file. Write a second program to 
 open the file, compute the average score for each bowler, 
 and print the information in table format. 
 */
import java.io.*;
import java.util.*;

public class CreateBowlerListNCE {
   public static void main(String[] args) throws Exception {
      String name, clear;
      int game1, game2, game3;
      float average;
      
      File file = new File ("bowlerNCE.txt");
      PrintWriter pw = new PrintWriter (file);
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("In this program you will enter a bowlers name and their score for 3 games");
      System.out.println("And it will compute the average and print a table with their name scores and average");
      
      
      for(int b=1; b<=5; b++)
      {
         System.out.println("Please enter the " + b + "'s bowler's name?");
         name = kb.nextLine();
         
         System.out.println("Please enter the score of game one");
         game1 = kb.nextInt();
         
         System.out.println("Please enter the score of game two");
         game2 = kb.nextInt();
         
         System.out.println("Please enter the score of game three");
         game3 = kb.nextInt();
         
         clear = kb.nextLine();
         
         average = (game1+ game2+ game3)/3;
         
         pw.printf("%-20s     %3d     %3d    %3d     %3.2f", name, game1, game2, game3, average);
         pw.println();
      }
      pw.close();
   }
}        
       
      
      
