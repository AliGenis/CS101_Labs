import java.util.Scanner;
import java.util.ArrayList;
/* Lab09b 
 *
 * @author Ali Genis
 * @date 07.05.2020
 */
public class Lab09b 
{
   public static void main( String[] args ) 
   {
      /************* You should not change here unless you want to add more test cases ************/                      
      // constants
      final String test1 = "1 2 2 31";
      final String test2 = "6 5 4 4";
      final String test3 = "1 3 2";
      final String test4 = "1 2 4 5";
      final String test5 = "1 1 1";
      final String test6 = "19 11 7 8 5";
      final String test7 = "";
      final String SEPERATOR = "--------------------------------------";
      
      // variables
      ArrayList<String> testList;
      ArrayList<Boolean> correctResultList;
      
      // program code
      testList = new ArrayList<String>();
      testList.add( test1 );
      testList.add( test2 );
      testList.add( test3 );
      testList.add( test4 );
      testList.add( test5 );
      testList.add( test6 );
      testList.add( test7 );
      
      correctResultList = new ArrayList<Boolean>();
      correctResultList.add( true );
      correctResultList.add( true );
      correctResultList.add( false );
      correctResultList.add( true );
      correctResultList.add( true );
      correctResultList.add( false );
      correctResultList.add( true );
      
      /***********************************************************************************************/
      
      // Here you should use the methods properly and construct the table. 
      System.out.printf( "%30s%n" , "Run \t|  Expected" );
      System.out.println( SEPERATOR );
      for( int i = 0; i < testList.size(); i++)
      {
         System.out.printf( "|  Test %d  " , i + 1 );
         System.out.printf( "|  %-7b" , isMonotonic( parseString( testList.get( i ) ) ) );
         System.out.printf( "|  %-7b" , correctResultList.get( i ) );
         System.out.println();
         System.out.println( SEPERATOR );
      }
   }
   /**
    * Parses the given string and creates a ArrayList with the values
    * @param str String to be parsed
    * @return ArrayList with values parsed from the String str
    */
   public static ArrayList<Integer> parseString( String str ) 
   {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      Scanner scan = new Scanner( str );
      while( scan.hasNextInt() )
         numbers.add( scan.nextInt() );
      return numbers;
   }
   /**
    * Finds out whether the given ArrayList is monotonic or not
    * @param list ArrayList to be checked whether it is monotonic or not
    * @return true or false
    */
   public static boolean isMonotonic( ArrayList<Integer> list ) 
   {
      int caseFinder;
      int caseFinderNumber;
      caseFinder = 0;
      caseFinderNumber = 0;
      
      while( caseFinderNumber < list.size() - 1 && caseFinder == 0 )
      {
         if( list.get( caseFinderNumber ) < list.get( caseFinderNumber + 1 ) )
            caseFinder = 1;
         else if ( list.get( caseFinderNumber ) > list.get( caseFinderNumber + 1 ) )
            caseFinder = -1;
         else
            caseFinderNumber++;
      }
      // Increasing Order
      if( caseFinder == 1 )
      {
         for( int i = 0; i < list.size() - 1; i++ )
         {
            if( list.get( i ) > list.get( i + 1 ) )
               return false;
         }
         return true;
      }
      // Decreasing Order
      if( caseFinder == -1 )
      {
         for( int i = 0; i < list.size() - 1; i++ )
         {
            if( list.get( i ) < list.get( i + 1 ) )
               return false;
         }
         return true;
      }
      // Continuing with same number
      else
         return true;
   }    
}