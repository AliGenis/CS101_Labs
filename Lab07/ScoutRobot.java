/**
 * A class to create and use robots.
 * 
 * @author Ali Genis
 * @date 20.04.2020
 */
public class ScoutRobot
{
   // Constants
   public static final int VELOCITY = 2;
   public static final int CONSUMED_ENERGY_PER_UNIT = 5;
   
   // Variables
   private static int scoutCounter = 100;
   
   private String robotID;
   private int xCoordinate;
   private int yCoordinate;
   private int direction;
   private double maxBattery;
   private double batteryLeft;
   private boolean condition;
   
   // Consturactor
   public ScoutRobot( int x , int y , double max )
   {
      if ( x >= -5 && x <= 5 && y >= -5 && y <= 5 )
      {
         setRobotID();
         scoutCounter++;
         setXCoordinate( x );
         setYCoordinate( y );
         setBattery( max );
         batteryLeft = maxBattery;
         setDirection( 0 );
         setCondition( true );
      }
      else
         setCondition( false );
   }
   
   // Accessors
   /**
    * Method to access robot ID
    * @return robotID
    */
   public String getRobotID()
   {
      return robotID;
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
   /**
    * Method to access direction
    * @return direction
    */
   public int getDirection()
   {
      return direction;
   }
   /**
    * Method to access max battery
    * @return max battery
    */
   public double getMaxBattery()
   {
      return maxBattery;
   }
   /**
    * Method to access left battery
    * @return left battery
    */
   public double getBatteryLeft()
   {
      return batteryLeft;
   }
   /**
    * Method to access condition
    * @return condition
    */
   public boolean getCondition()
   {
      return condition;
   }
   
   // Mutators
   /**
    * method to create and chance robot ID
    */
   public void setRobotID()
   {
      this.robotID = "Scout-" + scoutCounter;
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
    * method to create and chance robot's max battery
    * @param max battery
    */
   public void setBattery( double max )
   {
      this.maxBattery = max;
   }
   /**
    * method to create and chance robot's condition
    * @param condition
    */
   public void setCondition( boolean a )
   {
      condition = a;
   }
   /**
    * method to create and chance robot's direction
    * @param direction
    */
   public void setDirection( int a )
   {
      direction = a;
   }
   /**
    * method to create and chance robot's battery
    * @param robot's max battery
    */
   public void fixBattery( double battery )
   {
      batteryLeft = battery;
   }
   
   /**
    * Method for robots to travel without passing base.
    * @param desired x coordinate
    * @param desired y coordinate
    * @return it is possible or not going desired coordinates with existing battery
    */
   public boolean goToLocation( int x , int y )
   {
      if ( x <= 5 || x >= -5 || y <= 5 || y >= 5 )
      {
         double time = 0;
         int xDirection;
         int yDirection;
         int moveOnX = x - xCoordinate;
         int moveOnY = y - yCoordinate;
         int moveLength = Math.abs( moveOnX ) + Math.abs( moveOnY );
         
         if ( moveOnX < 0 )
            xDirection = 3;
         else
            xDirection = 1;
         if ( moveOnY < 0 )
            yDirection = 2;
         else
            yDirection = 0;
         
         if ( x == 0  && xCoordinate == 0 && y * yCoordinate  < 0 )
         {
            moveLength += 2;
            if ( batteryLeft > CONSUMED_ENERGY_PER_UNIT * moveLength )
            {
               System.out.printf( "Starting from (%d, %d)%n" , xCoordinate , yCoordinate );
               xCoordinate++;
               System.out.printf( "1 unit on Direction 1 --> (%d, %d)%n" , xCoordinate , yCoordinate );
               yCoordinate += moveOnY;
               System.out.printf( "%d unit(s) on Direction %d --> (%d, %d)%n" , Math.abs( moveOnY ) , yDirection , xCoordinate , yCoordinate );
               setDirection( 3 );
               xCoordinate--;
               System.out.printf( "1 unit on Direction 3 --> (%d, %d)%n" , xCoordinate , yCoordinate );
               batteryLeft -= CONSUMED_ENERGY_PER_UNIT * moveLength;
               time += ( double ) moveLength / VELOCITY;
               System.out.printf( "This move took %.1f time unit(s). The battery left is %.1f/%.1f%n" , time , batteryLeft , maxBattery );
               System.out.println();
               return true;
            }
            return false;
         }
         if ( y == 0  && yCoordinate == 0 && x * xCoordinate  < 0 )
         {
            moveLength += 2;
            if ( batteryLeft > CONSUMED_ENERGY_PER_UNIT * moveLength )
            {
               System.out.printf( "Starting from (%d, %d)%n" , xCoordinate , yCoordinate );
               yCoordinate++;
               System.out.printf( "1 unit on Direction 0 --> (%d, %d)%n" , xCoordinate , yCoordinate );
               xCoordinate += moveOnX;
               System.out.printf( "%d unit(s) on Direction %d --> (%d, %d)%n" , Math.abs( moveOnX ) , xDirection , xCoordinate , yCoordinate );
               setDirection( 2 );
               yCoordinate--;
               System.out.printf( "1 unit on Direction 2 --> (%d, %d)%n" , xCoordinate , yCoordinate );
               batteryLeft -= CONSUMED_ENERGY_PER_UNIT * moveLength;
               time += ( double ) moveLength / VELOCITY;
               System.out.printf( "This move took %.1f time unit(s). The battery left is %.1f/%.1f%n" , time , batteryLeft , maxBattery );
               System.out.println();
               return true;
            }
            return false;
         }
         if ( xCoordinate == 0 || y ==  0 )
         {
            if ( batteryLeft > CONSUMED_ENERGY_PER_UNIT * moveLength )
            {
               System.out.printf( "Starting from (%d, %d)%n" , xCoordinate , yCoordinate );
               if ( moveOnX != 0 )
               {
                  xCoordinate += moveOnX;
                  setDirection ( xDirection );
                  System.out.printf( "%d unit(s) on Direction %d --> (%d, %d)%n" , Math.abs( moveOnX ) , xDirection , xCoordinate , yCoordinate );
               }
               if ( moveOnY != 0 )
               {
                  yCoordinate += moveOnY;
                  setDirection ( yDirection );
                  System.out.printf( "%d unit(s) on Direction %d --> (%d, %d)%n" , Math.abs( moveOnY ) , yDirection , xCoordinate , yCoordinate );
               }
               batteryLeft -= CONSUMED_ENERGY_PER_UNIT * moveLength;
               time += ( double ) moveLength / VELOCITY;
               System.out.printf( "This move took %.1f time unit(s). The battery left is %.1f/%.1f%n" , time , batteryLeft , maxBattery );
               System.out.println();
               return true;
            }
            return false;
         }
         else
         {
            if ( batteryLeft > CONSUMED_ENERGY_PER_UNIT * moveLength )
            {
               System.out.printf( "Starting from (%d, %d)%n" , xCoordinate , yCoordinate );
               if ( moveOnY != 0 )
               {
                  yCoordinate += moveOnY;
                  setDirection ( yDirection );
                  System.out.printf( "%d unit(s) on Direction %d --> (%d, %d)%n" , Math.abs( moveOnY ) , yDirection , xCoordinate , yCoordinate );
               }
               if ( moveOnX != 0 )
               {
                  xCoordinate += moveOnX;
                  setDirection ( xDirection );
                  System.out.printf( "%d unit(s) on Direction %d --> (%d, %d)%n" , Math.abs( moveOnX ) , xDirection , xCoordinate , yCoordinate );
               }
               batteryLeft -= CONSUMED_ENERGY_PER_UNIT * moveLength;
               time += ( double ) moveLength / VELOCITY;
               System.out.printf( "This move took %.1f time unit(s). The battery left is %.1f/%.1f%n" , time , batteryLeft , maxBattery );
               System.out.println();
               return true;
            }
            return false;
         }
      }
      return true;
   }
   /**
    * Simple method to call mechanic
    * @param mechanic object
    */
   public void callMechanic( Mechanic m )
   {
      m.teleportation( xCoordinate , yCoordinate );
      System.out.println( "A mechanic has been summoned." );
      m.fixRobot( this );
      System.out.println( this );
      System.out.println();
   }
   /**
    * Method for nicely show the "this"
    * @return String representation of "this"
    */
   public String toString()
   {
      return "ScoutRobot{robotID='" + robotID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate +
         ", direction=" + direction + ", batteryLeft=" + batteryLeft + "}";
   }
   /**
    * Method for comparing distance to the base between robots
    * @param another robot object
    * @return an integer representation for each situation
    */
   public int compareRobots( ScoutRobot r )
   {
      double rToBase;
      double thisToBase;
      
      rToBase = Math.sqrt( Math.pow( r.getXCoordinate() , 2 ) + Math.pow( r.getYCoordinate() , 2 ) );
      thisToBase = Math.sqrt ( Math.pow ( getXCoordinate() , 2 ) + Math.pow( getYCoordinate() , 2 ) );
      
      if( rToBase < thisToBase )
         return 1;
      if( thisToBase > rToBase )
         return -1;
      return 0;
   }
   
}