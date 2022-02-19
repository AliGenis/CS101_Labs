import java.util.ArrayList;
/**
 * Class to create and manipulate site with houses
 * 
 * @author Ali Genis
 * @date 16.05.2020
 */
public class Site
{
   //Constants
   final public int MAX_HOUSES = 10;
   //Variables
   private House[] houseList;
   private int houseCount;
   private String siteName;
   private int residents;
   
   // Constructor
   public Site( String name )
   {
      this.siteName = name;
      this.houseList = new House[ MAX_HOUSES ];
      this.houseCount = 0;
      this.residents = 0;
   }
   
   // Getters
   /**
    * Method to access house list
    * @return list of houses
    */
   public House[] getHouseList()
   {
      return houseList;
   }
   /**
    * Method to access house count
    * @return number of houses
    */
   public int getHouseCount()
   {
      return houseCount;
   }
   /**
    * Method to access name of site
    * @return list of houses
    */
   public String getSiteName()
   {
      return siteName;
   }
   /**
    * Method to access number of residence
    * @return list of houses
    */
   public int getResidents()
   {
      return residents;
   }
   
   // Setters
   /**
    * Method to mutate house count
    * @param desired house count
    */
   public void setHouseCount( int a )
   {
      houseCount = a;
   }
   /**
    * Method to mutate site name
    * @param desired site name
    */
   public void setSiteName( String a )
   {
      siteName = a;
   }
   /**
    * Method to mutate number of residents
    * @param desired residents
    */
   public void setResidents( int a )
   {
      residents = a;
   }
   /**
    * Method to add house to site
    * @param owner of the house
    * @param address of the house
    * @param number of people that living in the house
    * @param fee that must be paid per person
    * @return success of process
    */
   public boolean addHouse( String owner , String address , int folk , double fee )
   {
      if( houseCount < MAX_HOUSES )
      {
         houseList[ houseCount ] = new House( owner , address , folk , fee );
         setHouseCount( getHouseCount() + 1 );
         updateTotalResidents();
         return true;
      }
      return false;
   }
   /**
    * Method to calculate total residents in site
    */
   public void updateTotalResidents()
   {
      residents = 0;
      for( int i = 0; i < houseList.length && houseList[i] != null; i++ ) 
         residents += houseList[i].getResidents();
   }
   /**
    * Method to show houses nicely
    * 
    * @return list of houses in site
    */
   public String viewHouses()
   {
      String s = "\n";
      for( int i = 0; i < houseList.length && houseList[i] != null; i++ )
      {
         s += houseList[i];
         s += "\n";
      }
      if( s.equals( "\n" ) )
         s += "Site is empty!";
      return s;
   }
   /**
    * Method to find houses by service fee they pay
    * @param minimum total service fee
    * @param maximum total service fee
    * @return list of desired houses
    */
   public ArrayList<House> searchHouseByFee( int min , int max )
   {
      ArrayList<House> desiredHouses = new ArrayList<House>();
      for( int i = 0; i < houseList.length && houseList[i] != null; i++ )
      { 
         if( houseList[i].calculateTotalServiceFee() > min && houseList[i].calculateTotalServiceFee() < max )
            desiredHouses.add( houseList[i] );
      }
      return desiredHouses;
   }
}