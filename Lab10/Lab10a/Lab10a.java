import java.util.Scanner;
/**
 * Program to calculate a polynomial expression with different variables.
 * 
 * @author Ali Genis
 * @date 16.05.2020
 */
public class Lab10a
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      int x;
      int[] listCoefficient;
      
      // Program code
      System.out.print( "Please enter the value of N: " );
      listCoefficient = new int[scan.nextInt() + 1];
      
      for( int i = listCoefficient.length - 1; i >= 0; i-- )
      {
         System.out.printf( "Please enter the coefficent a%d: " , i );
         listCoefficient[i] = scan.nextInt();
      }
      System.out.print( "\nPlease enter the X value: " );
      x = scan.nextInt();
      while( x != 0 )
      {
         printPolynominal( listCoefficient , x , calculatePolynomial( listCoefficient , x ) );
         System.out.print( "\nPlease enter the X value: " );
         x = scan.nextInt();
      }
      System.out.println( "Goodbye!" );
   }
   /**
    * Method to calculate polynomial
    * @param list of coefficient
    * @param desired x
    * @return calculated value
    */
   public static int calculatePolynomial( int[] list , int x )
   {
      int sum = 0;
      for( int i = list.length - 1; i >= 0; i-- )
         sum += list[i] * Math.pow( x , i );
      return sum;
   }
   /**
    * Method to print polynominal
    * @param list of coefficient
    * @param desired x
    * @param result
    */
   public static void printPolynominal( int[] list , int x , int r )
   {
      System.out.println( "for X = " + x );
      for( int i = list.length - 1; i >= 0; i-- )
      {
         if( i != list.length - 1 )
            System.out.print( "+ " );
         System.out.printf( "%d(%d ^ %d) " , list[i] , x , i );
      }
      System.out.println( "= " + r );
   }
}