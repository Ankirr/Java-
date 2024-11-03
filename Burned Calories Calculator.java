/* Ashok is writing a program that focuses on calculating and displaying the calories burned during a workout for a fitness enthusiast. 
He has certain specifications as follows.
Implement a class structure with a base class Person and a derived class FitnessEnthusiast that inherits from Person. 
The program should take user input for the fitness enthusiast's name, workout duration (in minutes), and calorie burn rate (calories burned per minute).
Create a constructor for the FitnessEnthusiast class to initialize the name, workout duration, and calorie burn rate. 
Utilize the super keyword to invoke the constructor of the superclass. 
Implement a method that calculates the calories burned during the workout using the formula (workout duration * calories burn rate). 
Display the calculated calories burned.

Help Ashok to complete the program.  */

import java.util.*;

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
}
class FitnessEnthusiast extends Person{
    int workoutDuration;
    double calorieBurnRate;
    
    public FitnessEnthusiast(String name, int workoutDuration, double calorieBurnRate){
        super(name);
        this.workoutDuration = workoutDuration;
        this.calorieBurnRate = calorieBurnRate;
    }
    public double calculate(){
        return workoutDuration*calorieBurnRate;
    }
    public void display(){
        System.out.printf("Calories Burned: %.1f calories\n", calculate());
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int workoutDuration = sc.nextInt();
        double calorieBurnRate = sc.nextDouble();
        
        FitnessEnthusiast F = new FitnessEnthusiast(name, workoutDuration, calorieBurnRate);
        F.display();
    }
}
