package Loop;

public class CW {
    public static void main(String[] args) {
        int math = 34, science = 70, english = 50;
        float average = (34+70+50)/3;
        if (average <35) {
            System.out.println("Fail");
        }
        else if (average < 60) {
            System.out.println("Third Div");
        }
        else if (average < 70) {
            System.out.println("Second Div");
        }
        else if (average < 80) {
            System.out.println("1st div");
        }
        else if (average > 80){
            System.out.println("Distinction");
        }
        else if (average > 100 && average < 0){
            System.out.println("Invalid marking");
        }
    }
}
