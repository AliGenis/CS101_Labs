import java.util.Scanner;

/*
 * A simple program to calculate can numbers form a triangle.
 * 
 * This program prints information about the triangle.
 * 
 * @author Ali Genis
 * @date   02.03.2020
 */

public class Lab03d
{
   
   public static void main ( String args[] )
   {
      Scanner scan = new Scanner(System.in);
      
      //Variables
      // Three sides of triangle
      int a;
      int b;
      int c;
      
      boolean notTriangle;
      
      //Program code
      System.out.print( "Please enter the side lengths: " );
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
      System.out.println( "Side lengths: " + a + " " + b + " " + c );
      
      
      //False numbers
      if ( a < 1 || b < 1 || c < 1 )
        System.out.println( "The side lengths must be positive." );
      else
      {
        notTriangle = !( ( a + b ) > c && ( a + c ) > b && ( b + c ) > a );
        if ( notTriangle )
          System.out.println( "The numbers do not form a triangle." );
        
        
        // If numbers belong to triangle
        else
        {
          if ( a == b && a == c && b == c )
            System.out.println( "The numbers form a EQILATERAL triangle." );
          else if ( a == b || a == c || b == c )
            System.out.println( "The numbers form a ISOSCELES triangle." );
          else
            System.out.println( "The numbers form a SCALENE triangle." );
        }
      }
   }
   
}