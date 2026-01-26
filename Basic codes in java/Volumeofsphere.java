import java.util.Scanner;

public class Volumeofsphere {
    public static void main(String[] args) {

        // VOLUME OF SPHERE PROGRAM
        Scanner scanner = new Scanner(System.in);

        double radius;
        double volume;

        System.out.print("Enter the radius of the sphere: ");
        radius = scanner.nextDouble();

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Volume of the sphere is: %.2f", volume);
        
    }
}




 
