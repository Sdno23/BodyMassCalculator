package main;
import java.util.Scanner;

/**
 *
 * @author 3156908
 */
public class BodyMassIndex {
    public static Person anyPerson;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
          createPersonObject();
          displayBMI();
        
    }
    
    public static void createPersonObject()
    {
        //Ask user for their first name, height in inches, and weight in pounds.
        String firstName;
        double height;
        double weight;
        Scanner scnr = new Scanner (System.in);
        
        System.out.println("What is your first name?"); //User is asked to type in their name.//
        firstName = scnr.next();
        System.out.println("");
        
        System.out.println("How much do you weigh (in pounds)?"); //User is asked to type in their weight using pounds.//
        weight = scnr.nextDouble();
        System.out.println("");
        
        System.out.println("How tall are you (in inches)?"); //User is asked to type in their height using inches.//
        height = scnr.nextDouble();
        System.out.println(""); 
      
        anyPerson = new Person (firstName, height, weight);
    }
    
    public static void displayBMI()
    {
          anyPerson.calculateBMI();
        
        System.out.println(anyPerson.toString());
        
        if (anyPerson.getbmi() < 18.5) {
            System.out.println("You are considered underweight."); //User is informed that they are considered "underweight" if their BMI is less than 18.5.//
            System.out.println("");
        }
        else if ((anyPerson.getbmi() >= 18.5) && (anyPerson.getbmi() <= 24.9)) {
            System.out.println("Your are considered healthy."); //User is informed that they are considered "healthy" if their BMI is between 18.5 and 24.9.//
            System.out.println("");
        }
        else if ((anyPerson.getbmi() >= 25) && (anyPerson.getbmi() <= 29.9)) {
            System.out.println("Your are considered overweight."); //User is informed that they are considered "overweight" if their BMI is between 25 and 29.9//
            System.out.println("");
        }
        else {
            System.out.println("You are considered obese."); //User is informed that they are considered "obese" if their BMI is greater than 30.//
            System.out.println("");
    }
        
    }
    
}
