import java.util.Scanner;

public class Lab02c
{
   public static void main ( String args[] )
   {
      
      Scanner scan = new Scanner(System.in);
      
      //Variables
      String sides;
      int lastSpace;
      int count;
      double lengthOfPrism;
      double areaOfTriangle;
      double semiPeimeter;
      double volume;
      
      //Three sides of triangle
      double a;
      double b;
      double c;
      
      //Program
      System.out.print( "We will find the volume of a triangular prism" );
      System.out.print( "\nEnter the side a, b and c(Enter values with a space in between): " );
      a = scan.nextDouble();
      b = scan.nextDouble();
      c = scan.nextDouble();
      System.out.print( "\nEnter the length: " );
      lengthOfPrism = scan.nextDouble();
      
      semiPeimeter = ( a + b + c ) / 2;
      areaOfTriangle = Math.sqrt( semiPeimeter * ( semiPeimeter - a ) * ( semiPeimeter - b ) * ( semiPeimeter - c ) );
      volume = areaOfTriangle * lengthOfPrism;
      
      System.out.println( "The sides of triangle are " + a + ", " + b + " and " + c );
      System.out.println( "The length of the triangular prism is " + lengthOfPrism );
      System.out.printf( "The area of base triangle of the prism with respect to given parameters is " + "%.2f" , areaOfTriangle );
      System.out.printf( "\nThe volume of the prism with respect to given parameters is " + "%.3f" , volume );
   
   }
   



}