class BankAccount {

    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Amount must be positive!");
        }
    }
}

public class DepoMain {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC101", 5000);

        acc.deposit(2000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}