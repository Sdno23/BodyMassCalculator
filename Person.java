/*
 * @author XXXXX08
 *
 * @version 1.0 06/07/2020
 *
 * Title: Calculating Person's BMI
 *
 * Semester: Summer 2020
 *
 * Lecturer's Name: C. Charters
 */
package bodymasscalculator;
import java.text.DecimalFormat;

/**
 *
 * @author XXXXX08
 */
public class Person {
    
    private String firstName;
    private double  heightInches;
    private double weightPounds;
    private double bmi;
    DecimalFormat df = new DecimalFormat("#0.00");
    
    public Person (String aFirstName, double aHeightInches, double aWeightPounds)
    {
        //Complete constructor here. 
        //Remember to move each parameter to its corresponding instance variable:
        this.firstName = aFirstName;
        this.heightInches = aHeightInches;
        this.weightPounds = aWeightPounds;
    }
    
    //Create all the getters for the attributes here:
    public String getFirstName()
    {
        return firstName;
    }
    //etc.
    public double getHeightInches() //Getter for height using inches.//
    {
        return heightInches;
    }
    
    public double getWeightPounds() //Getter for weight using pounds.//
    {
        return weightPounds;
    }
    
    public double getbmi() //Getter for BMI.//
    {
        return bmi;
    }
    //Create all the setters for the attributes here:
    
    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    //etc.
    public void setHeightInches(double aHeightInches) //Setter for height using inches.//
    {
        heightInches = aHeightInches;
    }
    
    public void setWeightPounds(double aWeightPounds) //Setter for weight using pounds.//
    {
        weightPounds = aWeightPounds;
    }
    
    public void setbmi(double abmi) //Setter for BMI.//
    {
        bmi = abmi;
    }
    
    //Create the .toString() method here:
       
    public String toString()
    {
       return firstName + " weighs " + weightPounds + " pounds and measures " + heightInches + " inches tall." + "\n" + "Your BMI is " + df.format(bmi);
    }
    
    public void calculateBMI()
    {
        //sqauringHeight =  heightInches * heightInches
        bmi = (weightPounds / (heightInches * heightInches)) * 703; //Method for calculating person's BMI.//
    }
}
