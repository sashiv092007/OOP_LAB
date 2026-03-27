class InvoiceProcessor {

    public void customerDetails(String name, long phoneNo) {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNo);
    }

    public int bill(int amount) {
        if (amount > 0) {
            int finalAmount = calculate(amount);
            System.out.println("Total Bill: " + finalAmount);
            return finalAmount;
        } 
else {
            System.out.println("Invalid billing amount");
            return 0;
        }
    }

    private int calculate(int amount) {
        int tax = amount / 10; 
        return amount + tax;
    }

    public void internalCalculation(int amount) {
        int total = calculate(amount);
        System.out.println("Internal Calculation: " + total);
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void customerDetails(String name, long phoneNo) {
        System.out.println("Retail Customer Name: " + name);
        System.out.println("Retail Phone Number: " + phoneNo);
    }

    @Override
    public int bill(int amount) {
        double discount = 0;

        if (amount > 1000) {
            discount = 0.2 * amount; 
        } else if (amount > 500) {
            discount = 0.1 * amount;
        }

        int finalAmount = (int)(amount - discount);

        System.out.println("Original Amount: " + amount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Bill: " + finalAmount);

        return finalAmount;
    }
}

public class Invoice {
    public static void main(String[] args) {

        InvoiceProcessor x = new RetailInvoice();

        x.customerDetails("Sanjay", 9868341673L);
        x.bill(900);

        x.internalCalculation(900); //access private method
    }
}