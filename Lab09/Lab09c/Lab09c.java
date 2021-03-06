import java.util.Scanner;
import java.util.ArrayList;
/**
 * Simple program to calculate some products.
 * 
 * @author Ali Genis
 * @date 10.05.2020
 */
public class Lab09c
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      //Variables
      ArrayList<Integer> values;
      int newNumber;
      
      values = new ArrayList<Integer>();
      
      // Program code
      System.out.print( "Please enter the values: " );
      newNumber = scan.nextInt();
      while( newNumber != 0 )
      {
         values.add( newNumber );
         newNumber = scan.nextInt();
      }
      System.out.print( "Output list(1): " );
      System.out.println( solution1( values ) );
      System.out.print( "Output list(2): " );
      System.out.println( solution2( values ) );
      
   }
   /**
    * Method for calculating products of integers except one of them
    * 
    * @param all integer values
    * @return desired product values
    */
   public static ArrayList<Integer> solution1( ArrayList<Integer> all )
   {
      int productAll;
      ArrayList<Integer> desiredProducts;
      
      productAll = 1;
      desiredProducts = new ArrayList<Integer>();
      
      for( int number: all )
         productAll *= number;
      for( int number: all )
         desiredProducts.add( productAll / number );
      return desiredProducts;
   }
   /**
    * Method for calculating products of integers except one of them(in different way)
    * 
    * @param all integer values
    * @return desired product values
    */
   public static ArrayList<Integer> solution2( ArrayList<Integer> all )
   {
      int product;
      ArrayList<Integer> desiredProducts;
      
      desiredProducts = new ArrayList<Integer>();
      
      for( int i = 0; i < all.size(); i++ )
      {
         product = 1;
         for( int j = 0; j < all.size(); j++ )
         {
            if( i != j )
               product *= all.get( j );
         }
         desiredProducts.add( product );
      }
      return desiredProducts;
   }
   
}