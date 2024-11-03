/* Oviya is fascinated by automorphic numbers and wants to create a program to determine whether a given number is an automorphic number or not.
An automorphic number is a number whose square ends with the same digits as the number itself. For example, 25 = (25)2 = 625 
Oviya has defined two interfaces, NumberInput for taking user input and AutomorphicChecker for checking if a given number is automorphic.
The class AutomorphicNumber implements both interfaces.

Help her to complete the task. */

import java.util.*;

interface NumberInput{
    int getInput();
}
interface AutomorphicChecker{
    boolean isAutomorphic();
}

class AutomorphicNumber implements NumberInput, AutomorphicChecker{
    public int getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public boolean isAutomorphic(){
        System.out.println();
        return true;
    }
    public boolean isAutomorphic(int n){
        int P = n*n;
        String Q = Integer.toString(n);
        String R = Integer.toString(P);
        
        return R.endsWith(Q);
    }
    public static void main(String args[]){
        AutomorphicNumber A = new AutomorphicNumber();
        int n = A.getInput();
        if(A.isAutomorphic(n)){
            System.out.println(n + " is an automorphic number");
        }else{
            System.out.println(n + " is not an automorphic number");
        }
    }
}