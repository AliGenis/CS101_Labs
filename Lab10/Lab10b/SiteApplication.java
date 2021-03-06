import java.util.Scanner;
/**
 * Application for create and make adjustments in the site
 * 
 * @author Ali Genis
 * @date 16.05.2020
 */
public class SiteApplication
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      Site site;
      int choice;
      String name;
      String address;
      int number;
      double charge;
      int min;
      int max;
      
      // Program code
      System.out.print( "Enter name of site: " );
      site = new Site( scan.nextLine() );
      do
      {  
         //Menu
         System.out.println( "1-Add House" );
         System.out.println( "2-View Houses" );
         System.out.println( "3-Search Houses by Fee" );
         System.out.println( "4-Exit" );
         System.out.print( "Enter choice: " );
         choice = scan.nextInt();
         
         if( choice < 1 || choice > 4 )
            System.out.println( "Invalid Choice!!" );
         //Add
         else if ( choice == 1 )
         {
            scan.nextLine();
            System.out.print( "Enter Owner Name: " );
            name = scan.nextLine();
            System.out.print( "Enter Address: " );
            address = scan.nextLine();
            System.out.print( "Enter number of residents: " );
            number = scan.nextInt();
            System.out.print( "Enter service charge: " );
            charge = scan.nextDouble();
            
            if( site.addHouse( name , address , number , charge ) )
               System.out.println( "House Added Successfully!" );
            else
               System.out.println( "House cannot be added to the site!" );
         }
         //View
         else if ( choice == 2 )
         {
            System.out.println( "List of Houses in " + site.getSiteName() );
            System.out.println( site.viewHouses() );
            System.out.println( "\nTotal Residents on Site: " + site.getResidents() );
         }
         //Search by fee
         else if ( choice == 3 )
         {
            System.out.print( "Enter minimum and maximum fee: " );
            min = scan.nextInt();
            max = scan.nextInt();
            System.out.printf( "Houses on site with between %d and %d TL:%n" , min , max );
            System.out.println( site.searchHouseByFee( min , max ) );
         }
      }while( choice != 4 );
      System.out.println( "Goodbye!" );
   }
}