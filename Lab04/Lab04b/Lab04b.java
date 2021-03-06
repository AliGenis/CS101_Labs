import java.util.Scanner;

/*
 * A simple program to make calculate xy-balance.
 * 
 * This program prints information about xy-balance.
 * 
 * @author Ali Genis
 * @date   09.03.2020
 */

public class Lab04b
{
   
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      String string;
      int index;
      char letter;
      boolean balanced;
      
      System.out.print( "Please enter a string: " );
      string = scan.nextLine();
      
      index = 0;
      balanced = true;
      while ( index + 1 <= string.length() )
      {
         letter = string.charAt( index );
         if ( letter == 'x' )
         {
            while ( letter != 'y' && index + 1 <= string.length() )
            {
               letter = string.charAt( index );
               index++;
               balanced = false;
            }
            if ( letter == 'y' )
               balanced = true;
         }
         else
         {
            index++;
            balanced = true;
         }
         
      }
      if ( balanced )
         System.out.println( "This string is xy-balanced.");
      else
         System.out.println( "This string is not xy-balanced.");
      
      
   }
   
   
   
   
}