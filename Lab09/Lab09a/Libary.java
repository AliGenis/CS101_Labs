import java.util.ArrayList;
/**
 * Class to crate and manipulate libary
 */
public class Libary
{
   // Variables
   ArrayList<LibaryBook> books;

   //Consturactor
   public Libary()
   {
      books = new ArrayList<LibaryBook>();
   }
   
   /**
    * Checks the libary is empty or not.
    * 
    * @return libary is empty or not
    */
   public boolean isEmpty()
   {
      if( books.size() == 0 )
         return true;
      return false;
   }
   /**
    * @return string representation of libary
    */
   public String toString()
   {
      String s;
      s = "";
      if( !isEmpty() )
      {
         for( int i = 0; i < books.size(); i++ )
            s += books.get( i ) + "\n";
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
      LibaryBook newBook;
      newBook = new LibaryBook( t , a );
      
      if( books.size() == 0 )
      {
         books.add( newBook );
         return true;
      }
      else
      {
         for( int i = 0; i < books.size(); i++ )
         {
            if( newBook.getAuthor().compareTo( books.get( i ).getAuthor() ) < 0 )
            {
               books.add( i , newBook );
               return true;
            }
            else if( newBook.getAuthor().compareTo( books.get( i ).getAuthor() ) == 0 )
            {  
               if( newBook.getTitle().compareTo( books.get( i ).getTitle() ) < 0 )
               {
                  books.add( i , newBook );
                  return true;
               }
            }
         }
         books.add( newBook );
         return true;
      }
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
         books.remove( book );
         return true;
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
      for( int i = 0; i < books.size(); i++ )
      {
         if( books.get( i ).getTitle().equals( title ) )
            return books.get( i );
      }
      return null;
   }
   /**
    * Finds objects according to author
    * 
    * @param author of the book
    * @return list of book from this author
    */
   public ArrayList<LibaryBook> findByAuthor( String author )
   {
      ArrayList<LibaryBook> wantedBooks;
      wantedBooks = new ArrayList<LibaryBook>();
      
      for( int i = 0; i < books.size(); i++ )
      {
         if( books.get( i ).getAuthor().equals( author ) )
            wantedBooks.add( books.get( i ) );
      }
      return wantedBooks;
   }
}