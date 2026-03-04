class Animal {
    String name;
    int age;
    String diet;

    Animal(String name, int age, String diet) {
        this.name = name;
        this.age = age;
        this.diet = diet;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age + " Diet: " + diet);
    }
}

class Mammal extends Animal {
    String furColor;

    Mammal(String name, int age, String diet, String furColor) {
        super(name, age, diet);
        this.furColor = furColor;
    }

    void run() {
        System.out.println(name + " is running");
    }
}

public class Creature {
    public static void main(String[] args) {

        Mammal m = new Mammal("Lion", 5, "Carnivore", "Golden");
        
        m.display();
        m.run();

        
    }
}


