import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args ) {
        Scanner myobj = new Scanner(System.in);

        String message = "";

        while (!message.equals("m")) {
            System.out.print("This is an endless game");
            System.out.println("Enter(m to quit): ");
            message = myobj.nextLine();
        }
        
        System.out.print("Congrats! You have won the game");
        myobj.close();
    }
}        