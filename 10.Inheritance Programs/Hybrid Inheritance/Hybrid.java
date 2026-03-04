class Vehicle {
    String regNo;
    String fuel;
    int speed;

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
}

class Car extends Vehicle {
    int seats;

    Car(String regNo, String fuel, int speed, int seats) {
        super(regNo, fuel, speed);
        this.seats = seats;
    }

    void displayCar() {
        System.out.println("Car RegNo: " + regNo);
        System.out.println("Seats: " + seats);
    }
}

class Bike extends Vehicle {
    int seats;

    Bike(String regNo, String fuel, int speed, int seats) {
        super(regNo, fuel, speed);
        this.seats = seats;
    }

    void displayBike() {
        System.out.println("Bike RegNo: " + regNo);
        System.out.println("Seats: " + seats);
    }
}

class Mercedes extends Car {
    int batteryCapacity;

    Mercedes(String regNo, String fuel, int speed,
              int seats, int batteryCapacity) {
        super(regNo, fuel, speed, seats);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
        System.out.println("Charging battery of capacity "
                + batteryCapacity + " kWh");
    }

    void displayMercedes() {
        displayCar();
        System.out.println("Battery Capacity: "
                + batteryCapacity + " kWh");
    }
}


public class Hybrid {
    public static void main(String[] args) {

        Mercedes m =
                new Mercedes("KA10", "Petrol + Electric",
                        120, 5, 40);

        m.start();
        m.displayMercedes();
        m.chargeBattery();
        m.stop();
    }
}