// Interface for voice control
interface VoiceControlled {
    void voiceCommand(String command);
}

// Base class
class Appliance {
    String name;

    Appliance(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " is turned ON");
    }

    void turnOff() {
        System.out.println(name + " is turned OFF");
    }
}

// Derived class SmartLight
class SmartLight extends Appliance implements VoiceControlled {

    SmartLight(String name) {
        super(name);
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println("SmartLight received voice command: " + command);
    }

    // Overriding turnOn()
    @Override
    void turnOn() {
        System.out.println(name + " (SmartLight) is glowing");
    }
}

// Derived class SmartThermostat
class SmartThermostat extends Appliance implements VoiceControlled {

    SmartThermostat(String name) {
        super(name);
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println("SmartThermostat received voice command: " + command);
    }

    // Overriding turnOn()
    @Override
    void turnOn() {
        System.out.println(name + " (Thermostat) is regulating temperature");
    }
}

// Main class
public class Inter {
    public static void main(String[] args) {

        // Runtime polymorphism
        Appliance a1 = new SmartLight("Living Room Light");
        Appliance a2 = new SmartThermostat("Room Thermostat");

        a1.turnOn();
        a1.turnOff();

        a2.turnOn();
        a2.turnOff();

        // Interface reference
        VoiceControlled v1 = new SmartLight("Bedroom Light");
        VoiceControlled v2 = new SmartThermostat("Hall Thermostat");

        v1.voiceCommand("Turn on light");
        v2.voiceCommand("Set temperature to 24°C");
    }
}