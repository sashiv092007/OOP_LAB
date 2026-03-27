class Notification {

   
    public void send(String message) {
        System.out.println("This is a Message: " + message);
    }

   
    protected void send(String message, String email) {
        System.out.println("This is a Message: " + message);
        System.out.println("This is an Email: " + email);
    }

    
    private void send(String message, long phoneNo) {
        System.out.println("This is a Message: " + message);
        System.out.println("This is a phone number: " + phoneNo);
    }

    
    public void accessSentMessage(String message, long phoneNo) {
        send(message, phoneNo); 
    }
}


class Appnotification extends Notification {

    void testMethods() {
        send("Hello from subclass");
        send("Hello Email", "test@gmail.com");

        // send("Hello", 1234567890L);

        accessSentMessage("Hello Private", 1234567890L);
    }
}

public class Nsystem {
    public static void main(String[] args) {

        Appnotification app = new Appnotification();

        app.send("Hello");
        app.send("Hello", "abc@gmail.com");

        app.accessSentMessage("Hello", 9868341673L);

        app.testMethods();
    }
}