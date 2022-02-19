import java.util.Scanner;

/*
 * A simple program to make calculations with given number.
 * 
 * This program prints information about results of calculations.
 * 
 * @author Ali Genis
 * @date   09.03.2020
 */

public class Lab04c
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Constants
      final String SEPERATOR = "--------------------------";
      
      // Variables
      int n;
      int variable;
      int count1;
      int count2;
      
      // Program code
      System.out.print( "Please enter a value for n: " );
      
      while ( !scan.hasNextInt() )
      {
         System.out.print( "You entered incorrect value. Please try again." );
         scan.nextLine();
      }
      
      if ( scan.hasNextInt() )
      {
         n = scan.nextInt();
         if ( n > 0 )
         {
            variable = 1;
            count1 = 0;
            count2 = 1;
            
            // First part
            System.out.println( SEPERATOR + " 1 " + SEPERATOR );
            while ( variable <= n )
            {
               if ( variable % 2 == 1 )
               {
                  System.out.print( ( variable * variable ) + "\t" );
                  count1++;
               }
               variable++;
               
               if ( count1 == 5 * count2 )
               {
                  System.out.println();
                  count2++;
               }  
            }
            
            //Second part
            System.out.println( "\n" + SEPERATOR + " 2 " + SEPERATOR );
            count1 = 0;
            count2 = 1;
            variable = n;
            
            while ( variable > 0 )
            {
               if ( ( variable % 3 == 0 || variable % 4 == 0 ) && variable % 12 != 0 )
               {
                  System.out.print( variable + "\t" );
                  count1++;
               }
               variable--;
               
               if ( count1 == 5 * count2 )
               {
                  System.out.println();
                  count2++;
               }
            }
            
            //Third part
            System.out.println( "\n" + SEPERATOR + " 3 " + SEPERATOR );
            count1 = 0;
            count2 = 1;
            variable = n;
            
            while ( variable > 0 )
            {
               if ( 1.0 / variable >= 0.01)
               {
                  System.out.printf( "%.2f" , ( 1.0 / variable ) );
                  System.out.print( "\t" );
                  count1++;
               }
               variable--;
               
               if ( count1 == 5 * count2 )
               {
                  System.out.println();
                  count2++;
               }
 
            }
            
            //Fourth part
            System.out.println( "\n" + SEPERATOR + " 4 " + SEPERATOR );
            count1 = 0;
            count2 = 1;
            variable = 1;
            
            while ( n >= variable )
            {
               if ( n % variable == 0 )
               {
                  System.out.print( variable + "\t" );
                  count1++;
               }
               variable++;
               
               if ( count1 == 5 * count2 )
               {
                  System.out.println();
                  count2++;
               }
               
            }
 
         }
         else
            System.out.println( "You must enter positive integer." );
      
      }
      
      else
         System.out.println( "You must enter positive integer." );
            
   }
 
}