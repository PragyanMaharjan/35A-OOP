package Week3;

import java.util.Scanner ;

public class InputOutput {
    public static void main(String[] args) {
        /*System.out.println*/
        System.out.println ("This line breaks");

        /*System.out.print*/
        System.out.print("This will not break line. ");
        System.out.print("This will continue \n");

        /*System.out.prinf 
         * %s String, %d integers %f floating point, % b boolean
        */
        System.out.printf("Hello %s, Goodmorning","World");
        System.out.println("");
        System.out.printf("This is a num %d", 10);
        System.out.println("");
        /*MultiFormat */
        System.out.printf("Both float %f and %b",10.37, false);
        System.out.println("");

        Scanner scan = new Scanner (System.in);
        System.out.println("This following takes sentences");
        String stringInput = scan.nextLine();
        System.out.println("This following takes int");
        int intInput = scan.nextInt();
        System.out.println("This following takes boolean");
        boolean boolInput = scan.nextBoolean();
        scan.close();

    }
}
