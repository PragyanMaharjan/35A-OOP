package Loop;

public class SwitchClass {
        public static void main(String[] args) {
            char charValue = 'b';
            int intValue = 10;
            switch(charValue){
                case 'a':
                    System.out.println("Apple");
                    break;
                case 'b':
                switch (intValue) {
                    case 10:
                        System.out.println("Ten");
                        break;
                
                    case 20:
                        System.out.println("Twenty");
                        break;
                }
                System.out.println("Ball");
                break; /* Break use garena bhani sab code run hunxa */                
                case 'c':
                    System.out.println("Cat");
                    break;
                case 'd':
                    System.out.println("Dog");
                    break;
                default:
                    System.out.println("No word Found");
                    break;
            }
    }
}
