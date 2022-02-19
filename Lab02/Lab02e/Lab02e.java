import java.util.Scanner;

/*
 * A simple program to string operations.
 * 
 * This program prints information about strings.
 * 
 * @author Ali Genis
 * @date   24.02.2020
 */

public class Lab02e
{
   public static void main ( String args[] )
   {
      Scanner scan = new Scanner(System.in);
      
      //Variables
      String first;
      String second;
      String finalString;
      int integer;
      
      System.out.print( "Enter the first string: ");
      first = scan.nextLine();
      first = first.substring( 1 , first.length() - 1 );
      
      System.out.print( "\nEnter the second string: " );
      second = scan.nextLine();
      
      System.out.print( "\nEnter an integer: " );
      integer = scan.nextInt();
      second = second.substring( 0 , integer ) + second.substring( integer + 1 , second.length() );
      
      finalString = first + " " + second;
      System.out.println( "\nFinal string: " + finalString );
      System.out.println( "The length of the final string: " + finalString.length() );
      
   }
}