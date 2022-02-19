import java.util.Calendar;
/**
 * Class to create and manipulate book.
 */
public class LibaryBook
{   
   private Calendar cal = Calendar.getInstance();
   
   // Variables
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;
   private int loanStatus;
   
   // Consturactor
   public LibaryBook( String t , String a )
   {
      setTitle( t );
      setAuthor( a );
      setTimesLoaned( 0 );
      setLoanStatus( 0 );
      resetDueDate();
   }
   // Copy Consturactor
   public LibaryBook( LibaryBook a )
   {
      setTitle( a.title );
      setAuthor( a.author );
      setTimesLoaned( a.timesLoaned );
      setLoanStatus( a.loanStatus );
      dueDate = a.dueDate;
   }
   
   // Accessors
   
   /**
    * Method to access title.
    * 
    * @return title of a book.
    */
   public String getTitle()
   {
      return title;
   }
   /**
    * Method to access author.
    * 
    * @return author of a book.
    */
   public String getAuthor()
   {
      return author;
   }
   /**
    * Method to access due date.
    * 
    * @return due date of a book.
    */
   public String getDueDate()
   {
      return dueDate;
   }
   /**
    * Method to access loaned times.
    * 
    * @return loaned times of a book.
    */
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   /**
    * Method to access loan status.
    * 
    * @return loan status of a book.
    */
   public int getLoanStatus()
   {
      return loanStatus;
   }
   
   // Mutators
   
   /**
    * Method to set & change title.
    * 
    * @param desired title of a book.
    */
   public void setTitle( String t )
   {
      this.title = t;
   }
   /**
    * Method to set & change author.
    * 
    * @param desired author of a book.
    */
   public void setAuthor( String a )
   {
      this.author = a;
   }
   /**
    * Method to reset due date.
    */
   public void resetDueDate()
   {
      this.dueDate = "";
   }
   /**
    * Method to set due date.
    */
   public void setDueDate()
   {
      cal.add( Calendar.DATE , 15 );
      this.dueDate = cal.get( Calendar.DATE ) + "." + cal.get( Calendar.MONTH ) + "." + cal.get( Calendar.YEAR );
      cal = Calendar.getInstance();
   }
   /**
    * Method to set & change times loaned.
    * 
    * @param number of times loaned of a book.
    */
   public void setTimesLoaned( int a )
   {
      this.timesLoaned = a;
   }
   /**
    * Method to set & change loan status.
    * 
    * @param loan status of a book.
    */
   public void setLoanStatus( int a )
   {
      this.loanStatus = a;
   }
   
   /**
    * Method for loan the book.
    */
   public void loanBook()
   {
      if( !onLoan( loanStatus ) )
      {
         setDueDate();
         setTimesLoaned( getTimesLoaned() + 1 );
         setLoanStatus( 1 );
      }
      else
         System.out.println( "This book is on loan until " + getDueDate() );
   }
   /**
    * Method for return the book.
    */
   public void returnBook()
   {
      if( onLoan( loanStatus ) )
      {
         resetDueDate();
         setLoanStatus( 0 );
      }
      else
         System.out.println( "The book is already returned!" );
   }
   /**
    * Method for loan the book.
    * 
    * @param on loan integer value
    * @return book's loan status
    */
   public boolean onLoan( int a )
   {
      if ( a == 1 )
         return true;
      return false;
   }
   /**
    * Method for compare the books.
    * 
    * @param other book
    * @return equality status
    */
   public boolean equals( LibaryBook other )
   {
      if( author.equals( other.author ) && title.equals ( other.title ) )
         return true;
      return false;
   }
   /**
    * Method for compare the books by title.
    * 
    * @param other book
    * @return equality status by title
    */
   public boolean hasSameTitle( LibaryBook other )
   {
      if( title.equals( other.title ) )
         return true;
      return false;
   }
   /**
    * Method for compare the books by author.
    * 
    * @param other book
    * @return equality status by author
    */
   public boolean hasSameAuthor( LibaryBook other )
   {
      if( author.equals( other.author ) )
         return true;
      return false;
   }
   /**
    * Method for show book nicely.
    * 
    * @return string representation of a book
    */
   public String toString()
   {
      return "{Title: " + getTitle() + ", Author: " + getAuthor() + ", Due Date: " + getDueDate() + ", Times Loaned: " + getTimesLoaned() + "}";
   }

}