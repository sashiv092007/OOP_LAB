public class DataOperations {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Unary Operators
        System.out.println("Original value: " + c);
        System.out.println("Increment: " + (++c));
        System.out.println("Decrement: " + (--c));

        // Relational Operators
        if (a<b) {
            System.out.println("a is less than b : " );
        }
        else if (a<=c) {
            System.out.println("a is less than or equal to b : " );
        }    
        else if (a>b) {
            System.out.println("a is greater than b : " );
        } 
        else if (a>=b) {
            System.out.println("a is greater than or equal to b : " );
        }
        else if (a>=b) {
            System.out.println("a is greater than or equal to b : " );
        }
        else if (a==b) {
            System.out.println("a is equal to b : " );
        } 
        else{
            System.out.println("a is not equal to b : " );
        }
        

        // Logical Operators 
        boolean x = true;
        boolean y = false;

        System.out.println("x and y : " + (x && y));
        System.out.println("x or y : " + (x || y));
        System.out.println("not x : " + (!x));
        
    }    

}