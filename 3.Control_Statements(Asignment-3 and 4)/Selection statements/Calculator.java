import java.util.Scanner;
public class Calculator {
    public static void main(String[] args ) {
        //Compound Interest Calculator
        Scanner myobj = new Scanner(System.in);

        double num1;
        double num2;
        char operator;

        System.out.println("Enter the first number:");
        num1 = myobj.nextDouble();
        
        System.out.println("Enter the second number:");
        num2 = myobj.nextDouble();

        System.out.println("Enter the operator(+, -, *, /, ^):");
        operator = myobj.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.print(num1 + num2);
                break;

            case '-':
                System.out.print(num1 - num2);
                break;

            case '*':
                System.out.print(num1 * num2);
                break;

            case '^':
                System.out.print(Math.pow(num1, num2));
                break;

            case '/': {
                if (num2 == 0) {
                    System.out.println("This is not possible");
                    break;
                }
                else {   
                    System.out.print(num1/num2);
                    break;
                } 
            }       
            
            default:
                System.out.print("Invalid operator");
                break;
        }        
        myobj.close(); 
    }
}        



