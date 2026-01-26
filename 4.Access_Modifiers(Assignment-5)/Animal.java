public class Animal  {
    public boolean isAlive;
    protected int lives;
    private final double years;

    Animal() {
        isAlive = true;
        lives = 1;
        years = 12;
    }

    public void showifAlive() {
        System.out.println("The dog is alive , so it is" + isAlive);
    }

    protected void showlives() {
        System.out.println("The dog has " + lives + "lives");
    }

    // Use this method to access private variable
    public double getYears() {
        return years;
    }
}

      
