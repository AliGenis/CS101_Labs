/**
 * A class to create mechanic and fix other robots.
 * 
 * @author Ali Genis
 * @date 20.04.2020
 */
public class Mechanic
{
   // Variables
   private static int mechanicCounter = 10;
   private String mechanicID;
   private int xCoordinate;
   private int yCoordinate;
   
   // Consturactor
   public Mechanic( int x , int y )
   {
      setMechanicID();
      mechanicCounter++;
      setXCoordinate( x );
      setYCoordinate( y );
   }
   
   // Accessors
   /**
    * Method to access robot ID
    * @return robotID
    */
   public String getMechanicID()
   {
      return mechanicID;
   }
   /**
    * Method to access x coordinate
    * @return x coordinate
    */
   public int getXCoordinate()
   {
      return xCoordinate;
   }
   /**
    * Method to access y coordinate
    * @return y coordinate
    */
   public int getYCoordinate()
   {
      return yCoordinate;
   }
   
   // Mutators
   /**
    * method to create and chance robot ID
    */
   public void setMechanicID()
   {
      this.mechanicID = "Mechanic-" + mechanicCounter;
   }
   /**
    * method to create and chance robot's x coordinate
    * @param x coordinate
    */
   public void setXCoordinate( int x )
   {
      this.xCoordinate = x;
   }
   /**
    * method to create and chance robot's y coordinate
    * @param y coordinate
    */
   public void setYCoordinate( int y )
   {
      this.yCoordinate = y;
   }
   /**
    * Method for teleport mechanic.
    * @param x coordinate
    * @param y coordinate
    */
   public void teleportation( int x , int y )
   {
      if( x >= -5 && x <= 5 && y >= -5 && y <= 5 )
      {
         setXCoordinate( x );
         setYCoordinate( y );
      }
   }
   /**
    * Method for make scout robot's battery maximum.
    * @param a robot to fix
    */
   public void fixRobot( ScoutRobot robot )
   {
      robot.fixBattery( robot.getMaxBattery() );
      System.out.println( "The robot has been fixed." );
      this.teleportation( 0 , 0 );
      System.out.println( "I have returned to the base.\n" );
   }
   /**
    * Method for nicely show the "this"
    * @return String representation of "this"
    */
   public String toString()
   {
      return "Mechanic{mechanicID='" + mechanicID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + "}";
   }
   
   
}