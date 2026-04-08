abstract class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Concrete method
    public void displayInfo() {
        System.out.println("Vehicle: " + year + " " + brand);
    }

    // Static method (belongs to class, not object)
    public static void generalInfo() {
        System.out.println("Vehicles are used for transportation.");
    }

    // Abstract methods
    abstract void startEngine();
    abstract void drive();
}

class Car extends Vehicle {

    private String fuelType;

    public Car(String brand, int year, String fuelType) {
        super(brand, year);
        this.fuelType = fuelType;
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started using " + fuelType + " fuel.");
    }

    @Override
    void drive() {
        System.out.println("Car is driving smoothly on the road.");
    }
}

public class AbsMain {
    public static void main(String[] args) {

        System.out.println("--- Abstract Class Demo ---");

        // Calling static method
        Vehicle.generalInfo();

        // Creating object of Car
        Car myCar = new Car("Toyota", 2022, "Petrol");

        myCar.displayInfo();   // inherited method
        myCar.startEngine();  // implemented abstract method
        myCar.drive();        // implemented abstract method
    }
}