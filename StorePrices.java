import java.util.*;

public class StorePrices
{
   public static void main(String[] args)
   {
      
      double[] total, price, amount;
      final arrayLength = 10;
      
      Scanner kb = new Scanner(System.in);
      
      total = new double[arrayLength];
      price = new double[arrayLength];
      amount = new double[arrayLength];
      
      
      for (int i=0; i<price.length; i++) {
         System.out.print("Enter the price of object " + (i+1)+ " here: ");
         price[i] = kb.nextDouble();
         
      }
