import java.util.*;

public class StorePrices
{
   public static void main(String[] args)
   {
      
      double[] total, price, amount;
      final int arrayLength = 10;
      
      Scanner kb = new Scanner(System.in);
      
      total = new double[arrayLength];
      price = new double[arrayLength];
      amount = new double[arrayLength];
      
      System.out.println("This program will first take the price of 10 objects.");
      System.out.println("Then will ask you for the amount of each of the 10 objects you purchased");
      System.out.println("Finally it will calculate the total price for each object and print out a table\n");
      
      System.out.println("Please enter the prices of your objects.");
      
      for (int i=0; i<price.length; i++) {
         System.out.print("Enter the price of object " + (i+1)+ " here: ");
         price[i] = kb.nextDouble();
         
      }
      System.out.println();
      System.out.println("Please enter the amount of each object.");
      
      for (int i=0; i<amount.length; i++) {
         System.out.print("Enter the amount of object " + (i+1)+ " here: ");
         amount[i] = kb.nextDouble();
         
      }
      
      for (int i=0; i<total.length; i++) {
         total[i] = price[i] * amount[i];
      }
      System.out.println();
      System.out.println("  Total         Price        Amount   ");
      System.out.println("  =====         =====        ======   ");
      
      for (int i=0; i<total.length; i++) {
         System.out.printf(" $%5.2f     %8.2f     %8.0f   \n", total[i], price[i], amount[i]);
       
      }
   }
}
