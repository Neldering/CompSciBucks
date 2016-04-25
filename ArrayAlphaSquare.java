

public class ArrayAlphaSquare
{
   public static void main(String[] args)
   {
      
      double[] alpha;
      
      alpha = new double[50];
      
      for (int i=0; i<alpha.length; i++) {
         
         if ( i < 25) 
            alpha[i] = i*i;
         else 
            alpha[i] = i*3;
      }
      for (int i=0; i<alpha.length; i++) {

         System.out.printf("%8.2f", alpha[i]);
         
         if (i % 10 == 9) 
            System.out.println();

      }
   }
