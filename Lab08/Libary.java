/**
 * Class to crate and manipulate libary
 */
public class Libary
{
   // Variables
   LibaryBook b1;
   LibaryBook b2;
   LibaryBook b3;
   LibaryBook b4;
   
   //Consturactor
   public Libary()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   /**
    * Checks the libary is empty or not.
    * 
    * @return libary is empty or not
    */
   public boolean isEmpty()
   {
      if( b1 == null && b2 == null && b3 == null && b4 == null )
         return true;
      return false;
   }
   /**.
    * @return string representation of libary
    */
   public String toString()
   {
      String s;
      s = "";
      if( !isEmpty() )
      {
         if( b1 != null )
            s += b1 + "\n";
         if( b2 != null )
            s += b2 + "\n";
         if( b3 != null )
            s += b3 + "\n";
         if( b4 != null )
            s += b4 + "\n";
         return s;
      }
      else
         return "Libary is empty!";
   }
   /**
    * Adds new book to first empty place pn libary.
    * 
    * @param title of a book
    * @param author of a book
    * @return according to available place on libary
    */
   public boolean add( String t , String a )
   {
      if( b1 == null )
      {
         b1 = new LibaryBook( t , a );
         return true;
      }
      if( b2 == null )
      {
         b2 = new LibaryBook( t , a );
         return true;
      }
      if( b3 == null )
      {
         b3 = new LibaryBook( t , a );
         return true;
      }
      if( b4 == null )
      {
         b4 = new LibaryBook( t , a );
         return true;
      }
      return false;
   }
   /**
    * Removes desired book from libary
    * 
    * @return succes of process
    */
   public boolean remove( LibaryBook book )
   {
      if( !book.onLoan( book.getLoanStatus() ) )
      {
         if( b1 != null && book.equals( b1 ) )
         {
            b1 = null;
            return true;
         }
         if( b2 != null && book.equals( b2 ) )
         {
            b2 = null;
            return true;
         }
         if( b3 != null && book.equals( b3 ) )
         {
            b3 = null;
            return true;
         }
         if( b4 != null && book.equals( b4 ) )
         {
            b4 = null;
            return true;
         }
      }
      return false;
   }
   /**
    * Finds desired object according to title
    * 
    * @param title of the book
    * @return desired LibaryBook object
    */
   public LibaryBook findByTitle( String title )
   {
      if( b1 != null && ( b1.getTitle() ).equals( title ) )
         return b1;
      if( b2 != null && ( b2.getTitle() ).equals( title ) )
         return b2;
      if( b3 != null && ( b3.getTitle() ).equals( title ) )
         return b3;
      if( b4 != null && ( b4.getTitle() ).equals( title ) )
         return b4;
      return null;
   }
}