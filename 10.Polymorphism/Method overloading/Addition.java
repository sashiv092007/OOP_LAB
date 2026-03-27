class Calculator {

public int add(int a, int b) {
return a + b;
}

protected int add(int a, int b, int c) {
return a + b + c;
}

private double add(double a, double b) {
return a + b;
}


public void decimalSum(double a, double b) {
double result = add(a, b);
System.out.println("Decimal Sum: " + result);
}
}

public class Addition {
public static void main(String[] args) {

Calculator c = new Calculator();

System.out.println("Sum of two integers: " + c.add(2, 3));

System.out.println("Sum of three integers: " + c.add(2, 3, 4));
 
c.decimalSum(2.4, 3.8);

}
}