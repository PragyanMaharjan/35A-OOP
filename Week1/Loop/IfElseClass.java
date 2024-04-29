package Loop;

public class IfElseClass {
    public static void main(String[] args) {
        /* If statement  */
        if (true) {
            System.out.println("True statement");
        }
        //The paranthesis takes an boolean expression 
        int num1 = 10, num2 = 20;
        if (num1 == num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        /*Note that the else statement is always optional */

        /*If else if */
        if (num1 == num2){
            System.out.println("Equal");
        }
        else if(num1 < num2){
            System.out.println("Lesser");
        }
        else{
            System.out.println("Greater");
        }
        /*Note that else should be at the last when using else if*/
        /*If else if ladder */
        if (num1 == num2){
            System.out.println("Equal");
        }
        else if(num1 > num2){
            System.out.println("Greater");
        }
        else if(num1 != num2){
            System.out.println("Not Equal");
        }        
        else if( num1 > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Default Statement");
        }
        /*When a condition is matched it will skip all the remaining statement */
        /*Nested If Else */
        if (num1 > 0){
            if (num1 > num2){
                System.out.println("Positive Greater");
            }
            else{
                System.out.println("Positive lesser");
            }         
        }
        else{
            if (num1 > num2){
                System.out.println("Negative greater");
            }
            else {
                System.out.println("Nehative Lesser");
                }
            }

            // */
    }
}
