interface Vehicle {

    // Abstract methods (by default public & abstract)
    void startEngine();
    void drive();
    void calculateFuelEfficiency();

    // Static method (belongs to interface)
    static void info() {
        System.out.println("Vehicle Interface: Defines common vehicle behaviors.");
    }
}

class SportsCar implements Vehicle {
    private String brand;
    private int year;
    private boolean turboEnabled;

    public SportsCar(String brand, int year, boolean turboEnabled) {
        this.brand = brand;
        this.year = year;
        this.turboEnabled = turboEnabled;
    }

    @Override
    public void startEngine() {
        System.out.println("SportsCar Engine started with roar!");
    }

    @Override
    public void drive() {
        System.out.println("Driving sports car at high speed!");
        if (turboEnabled) {
            System.out.println("Turbo boost activated!");
        }
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel Efficiency: 15 MPG");
    }

    public void displayInfo() {
        System.out.println("SportsCar: " + year + " " + brand);
    }
}

class ElectricBike implements Vehicle {
    private String brand;
    private int year;
    private int batteryCapacity;

    public ElectricBike(String brand, int year, int batteryCapacity) {
        this.brand = brand;
        this.year = year;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric bike powered on silently.");
    }

    @Override
    public void drive() {
        System.out.println("Riding electric bike smoothly.");
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel Efficiency: Uses " + batteryCapacity + " kWh battery.");
    }

    public void displayInfo() {
        System.out.println("ElectricBike: " + year + " " + brand);
    }
}

public class InterMain {
    public static void main(String[] args) {

        System.out.println("--- Interface Abstraction Demo ---");

        // Calling static method of interface
        Vehicle.info();

        SportsCar car = new SportsCar("Ferrari", 2024, true);
        car.displayInfo();
        car.startEngine();
        car.drive();
        car.calculateFuelEfficiency();

        System.out.println();

        ElectricBike bike = new ElectricBike("RadPower", 2023, 14);
        bike.displayInfo();
        bike.startEngine();
        bike.drive();
        bike.calculateFuelEfficiency();
    }
}