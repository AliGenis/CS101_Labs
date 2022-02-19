/*
 * A simple program to calculate BMI and BFP.
 * 
 * This program prints information about the BMI and BFP.
 * 
 * @author Ali Genis
 * @date   17.02.2020
 */
public class Lab01b
{
  
  // body of class 
  
  public static void main ( String args[] )
  {  
    //Constants
    //Written parts on output multi times
    String HEIGHT_PART;
    String WEIGHT_PART;
    String AGE_PART;
    String BMI_PART;
    String BMI_PART2;
    String BFP_PART;
    String BFP_PART2;
   
    
    // Variables
    double weight;
    double height;
    int age;
    double bmi;  //Body Mass Index
    double bfp;  //Ideal Body Fat Percentage
    
    
    
    // Inputs
    weight = 72;
    height = 1.76;
    age = 25;
    HEIGHT_PART = "Based on a height of ";
    WEIGHT_PART = " and weight of ";
    AGE_PART = " and age of ";
    BMI_PART = ", your BMI is ";
    BMI_PART2 = ", your BMI would be ";
    BFP_PART = " and your BFP is ";
    BFP_PART2 = " and your BFP would be ";
    
    // Calculation part
    bmi = weight / (height * height);
    bfp = (1.20 * bmi) + (0.23 * age) - 16.2;
    
    // Outputs
    System.out.println( "weight(kg) : " + weight );
    System.out.println( "height(m) : " + height );
    System.out.println( "age(years) : " + age );
    System.out.println();
    System.out.println( HEIGHT_PART + height + WEIGHT_PART + weight + AGE_PART + age + BMI_PART + bmi + BFP_PART + bfp );
    System.out.println();
    //Calculating again if you would 5 kg more
    weight = weight + 5;
    bmi = weight / (height * height);
    bfp = (1.20 * bmi) + (0.23 * age) - 16.2;
    System.out.println( HEIGHT_PART + height + WEIGHT_PART + weight + AGE_PART + age + BMI_PART2 + bmi + BFP_PART2 + bfp );                  
    System.out.println();                   
    //Calculating again if you would 5 kg less
    weight = weight - 10;
    bmi = weight / (height * height);
    bfp = (1.20 * bmi) + (0.23 * age) - 16.2;
    System.out.println( HEIGHT_PART + height + WEIGHT_PART + weight + AGE_PART + age + BMI_PART2 + bmi + BFP_PART2 + bfp );
                       
  }




}