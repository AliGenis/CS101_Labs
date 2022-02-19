import java.util.Scanner;

/*
 * A simple program to show time difference.
 * 
 * This program prints information about time difference between two times.
 * 
 * @author Ali Genis
 * @date   24.02.2020
 */

public class Lab02d
{
   public static void main ( String args[] )
   {
      
      Scanner scan = new Scanner (System.in);
      
      //Variables
      int hour1;
      int minute1;
      int hour2;
      int minute2;
      int hourDifference;
      int minuteDifference;
      int timeDifference;
      int firstTime;
      int secondTime;
      
      //Program
      System.out.print( "First time is: " );
      firstTime = scan.nextInt();
      System.out.print( "\nSecond time is: " );
      secondTime = scan.nextInt();
      
      hour1 = firstTime / 100;
      minute1 = firstTime % 100;
      hour2 = secondTime / 100;
      minute2 = secondTime % 100;
      minute1 = ( hour1 * 60 ) + minute1;
      minute2 = ( hour2 * 60 ) + minute2;
      timeDifference = minute2 - minute1;
      hourDifference = timeDifference / 60;
      minuteDifference = timeDifference % 60;
      
      System.out.println( hourDifference + " Hour(s) " + minuteDifference + " Minute(s)" );
      
   }
}