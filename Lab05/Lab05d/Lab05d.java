import java.util.Scanner;

/*
 * A simple program to make string or math calculations with the help of the menu.
 * 
 * This program prints information about semazen-strings and geometric sequance.
 * 
 * @author Ali Genis
 * @date   22.03.2020
 */

public class Lab05d
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      String selection;
      String firstString;
      String secondString;
      String newString;
      String commonCharacters;
      String firstLetter;
      String sameLetter;
      double r;                 // common ratio
      double a;                 // first term
      double precision;
      double calculatedResult;
      double realResult;
      boolean semazen;
      
      // Program code
      do
      {
         System.out.println( "**** Make your selection ****" );
         System.out.println( "Strings" );
         System.out.println( "Math" );
         System.out.println( "Exit" );
         System.out.print( "Your selection: " );
         selection = scan.nextLine();
         
         if ( selection.equalsIgnoreCase( "strings" ) )
         {
            semazen = false;
            commonCharacters = "";
            
            System.out.println( "** Semazen-Strings **" );
            System.out.print( "Enter a string: " );
            firstString = scan.nextLine();
            System.out.print( "Enter another string: " );
            secondString = scan.nextLine();
            
            
            newString = firstString;
            for ( int i = 0; i < firstString.length(); i++)
            {
               newString = newString.substring( 1 , newString.length() );
               newString += Character.toString( firstString.charAt(i) );
               if ( secondString.equalsIgnoreCase( newString ) )
                  semazen = true;
            }
            
            if ( semazen )
               System.out.println( "They are semazen-strings." );
            else
            {
               System.out.print( "Common characters: " );
               for ( int i = 0; i < firstString.length(); i++)
               {
                  for ( int j = 0; j < secondString.length(); j++)
                  {
                     if ( firstString.charAt(i) == secondString.charAt(j) )
                        commonCharacters += Character.toString( firstString.charAt(i) ) + " " ;
                  }
               }
               
               for ( int f = 0; f < commonCharacters.length() - 1; f += 2 )
               {
                  firstLetter = Character.toString( commonCharacters.charAt( f ) );
                  for ( int s = 2; s < commonCharacters.length() - 1; s += 2 )
                  {
                     sameLetter = Character.toString( commonCharacters.charAt( s ) );
                     if ( firstLetter.equalsIgnoreCase( sameLetter ) && f != s )
                     {
                        commonCharacters = commonCharacters.substring( 0 , s ) + commonCharacters.substring( s + 2 , commonCharacters.length() );
                        s -= 2;
                        f = -2;
                     }  
                  }
               }
               System.out.println( commonCharacters );
            }
            
         }
         
         if ( selection.equalsIgnoreCase( "math" ) )
         {
            System.out.println( "** Infinite Geometric Sum Calculation **" );
            System.out.print( "Enter an r: " );
            r = scan.nextDouble();
            System.out.print( "Enter an a: " );
            a = scan.nextDouble();
            System.out.print( "Enter presicion: " );
            precision = scan.nextDouble();
            
            realResult = a / ( 1 - r );
            
            for ( calculatedResult = a; Math.abs( realResult - calculatedResult ) > precision; a = a * r)
            {
               System.out.println( "Current result is: " + calculatedResult );
               calculatedResult += a * r;
            }  
            System.out.println( "Result is: " + calculatedResult );
         }
         
         if ( selection.equalsIgnoreCase( "exit" ) )
            System.out.println( "Goodbye!" );
         
      }while ( !selection.equalsIgnoreCase( "exit" ) );
      
   }
   
}