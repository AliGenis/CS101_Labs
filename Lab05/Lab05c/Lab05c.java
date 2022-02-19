import java.util.Scanner;

/*
 * A simple program to draw desired pattern.
 *  
 * @author Ali Genis
 * @date   23.03.2020
 */

public class Lab05c
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Constants
      final String STAR = "*";
      final String SPACE = " ";
      
      // Variables
      String checkContinue;
      int width;
      int height;
      int thickness;
      
      do
      {
         System.out.print( "Enter a width, height and thickness: " );
         width = scan.nextInt();
         height = scan.nextInt();
         thickness = scan.nextInt();
         
         if ( width > 0 && height > 0 && thickness > 0 )
         {
            for ( int h = 1; h <= height; h++ )
            {
               for ( int w = 1; w <= width; w++ )
               {
                  if ( h == height / 2 && ( height / 2 ) > thickness )
                  {
                     //first line
                     for ( int t = 1; t <= thickness; t++ )
                        System.out.print( STAR );
                     for ( int s = 1; s <= width - ( thickness * 2 ); s++ )
                        System.out.print( SPACE );
                     for ( int t = 1; t <= thickness; t++ )
                        System.out.print( STAR );
                     System.out.println();
                     h++;
                     //second line
                     for ( int t = 1; t <= thickness; t++ )
                        System.out.print( STAR );
                     for ( int s = 1; s <= width - ( thickness * 2 ); s++ )
                        System.out.print( SPACE );
                     for ( int t = 1; t <= thickness; t++ )
                        System.out.print( STAR );
                     System.out.println();
                     h++;
                     w--;
                  }
                  
                  else
                     System.out.print( STAR );
                     
               }

               System.out.println();
            }
            if ( ( height / 2 ) <= thickness )
               System.out.println( "Oops.. no hole!" );
         }
         
         else
            System.out.println( "Error: All values must be positive!" );
         
         System.out.print( "Enter Y or y to continue: " );
         checkContinue = scan.next();
         
      }while ( checkContinue.equalsIgnoreCase( "y" ) );
      
      System.out.println( "Goodbye!" );
      
   }
    
}