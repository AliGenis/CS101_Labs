import java.util.Scanner;

/*
 * A simple program to calculate zodiac sign.
 * 
 * This program prints information about the zodiac sign.
 * 
 * @author Ali Genis
 * @date   02.03.2020
 */

public class Lab03e
{
  
  public static void main ( String[] args )
  {
    
    Scanner scan = new Scanner(System.in);
    
    //Variables
    int day;
    int month;
    
    //Program code
    
    System.out.print( "Please enter your birthday (month and day): " );
    month = scan.nextInt();
    day = scan.nextInt();
    
    //Check the values
    if ( month > 12 || day > 31 )
    {
      if ( month > 12 )
        System.out.print( "You have entered incorrect month!" );
      else if ( month < 13)
        System.out.print( "You have entered incorrect day!" );
      else
        System.out.print( "You have entered incorrect month and day!" );
    }
    else
    {
      //January
      if ( month == 1 )
      {
        if ( day < 20 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Capricorn" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Aquarius" );
      }
      
      //February
      else if ( month == 2 )
      {
        if ( day < 19 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Aquarius" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Pisces" );
      }
      
      //March
      else if ( month == 3 )
      {
        if ( day < 21 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Pisces" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Aries" );
      }
      
      //April
      else if ( month == 4 )
      {
        if ( day < 20 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Aries" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Taurus" );
      }
      
      //May
      else if ( month == 5 )
      {
        if ( day < 21 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Taurus" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Gemini" );
      }
      
      //June
      else if ( month == 6 )
      {
        if ( day < 21 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Gemini" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Cancer" );
      }
      
      //July
      else if ( month == 7 )
      {
        if ( day < 23 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Cancer" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Leo" );
      }
      
      //August
      else if ( month == 8 )
      {
        if ( day < 23 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Leo" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Virgo" );
      }
      
      //September
      else if ( month == 9 )
      {
        if ( day < 23 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Virgo" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Libra" );
      }
      
      //October
      else if ( month == 10 )
      {
        if ( day < 23 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Libra" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Scorpio" );
      }
      
      //November
      else if ( month == 11 )
      {
        if ( day < 22 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Scorpio" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Sagittarius" );
      }
      
      //December
      else if ( month == 12 )
      {
        if ( day < 22 )
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Sagittarius" );
        else
          System.out.println( "The astrologicial sign for " + month + " " + day + " is Capricon" );
      }
    }
    
  }
  
}