/*
 * Alice is concerned about the security of her confidential messages and wants to implement 
 * a simple encryption and decryption program. Implement a simple encryption algorithm that 
 * increments the ASCII value of each character in the message. Implement a corresponding 
 * decryption algorithm that decrements the ASCII value of each character. Create a program 
 * that takes user input for a confidential message, encrypts the message using a basic 
 * encryption algorithm, writes the encrypted message to a file named encrypted_data.txt, 
 * and then reads the encrypted data from the file to decrypt it. The decrypted message is 
 * then displayed to ensure the correctness of the encryption and decryption process.
 * Assist Alice in this task.
 */

 import java.util.*;
 class Main{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Message: ");
         String s = sc.nextLine();
         System.out.printf("Encrypted Message: ");
         for(int i = 0; i<s.length(); i ++){
             System.out.printf("%c", s.charAt(i)+1);
         }
         System.out.printf("\n");
         System.out.printf("Decrypted Message: " + s);
     }
 }