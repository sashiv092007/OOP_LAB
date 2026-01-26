import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args ) {
        Scanner myobj = new Scanner(System.in);

        String message = "";

        do { 
            System.out.println("You are playing a game");
            System.out.println("Enter(m to quit) ");
            message = myobj.nextLine();

        } while (!message.equals("m"));

        myobj.close();
    }    
}

