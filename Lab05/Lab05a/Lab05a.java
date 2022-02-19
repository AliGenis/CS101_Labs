import java.util.Scanner;

/*
 * A simple program to help Bran.
 *  
 * @author Ali Genis
 * @date   23.03.2020
 */

public class Lab05a
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      String string;
      String reverseString;
      String firstLetter;
      String secondLetter;
      
      System.out.print( "Please enter a string: " );
      string = scan.nextLine();
     
      reverseString = "";
      
      for ( int i = 0 ; i < ( string.length() - 1 ) ; i++ )
      {
         firstLetter = Character.toString( string.charAt(i) );
         secondLetter = Character.toString( string.charAt( i + 1 ) );
         
         if ( firstLetter.equalsIgnoreCase( secondLetter ) )
         {
            string = string.substring( 0 , i ) + string.substring( i + 2 , string.length() );
            i = -1;
         }
         
      }
      
      if ( string.equals( "" ) )
         System.out.println( "The final string is empty." ); 
      else
      {
         System.out.println( "---> " + string );
         // making reverse
         for ( int i = string.length() - 1; i >= 0; i--)
         {
            firstLetter = Character.toString( string.charAt(i) );
            reverseString += firstLetter;
         }
         System.out.println( "Reverse: " + reverseString );
      }
      
   }
   
}