import java.util.Scanner;

/*
 * A simple program to sort three numbers.
 * 
 * This program prints information about sorted numbers.
 * 
 * @author Ali Genis
 * @date   02.03.2020
 */

public class Lab03c
{
   
   public static void main ( String[] args )
   {
      
      Scanner scan = new Scanner(System.in);
      
      //Variables
      int integer1;
      int integer2;
      int integer3;
      
      // Program code
      System.out.print( "Please enter the three integers: " );
      integer1 = scan.nextInt();
      integer2 = scan.nextInt();
      integer3 = scan.nextInt();
      
      if ( integer1 == integer2 || integer2 == integer3 || integer1 == integer3 )
         System.out.print( "You have to enter different values." );
      
      else if ( integer1 < integer2 && integer2 < integer3 )
         System.out.print( "The sorted nums are: " + integer1 + " " + integer2 + " " + integer3 );
      
      else if ( integer1 < integer3 && integer3 < integer2 )
         System.out.print( "The sorted nums are: " + integer1 + " " + integer3 + " " + integer2 );
      
      else if ( integer2 < integer1 && integer1 < integer3 )
         System.out.print( "The sorted nums are: " + integer2 + " " + integer1 + " " + integer3 );
      
      else if ( integer2 < integer3 && integer3 < integer1 )
         System.out.print( "The sorted nums are: " + integer2 + " " + integer3 + " " + integer1 );
      
      else if ( integer3 < integer1 && integer1 < integer2 )
         System.out.print( "The sorted nums are: " + integer3 + " " + integer1 + " " + integer2 );
      
      else if ( integer3 < integer2 && integer2 < integer1 )
         System.out.print( "The sorted nums are: " + integer3 + " " + integer2 + " " + integer1 );
      
   }
   
}