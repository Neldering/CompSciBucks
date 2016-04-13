//Nick

import java.util.*;

public class CharacterProblemNCE
{

   public static void main (String[] args)
   {
      String phrase;
      int position, numberOfChar, finalPosition;
      char letter;
      Scanner kb = new Scanner(System.in);
      
      directions();
      System.out.print("please enter the string of characters or phrase. > ");
      phrase = kb.nextLine();
      
      System.out.print("Please enter a position. > ");
      position = kb.nextInt();
      numberOfChar = phrase.length();
      finalPosition = validateInput(position, numberOfChar);
      letter = showChar(finalPosition, phrase);
      
      System.out.println("The " + finalPosition + " character in the string " +phrase+ " is " + letter);
   }
   
   //Directions function
   public static void directions()
   {
      System.out.print("This program will ask the user for a phrase\n"
         + " and also for a postion in the phrase, it will print\n"
         + " the character at the selected locations.\n");
   }
   
   //Validate Input Function
   public static int validateInput(int pos, int lengthOfString)
   {
   
   int correct;
   
   Scanner kb2 = new Scanner(System.in);
   
   while ( pos < 0 || pos > (lengthOfString-1))
   {
      System.out.println("Your position in the string needs to be between 0 and " + lengthOfString);
      System.out.print("Please enter a valid number. > ");
      pos = kb2.nextInt();
   }
   correct = pos;
   return correct;
   }
   
   public static char showChar(int charPos, String words)
   {
   
      char alpha;
      
      alpha = words.charAt(charPos);
      return alpha;
   }
      
}
