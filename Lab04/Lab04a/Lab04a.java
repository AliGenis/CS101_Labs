import java.util.Scanner;

/*
 * A simple program to find perfect square of entered number.
 * 
 * This program prints information about perfect square.
 * 
 * @author Ali Genis
 * @date   09.03.2020
 */

public class Lab04a
{
   
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      int integer;
      int sqrt;
      
      // Program code
      System.out.print( "Enter a positive integer n >= 2: " );
      
      if ( scan.hasNextInt() )
      {
         integer = scan.nextInt();

         if ( integer >= 2 )
         {
            sqrt = 0;
            while ( integer > sqrt * sqrt )
               sqrt++;
            
            sqrt--;
            System.out.println( "The largest perfect square less than " + integer + " is " + sqrt * sqrt + " ( " + sqrt + " ^ 2 )" );   
         }
         
         else
            System.out.println( "The input n should be bigger than 1. Exitting..." );  
      }
      
      else
         System.out.println( "The input n should be an integer. Exitting..." );
   
   }

}