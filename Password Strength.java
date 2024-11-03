import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() <= 3){
            System.out.println("Weak");
        }
        else if(s.length() < 8){
            System.out.println("Medium");
        }
        else{
            System.out.println("Strong");
        }
    }
}