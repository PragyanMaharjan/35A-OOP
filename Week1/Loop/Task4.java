package Loop;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        /*4. Write a JAVA program to check whether a number is even or odd. */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int intInput = scan1.nextInt();
            if (intInput%2==0) {
                System.out.printf("Your number is even that is %d", intInput);
            }
            else {
                System.out.printf("Your number is odd %d", intInput);
            }
        scan1.close();
    }
}
