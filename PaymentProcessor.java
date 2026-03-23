abstract class Payment {
    private String transactionId;
    private double amount;

    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    abstract double processPayment();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    double processPayment() {
        return getAmount() * 1.02;
    }
}

class UPIPayment extends Payment {
    private String upiId;

    UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    double processPayment() {
        if (upiId == null || upiId.isEmpty()) {
            System.out.println("Invalid UPI ID");
            return 0;
        }
        return getAmount();
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN1", 1000);
        Payment p2 = new UPIPayment("TXN2", 1000, "user@upi");

        Payment[] payments = {p1, p2};

        double total = 0;

        for (Payment p : payments) {
            double result = p.processPayment();
            System.out.println("Processed Amount: " + result);
            total += result;
        }

        System.out.println("Total: " + total);
    }
}