package Loop;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
            /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter the number you want to check");
    int intInput = scan1.nextInt();
        if (intInput < 0) {
            System.out.println("Your number is Negative");
        }
        else if (intInput > 0){
            System.out.println("Your number is Positive ");
        }
        else {
            System.out.println("Zero");
        }
    scan1.close();
    }   
}
