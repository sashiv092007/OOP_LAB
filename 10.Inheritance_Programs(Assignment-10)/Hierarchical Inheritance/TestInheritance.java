class Vehicle {
    private String regNo;
    private String fuel;
    private int speed;

    Vehicle(String regNo, String fuel, int speed) {
        this.regNo = regNo;
        this.fuel = fuel;
        this.speed = speed;
    }

    void start() {
        System.out.println(regNo + " started");
    }

    void stop() {
        System.out.println(regNo + " stopped");
    }

    void display() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Fuel Type: " + fuel);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Bus extends Vehicle {
    private int capacity;

    Bus(String regNo, String fuel, int speed, int capacity) {
        super(regNo, fuel, speed);
        this.capacity = capacity;
    }

    void displayBus() {
        display();
        System.out.println("Capacity: " + capacity);
        System.out.println("-------------------");
    }
}

class Truck extends Vehicle {
    private int load;

    Truck(String regNo, String fuel, int speed, int load) {
        super(regNo, fuel, speed);
        this.load = load;
    }

    void displayTruck() {
        display();
        System.out.println("Load Capacity: " + load + " tons");
        System.out.println("-------------------");
    }
}

class Van extends Vehicle {
    private boolean refrigeration;

    Van(String regNo, String fuel, int speed, boolean refrigeration) {
        super(regNo, fuel, speed);
        this.refrigeration = refrigeration;
    }

    void displayVan() {
        display();
        System.out.println("Refrigeration Available: " + refrigeration);
        System.out.println("-------------------");
    }
}

public class TestInheritance {
    public static void main(String[] args) {

        Bus b = new Bus("KA01", "Diesel", 80, 50);
        Truck t = new Truck("KA02", "Diesel", 70, 10);
        Van v = new Van("KA03", "Petrol", 90, true);

        b.start();
        b.displayBus();

        t.start();
        t.displayTruck();

        v.start();
        v.displayVan();
    }
}