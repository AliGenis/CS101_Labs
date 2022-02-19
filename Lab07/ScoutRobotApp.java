/**
 * An app to use robots and mechanic.
 * 
 * @author Ali Genis
 * @date 20.04.2020
 */

public class ScoutRobotApp
{
   public static void main ( String[] args )
   {
      // Constants
      String SEPERATOR = "---------------";
      
      // Variables
      ScoutRobot robot1;
      ScoutRobot robot2;
      Mechanic mechanic1;
      
      robot1 = new ScoutRobot( 0 , 0 , 100 );
      robot2 = new ScoutRobot( 0 , 0 , 100 );
      mechanic1 = new Mechanic( 0 , 0 );
      
      System.out.println( robot1 );
      System.out.println( robot2 );
      System.out.println( mechanic1 );
      
      // Robot1 Part
      System.out.println();
      System.out.println( SEPERATOR + robot1.getRobotID() + SEPERATOR );
      if( !robot1.goToLocation( 2 , 3 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot1.callMechanic( mechanic1 );
         robot1.goToLocation( 2 , 3 );
      }
      if( !robot1.goToLocation( -2 , 0 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot1.callMechanic( mechanic1 );
         robot1.goToLocation( -2 , 0 );
      }
      if( !robot1.goToLocation( 3 , 0 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot1.callMechanic( mechanic1 );
         robot1.goToLocation( 3 , 0 );
      }
      if( !robot1.goToLocation( 0 , 5 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot1.callMechanic( mechanic1 );
         robot1.goToLocation( 0 , 5 );
      }
   
      
      // Robot2 Part
      System.out.println();
      System.out.println( SEPERATOR + robot2.getRobotID() + SEPERATOR );
      if( !robot2.goToLocation( 3 , -4 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot2.callMechanic( mechanic1 );
         robot2.goToLocation( 3 , -4 );
      }
      if( !robot2.goToLocation( 0 , 3 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot2.callMechanic( mechanic1 );
         robot2.goToLocation( 0 , 3 );
      }
      if( !robot2.goToLocation( 0 , -4 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot2.callMechanic( mechanic1 );
         robot2.goToLocation( 0 , -4 );
      }
      if( !robot2.goToLocation( 1 , 2 ) )
      {
         System.out.println( "There is no enough battery.\n" );
         robot2.callMechanic( mechanic1 );
         robot2.goToLocation( 1 , 2 );
      }
      
      // Comparing robots
      System.out.println( SEPERATOR + SEPERATOR );
      if( robot1.compareRobots( robot2 ) == 1 )
         System.out.println( robot2.getRobotID() + " is closer to the base than " + robot1.getRobotID() );
      else if( robot1.compareRobots( robot2 ) == -1 )
         System.out.println( robot1.getRobotID() + " is closer to the base than " + robot2.getRobotID() );
      else if( robot1.compareRobots( robot2 ) == 0 )
         System.out.println( robot2.getRobotID() + " and " + robot1.getRobotID()  + " are have same distance to base." );
      
   }
   
}