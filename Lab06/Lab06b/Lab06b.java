import java.util.Scanner;
/*
 * A simple program to fix syntax errors.
 * 
 * This program prints information about the lab schedule and grading policy.
 * 
 * @author Ali Genis
 * @date   17.02.2020
 */
public class Lab06b
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      int n;                       // desired user input
      String generatedString;
      
      // Program Code
      do
      {
         System.out.print( "Enter positive integer n: " );
         n = scan.nextInt();
         
         if ( n < 0 )
            System.out.println( "You have to enter positive value!" );
         else if ( n > 0 )
         {
            generatedString = generateTheString ( n );
            System.out.println( generatedString );
         }
         else
            System.out.println( "Goodbye!" );
      }while ( n != 0 );
   }
   /*
    * method for generate string
    * @param user input n
    * @return genereted string
    */
   public static String generateTheString( int n )
   {
      char firstLetter;
      char secondLetter;
      String string;
      
      string  = "";
      firstLetter = (char)((int)( Math.random() * 26 ) + 97);
      if ( n % 2 == 1 )
         for ( int i = 0; i < n; i++)
            string += firstLetter;
      else
      {
         secondLetter = (char)((int)( Math.random() * 26 ) + 97);
         while ( firstLetter == secondLetter )
            secondLetter = (char)((int)( Math.random() * 26 ) + 97);
         
         for ( int i = 0; i < n - 1; i++)
            string += firstLetter;
         string += secondLetter;
      }
      return string;
   }
   
}