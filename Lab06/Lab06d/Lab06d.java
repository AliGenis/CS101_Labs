import java.util.Scanner;
/*
 * A simple program to play dice rollng game.
 * 
 * @author Ali Genis
 * @date   05.04.2020
 */
public class Lab06d
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Variables
      double money;
      double bet;
      int prediction;
      
      // Program code
      System.out.print( "Enter your total money: " );
      money = scan.nextDouble();
      
      if ( money > 0 )
      {
         do
         {
            System.out.print( "Enter prediction ( 1 for ODD, 2 for EVEN, 3 for EXTREME, 0 for EXIT ): " );
            prediction = scan.nextInt();
            if ( prediction == 1 || prediction == 2 || prediction == 3 )
            {
               System.out.print( "Enter the amount of money you want to bet: " );
               bet = scan.nextDouble();
               
               if ( money >= bet )
                  money += gain( prediction , bet );
               else
                  System.out.println( "Your money is not enough!" );
            }
            
            System.out.println( "Your total money is " + money );
            System.out.println( "************************************" );
         }while( prediction != 0 && money > 0 );
         
         System.out.println( "Goodbye!" );
      }
      else
         System.out.println( "You don't have enough money to play. Go back to you home!!!" );
   }
   
   /*
    * method for rolling dice
    * @param user prediction
    * @param user bet
    * @return sum of two dice
    */
   public static double gain( int prediction , double bet )
   {
      int sum;
      int gain;
      
      sum = (int)( Math.random() * 6 ) + 1;
      sum += (int)( Math.random() * 6 ) + 1;
      gain = 0;
      
      System.out.println( "The sum of the dice is " + sum );
      
      if ( prediction == 1 || prediction == 2 )
      {
         if ( sum % 2 == 1 )
         {
            if ( prediction == 1 )
               gain += bet / 2;
            else
               gain -= bet / 4;
         }
         else
         {
            if ( prediction == 2 )
               gain += bet / 2;
            else
               gain -= bet / 4;
         }
      }
      else if ( prediction == 3 )
      {
         if ( sum == 2 || sum == 12 )
            gain += bet;
         else
            gain -= bet;
      }
      
      return gain;
   }
   
}