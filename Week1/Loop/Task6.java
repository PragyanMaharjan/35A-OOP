package Loop;

import java.util.Scanner;
public class Task6{
    public static void main(String[] args) {
        /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.*/
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        int intInput = scan1.nextInt();
            if (intInput%4==0) {
                System.out.printf("Leap Year %d", intInput);
            }
            else if (intInput%100 != 0) {
                System.out.printf("Leap Year %d", intInput);
            }
            else if (intInput%400 == 0) {
                System.out.printf("Leap Year %d", intInput);
            }
            else{
                System.out.println("No it is not");
            }
            scan1.close();
            }
    }

