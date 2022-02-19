/*
 * A simple program to calculate n th term of Fibonacci sequance.
 * 
 * This program prints information about the n th term of Fibonacci sequance.
 * 
 * @author Ali Genis
 * @date   17.02.2020
 */
public class Lab01c
{
  
  // body of class
  public static void main ( String args[] )
  {
    
    //Constants
    double GOLDEN_RATIO;                       // formula of the Golden Ratio
    
    // Variables
    int n;                                    // n th Fibonacci number
    double fibonacciSequence;                 // formula of the Fibonacci sequance
    
    // Inputs
    n = 10;
    GOLDEN_RATIO = ( 1 + Math.sqrt(5) ) / 2;
    fibonacciSequence = ( Math.pow(GOLDEN_RATIO,n) - Math.pow( (-1 / GOLDEN_RATIO),n ) ) / Math.sqrt(5);
    
    // Output
    System.out.println( "Fibonacci (" + n + ") is " + Math.round(fibonacciSequence) );
    
  }

}