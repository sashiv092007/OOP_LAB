public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(animal.isAlive);   // public (accessible in every class whether same or different package)
        // System.out.println(animal.lives);  // protected (not accessible as main is not a sub/inherited class)
        // System.out.println(animal.years);  // private (not accessible due to different class)

        animal.showifAlive();                 // public
        animal.showlives();                   // protected (protected members can be accessed through methods, not directly by objects of another class)

        System.out.println("Years: " + animal.getYears()); 

        dog.speak();

    
    }
}        