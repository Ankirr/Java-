import java.io.*;
import java.util.*;

class ExpenseCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] prices = new double[N];
        
        for(int i=0;i<N;i++){
            prices[i] = sc.nextDouble();
        }
        
        try(PrintWriter writer = new PrintWriter(new FileWriter("prices.txt"))){
            for(double price : prices){
                writer.println(price);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        List<Double> taxedAmounts = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("prices.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                double price = Double.parseDouble(line);
                double taxedPrice = price * 1.10;
                taxedAmounts.add(taxedPrice);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try(PrintWriter writer = new PrintWriter(new FileWriter("tax.txt"))){
            for(double taxedAmount : taxedAmounts){
                writer.printf("%.2f ", taxedAmount);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        for(double taxedAmount : taxedAmounts){
            System.out.printf("%.2f ", taxedAmount);
        }
    }
}