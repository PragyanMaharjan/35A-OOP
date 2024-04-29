package Loop;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
            /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not */
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter the number you want to check");
    int intInput = scan1.nextInt();
        if (intInput%5==0 || intInput%11==0) {
            System.out.println("Your number is divisible by 5 and 11");
        }
        else {
            System.out.println("your number is not divisible by 5 and 11");
        }
    scan1.close();
    }   
}