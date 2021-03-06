import java.util.Scanner;
/*
 * A simple program for encryption.
 * 
 * @author Ali Genis
 * @date   04.04.2020
 */
public class Lab06c
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      String original;
      String encoded;
      
      // Program code
      System.out.print( "Please enter a message: " );
      original = scan.nextLine();
      encoded = encryption( original );
      
      System.out.println( "Encoded message: " + encoded );
   }
   
   /* method for encryption
    * @param original string
    * @return encrypted message
    */
   public static String encryption( String original )
   {
      String string;
      String encrypted;
      char spaceCheck;
      int rows;
      int columns;
      int i;
      
      string = original;
      encrypted = "";
      i = 0;
      for ( int j = 0; j < string.length(); j++)
      {
         spaceCheck = string.charAt( j );
         if( spaceCheck == ' ' )
         {
            string = string.substring( 0 , j ) + string.substring( j + 1 , string.length() );
            j--;
         }
      }
      rows = (int)Math.sqrt( string.length() );
      columns = rows + 1;
      for ( int j = 1; j <= rows + 1; j++)
      {
         for ( ; i < string.length(); i += columns)
            encrypted += Character.toString( string.charAt( i ));
         encrypted += " ";
         i = j;
      }
      return encrypted;
   }
   
}