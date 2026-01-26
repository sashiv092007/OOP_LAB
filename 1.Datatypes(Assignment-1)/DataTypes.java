public class DataTypes {
  public static void main(String[] args) {
    
    //Integer datatypes
    byte num1 = 70;
    short num2 = 10000;
    int num3 = 100000;
    long num4 = 12345678910L;

    //Floating-point datatypes
    float num5 = 3.14f;
    double num6 = 2.3893;

    //Character datatypes
    char letter = 'H';

    //Boolean datatypes
    Boolean myBoolean = true;
 
    System.out.println("This is byte datatype: " + num1);
    System.out.println("This is short datatype: " + num2);
    System.out.println("This is int datatype: " + num3);
    System.out.println("This is long datatype: " + num4);
    System.out.println("This is float datatype: " + num5);
    System.out.println("This is double datatype: " + num6);
    System.out.println("This is char datatype: " + letter);
    if (myBoolean) {
    System.out.println("This is boolean datatype: " + myBoolean);
    }
    else {
     System.out.println("This statement is false");
    }
 }
}