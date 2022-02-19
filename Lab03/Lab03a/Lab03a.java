import java.util.Scanner;

/*
 * A simple program to combine two strings.
 * 
 * This program prints information about strings.
 * 
 * @author Ali Genis
 * @date   02.03.2020
 */

public class Lab03a 
{
   public static void main ( String args[] )
   {
      
      Scanner scan = new Scanner(System.in);
      
      //variables
      String string1;
      String string2;
      
      //Program code
      System.out.print( "Please enter the first string: " );
      string1 = scan.nextLine();
      System.out.print( "Please enter the second string: " );
      string2 = scan.nextLine();
      
      if ( string1.length() > 0 && string2.length() > 0 )
      {
        if ( string2.charAt( 0 ) == string1.charAt( string1.length() - 1 ) )
         string1 = string1.substring( 0 , string1.length() - 1 );
      }

      string1 = string1 + string2;
      System.out.println( string1 );
      
   }

}