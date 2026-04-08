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

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }
}

public class WithMain {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC202", 5000);

        acc.withdraw(3000);
        System.out.println("Remaining Balance: " + acc.getBalance());
    }
}