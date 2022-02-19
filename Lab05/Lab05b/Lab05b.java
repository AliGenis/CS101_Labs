import java.util.Scanner;

/*
 * A simple program to find terms of fibonacci sequance.
 * 
 * This program prints information about the fibonacci sequance.
 * Warning: It works until Fib(46)!!!
 * 
 * @author Ali Genis
 * @date   23.03.2020
 */

public class Lab05b
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      int n;
      int first;
      int second;
      int third;
      
      first = 0;
      second = 1;
      
      System.out.print( "Please enter a value for n: " );
      n = scan.nextInt();
      
      if ( n >= 0 ) 
      {
         for ( int i = 0; i <= n; i++ )
         {
            System.out.println( "Fib(" + i + ") = " + first );
            third = first + second;
            first = second;
            second = third;
         }
                   
      }
      
      else
         System.out.println( "Invalid value has been entered." );
      
   }
   
}
