public class JavaArugement {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Provide args");
            return ;
        }
        System.out.println("Firstargs" + args[0]);
        System.out.println("Secondargs"+args[1]);
        /*Make sure 2nd args is   */
        int parsedValue = Integer.parseInt(args[1]);
    }
}
