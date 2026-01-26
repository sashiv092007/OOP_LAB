public class Dog extends Animal {
     
     public void speak() {
        System.out.println("The dog barks: (woof)");
        System.out.println("The dog is alive , so it is" + isAlive);
        System.out.println("The dog has " + lives + "lives");
        //System.out.println("The dog has " + years + "to live"); // private (not accessible outside animal class)
     }
     
}
