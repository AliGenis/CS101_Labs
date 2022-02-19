/**
 * Class to test LibaryBook class
 */
public class TestLibaryBook
{
   public static void main ( String[] args )
   {
      LibaryBook b1;
      LibaryBook b2;
      LibaryBook b3;
      
      b1 = new LibaryBook( " " , "asd" );
      b2 = new LibaryBook( " " , "asd" );
      b3 = new LibaryBook( "asd" , " " );
      
      System.out.println( b1 );
      System.out.println( b3 );
      System.out.println( b1 == b3 );
      System.out.println( b1.equals( b3 ) );
      System.out.println( b1.equals( b2 ) );
      System.out.println( b1.hasSameAuthor( b2 ) );
      System.out.println( b2.hasSameTitle( b1 ) );
      System.out.println( b1.hasSameAuthor( b3 ) );
      System.out.println();
      
   }
}