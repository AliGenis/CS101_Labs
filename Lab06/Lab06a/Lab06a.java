import java.util.Scanner;
/*
 * A simple program to convert decimal number to binary.
 * 
 * @author Ali Genis
 * @date   04.04.2020
 */
public class Lab06a
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      int n;                    //user input as a decimal value
      String binary;
      int decimal;
      
      // Program code
      System.out.print( "Enter an integer n: " );
      n = scan.nextInt();
      binary = toBinary( n );
      decimal = toDecimal( binary );
      System.out.println( "The binary representation is " + binary );
      System.out.println( "The decimal value is " + decimal );
      if ( decimal == n )
         System.out.println( "They are equal." );   
   }
   
   /* method for converting decimal to binary
    * @param user input n
    * @return binary version of that input
    */
   public static String toBinary( int n )
   {
      String binaryString = "";
      int i = 0;
      
      while( powerOfTwo( i ) < n )
         i++;
      while ( i >= 0 )
      {
         if( powerOfTwo( i ) <= n )
         {
            binaryString += 1;
            n -= powerOfTwo( i );
         }
         else if ( binaryString != "" )
            binaryString += 0;
         i--;
      }
      return binaryString;      
   }
   
   /* method for converting binary to decimal
    * @param binary number
    * @return decimal version of that binary number
    */
   public static int toDecimal( String binary )
   {
      int decimalNumber = 0;
      
      while ( binary.length() > 0 )
      {
         if ( binary.charAt( 0 ) == '1' )
            decimalNumber += powerOfTwo( binary.length() - 1 );
         if ( binary.length() == 1 )
            return decimalNumber;
         binary = binary.substring( 1 , binary.length() );
      }
      return decimalNumber;
   }
   
   /* method for calculating 2^power
    * @param desired non-negative power
    * @return power th power of two
    */
   public static int powerOfTwo( int power )
   {
      int number;
      
      number = 1;
      if ( power >= 1 )
      {
         for ( int i = 0; i < power; i++)
            number = number * 2;
         return number;
      }
      return 1;
   }
   
}