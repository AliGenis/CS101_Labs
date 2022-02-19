import java.util.Scanner;

/*
 * A simple program to create schedule according to desired courses.
 * 
 * This program prints information about schedule.
 * 
 * @author Ali Genis
 * @date   24.02.2020
 */

public class Lab02b
{
   
   public static void main ( String args[] )
   {
      
      Scanner scan = new Scanner(System.in);
      
      //Variables
      String id;
      String fullName;
      String firstCourse;
      String secondCourse;
      String thirdCourse;
      String fourthCourse;
      
      //Program
      //Student info
      System.out.println( "Student information" );
      System.out.print( "Enter ID: " );
      id = scan.nextLine();
      System.out.print( "\nEnter the full name: " );
      fullName = scan.nextLine();
      
      //Course info
      System.out.println( "\nCourse information" );
      System.out.print( "Enter the first course: " );
      firstCourse = scan.next();
      System.out.println();
      System.out.print( "Enter the second course: " );
      secondCourse = scan.next();
      System.out.println();
      System.out.print( "Enter the third course: " );
      thirdCourse = scan.next();
      System.out.println();
      System.out.print( "Enter the fourth course: " );
      fourthCourse = scan.next();
      System.out.println();
      
      //Schedule
      System.out.println( "The student is \"" + fullName + "\". His/her ID is " + id );
      System.out.println( "Schedule" );
      System.out.println( "| Hour    | Monday\t| Tuesday\t|" );
      System.out.println( "| 8:40    |" + firstCourse + "\t|" + thirdCourse + "\t|" );
      System.out.println( "| 9:40    |" + firstCourse + "\t|" + " -" + "\t|" );
      System.out.println( "|10:40    |" + " -" + "\t|" + fourthCourse + "\t|" );
      System.out.println( "|11:40    |" + secondCourse + "\t|" + " -" + "\t|" );
      
   }
}
