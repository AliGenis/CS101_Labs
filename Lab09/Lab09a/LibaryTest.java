import java.util.Scanner;
/**
 * Program to run a libary.
 * 
 * @author Ali Genis
 * @date 27.04.2020
 */
public class LibaryTest
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      Libary myLibary = new Libary();
      
      // Variables
      int option;
      int subOption1;
      int subOption2;
      String newTitle;
      String newAuthor;
      
      // Program code
      do
      {
         System.out.println( "1-Show" );
         System.out.println( "2-Find" );
         System.out.println( "3-Add" );
         System.out.println( "4-Exit" );
         System.out.print( "Choose an option: " );
         option = scan.nextInt();
         scan.nextLine();
         
         // Show
         if( option == 1 )
            System.out.println( myLibary );
         // Find
         else if ( option == 2 )
         {
            System.out.println( "1-By Title" );
            System.out.println( "2-By Author" );
            System.out.print( "Choose an option: " );
            subOption1 = scan.nextInt();
            scan.nextLine();
            if( subOption1 == 2 )
            {
               System.out.print( "Enter an author: " );
               newAuthor = scan.nextLine();
               if( myLibary.findByAuthor( newAuthor ) != null )
               {
                  for( int i = 0; i < myLibary.findByAuthor( newAuthor ).size(); i++ )
                  {
                     System.out.println( myLibary.findByAuthor( newAuthor ).get( i ) );
                  }
                     
               }
               else
                  System.out.println( "We do not have any book written by " + newAuthor );
            }
            
            else if( subOption1 == 1 )
            {
               System.out.print( "Enter a title: " );
               newTitle = scan.nextLine();
               // Sub-menu
               if( myLibary.findByTitle( newTitle ) != null )
               {
                  do
                  {
                     System.out.println( "1-Loan" );
                     System.out.println( "2-Return" );
                     System.out.println( "3-Remove" );
                     System.out.println( "4-Return to Main Menu" );
                     System.out.print( "Choose an option: " );
                     subOption2 = scan.nextInt();
                     
                     if( subOption2 == 1 )
                        ( myLibary.findByTitle( newTitle ) ).loanBook() ;   
                     if( subOption2 == 2 )
                        ( myLibary.findByTitle( newTitle ) ).returnBook();
                     if( subOption2 == 3 && !( myLibary.remove( ( myLibary.findByTitle( newTitle ) ) ) ) )
                        System.out.println( "Book cannot remove! It is on loan." );
                     else if ( subOption2 == 3 )
                        System.out.println( "Book removed successfully!" );
                     
                  }while( subOption2 > 4 || subOption2  < 1 );
               }
            }
         }
         // Add
         else if ( option == 3 )
         {
            System.out.print( "Enter a title: " );
            newTitle = scan.nextLine();
            System.out.print( "Enter an author: " );
            newAuthor = scan.nextLine();
            if( myLibary.add( newTitle , newAuthor ) )
               System.out.printf( "The book with title \"%s\" has been added to the libary.%n" , newTitle );
            else
               System.out.println( "Your libary is full!" );
         }
      }while( option != 4 );
      System.out.println( "Goodbye!" );
   }
}