/*Alex and Bob are designing a control system for household appliances, and one of the appliances is a washing machine.
You want to create a program to help them that models the washing machine as a motor and calculates its electricity consumption based on its capacity.

Define an interface named Motor with the following methods:
    1. void run() 
    2. double consume(double capacity)

Create a class called WashingMachine that implements the Motor interface. 

In the WashingMachine class:
    3. Implement the run() method to print "Washing machine is running."
    4. Implement a consume() method to print "Washing machine is consuming electricity."
    5. Implement the consume(double capacity) method to calculate the electricity consumption (in kWh) of the washing machine based on its capacity. 
       The formula for electricity consumption is (capacity * 0.05).
 */



import java.util.*;

interface Motor{
    void run();
    double consume(double capacity);
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("Washing machine is running.");
    }
    public double consume(double capacity){
        System.out.println("Washing machine is consuming electricity.");
        return capacity*0.05;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double capacity = sc.nextDouble();
        
        WashingMachine W = new WashingMachine();
        W.run();
        double consumption = W.consume(capacity);
        System.out.printf("Electricity consumption: %.2f kWh", consumption);
        
        
    }
}