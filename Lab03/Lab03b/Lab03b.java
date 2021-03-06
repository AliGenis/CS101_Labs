import java.util.Scanner;

/*
 * A simple program to calculate the BFP and health condition.
 * 
 * This program prints information about the BFP and health condition.
 * 
 * @author Ali Genis
 * @date   02.03.2020
 */

public class Lab03b
{
  
  public static void main ( String args[] )
  {  
    Scanner scan = new Scanner(System.in);
    
    // Variables
    double weight;
    double height;
    int age;
    double bmi;  //Body Mass Index
    double bfp;  //Ideal Body Fat Percentage
    
    //Program code
    
    System.out.print( "Please enter age: " );
    age = scan.nextInt();
    System.out.print( "Please enter weight(kg): " );
    weight = scan.nextDouble();
    System.out.print( "Please enter height(m): " );
    height = scan.nextDouble();
    
    // Calculation part
    bmi = weight / (height * height);
    bfp = ( 1.20 * bmi ) + ( 0.23 * age ) - 16.2;
    
    System.out.printf( "Based on a height of " + height + " and weight of " + weight + " and age of " + age + ", your BFP is " + "%.2f" , bfp );
    System.out.println();
    
    //Under 18 and above 80 age
    if ( age < 18 || age > 79 )
      System.out.println( "Your age have to be between 18-79 in order to calculate helth condition." );

    // 18 - 40 age
    if ( age > 17 && age < 41 )
    {
       if ( bfp < 21 )
          System.out.println( "--> UNDERFAT" );
       if ( bfp >= 21 && bfp < 33 )
          System.out.println( "--> HEALTHY" );
       if ( bfp >= 33 && bfp <= 39 )
          System.out.println( "--> OVERWEIGHT" );
       if ( bfp > 39 )
          System.out.println( "--> OBESE" );
    }
    
    // 41 - 60 age
    if ( age > 40 && age < 61 )
    {
       if ( bfp < 23 )
          System.out.println( "--> UNDERFAT" );
       if ( bfp >= 23 && bfp < 35 )
          System.out.println( "--> HEALTHY" );
       if ( bfp >= 35 && bfp <= 40 )
          System.out.println( "--> OVERWEIGHT" );
       if ( bfp > 40 )
          System.out.println( "--> OBESE" );
    }
    
    // 61 - 79 age
    if ( age > 60 && age < 80 )
    {
       if ( bfp < 24 )
          System.out.println( "--> UNDERFAT" );
       if ( bfp >= 24 && bfp < 36 )
          System.out.println( "--> HEALTHY" );
       if ( bfp >= 36 && bfp <= 42 )
          System.out.println( "--> OVERWEIGHT" );
       if ( bfp > 42 )
          System.out.println( "--> OBESE" );
    }
                       
  }

}