import java.util.Scanner;

/*
 * A simple program to make calculations with sequance of integers.
 * 
 * This program prints information about results of calculations.
 * 
 * @author Ali Genis
 * @date   10.03.2020
 */

public class Lab04d
{
   public static void main ( String args[] )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      boolean coPrime;
      String coPrimeText;
      double average;
      int value;
      int oldValue;
      int max;
      int maxVariable;
      int min;
      int minVariable;
      int sum;
      int x;
      int gcd;
      int count;
      int count7;    // Numbers which are bivisible by 7
      
      //Program code
      
      System.out.print( "Enter a sequance of integers (non-integer to process input): " );
      
      // Initilization
      value = -1;
      count = 0;
      count7 = 0;
      sum = 0;
      gcd = 0;
      average = 0;
      coPrimeText = "";
      coPrime = false;
      max = Integer.MIN_VALUE;
      min = Integer.MAX_VALUE;
      while ( scan.hasNextInt() )
      {
         oldValue = value;
         value = scan.nextInt();
         gcd = 0;
         if ( value != 0 && oldValue != 0 )
         {
            // Co-Prime part
            if ( oldValue > value )
            {
               maxVariable = oldValue;
               minVariable = value;   
            }
            else
            {
               maxVariable = value;
               minVariable = oldValue;
            }
            
            while ( maxVariable >= minVariable )
            {
               x = maxVariable % minVariable;
               if ( x == 0 )
               {
                  gcd = minVariable;
                  maxVariable = minVariable - 1;
               }
               else
               {
                  maxVariable = minVariable;
                  minVariable = x;
               }
            } 
         }
         if ( gcd == 1 )
         {
            coPrimeText += oldValue + " - " + value + "\n";
            coPrime = true;   
         }
         
         // Other calculations
         if ( value % 7 == 0 )
            count7++;
         if ( value > max )
            max = value;
         if ( value < min )
            min = value;
         
         sum += value;
         count++;
         average = (double)sum / count;
    
      }   
   
   if ( coPrime )
   {
      System.out.println( "Co-Prime Pairs: " );
      System.out.print( coPrimeText );
   }
   else if ( count > 0 )
      System.out.println( "No adjacent pair is co-prime..." );
   
   if ( count > 0 )
   {
      System.out.println( "**********************" );
      System.out.println( "Max: " + max + "\tMin: " + min );
      System.out.println( "Sum: " + sum + "\tAverage: " + average );
      System.out.println( "Count: " + count + "\tDivisible by 7 count: " + count7 );
   }
   else
      System.out.println( "No values entered." ); 
   
   }
   
}