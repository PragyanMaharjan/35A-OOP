package Week1;

public class Variable {
    /*Instance variable needs object to accessed
     * Value is not shared
     */
    int instanceVariable = 10;

    /*Static variable doesnot need object to access
     * Value is shared among objects
     */
    static int staticVariable = 100;

    public static void main(String[] args) {
        /* Primitive Data Type
         * Already defined in Programmmig language (Java)
         */
        byte byteValue = 100;
        /*
         *The following cant be done again
         * byte byteValue = 100;
         */
        byte byteValue = 10;
        short shortValue = 200;
        int intValue = -199;
        long longValue = 10000;
        float floatValue = 2.15f;
        double doubleValue = -90.233;
        char charValue = 'l';
        boolean booleanValue = false;

        /*Non primitive data types
        *not defined by progarmming language except (string)
        *combination of primitive data types
         */
        String stringValue = "this is a string value";
        int[] intArray = new int[5];
        Variable variableObject = new Variable();
        /*Use instance variable with Variable object */
        System.out.println(variableObject.instanceVariable);
        /*Use static variable with class itself */
        System.out.println(Variable.staticVariable);         
        
        byte defaultByteValue;
        System.out.println("Default Byte Value is " + byteValue);
        /*
         * Continue all and find the default value of all the
         * primitive datatype
         */

    }
}