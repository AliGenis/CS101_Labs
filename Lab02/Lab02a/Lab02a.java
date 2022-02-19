import java.util.Scanner;

/*
 * A simple program to show desired numbers of pi.
 * 
 * This program prints information about desired numbers of pi.
 * 
 * @author Ali Genis
 * @date   24.02.2020
 */

public class Lab02a
{
   public static void main ( String args[] )
   {
      Scanner scan = new Scanner(System.in);
      
      //Variables
      int n;     // desired number of digits 
      
      //Program
      System.out.println( "Hello World!" );
      System.out.println( "This is the magic number : PI" );
      System.out.println( "****   *      *" );
      System.out.println( "   *   *     *" );
      System.out.println( "****   *    *" );
      System.out.println( "   *   *   *   *" );
      System.out.println( "**** * *  ******" );
      System.out.println( "               *" );
      System.out.print( "Enter the desired number of digits for pi:" );
      n = scan.nextInt();
      System.out.println();
      System.out.printf( "%." + ( n ) + "f" , Math.PI ); 
   
   
   
   }
   



}