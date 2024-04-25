package Week3;

import java.util.Scanner ;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your Name?");
        String stringInput = scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean boolInput = scan1.nextBoolean();
        System.out.println("How many siblings?");
        int intInput = scan1.nextInt();
        scan1.close();
        System.out.printf("Hello, %s",stringInput);
        System.out.println("");
        System.out.printf("Status ? %b", boolInput);
        System.out.println("");
        System.out.printf("You have %d number of Siblings", intInput);
      }
}