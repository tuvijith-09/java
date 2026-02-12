import java.util.ArrayList;

// Custom Exception
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

// Account Class
class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    void transfer(BankAccount target, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Transfer failed! Insufficient balance.");
        }
        balance -= amount;
        target.balance += amount;
        System.out.println("Transferred ₹" + amount + " to " + target.accountHolderName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("------------------------");
    }
}

// Bank Class
class SimpleBank {

    ArrayList<BankAccount> accountList = new ArrayList<>();

    void createAccount(String accNo, String name, double initialBalance) {
        BankAccount acc = new BankAccount(accNo, name, initialBalance);
        accountList.add(acc);
        System.out.println("Account created for " + name);
    }

    BankAccount getAccount(String accNo) {
        for (BankAccount acc : accountList) {
            if (acc.accountNumber.equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    void displayAllAccounts() {
        for (BankAccount acc : accountList) {
            acc.displayAccountDetails();
        }
    }
}

// Main Class
public class BankTest {

    public static void main(String[] args) {

        SimpleBank bank = new SimpleBank();

        bank.createAccount("101", "Rahul", 5000);
        bank.createAccount("102", "Priya", 3000);

        BankAccount acc1 = bank.getAccount("101");
        BankAccount acc2 = bank.getAccount("102");

        try {
            acc1.deposit(2000);
            acc1.withdraw(1000);
            acc1.transfer(acc2, 4000);  // try changing to 10000 to test exception
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        bank.displayAllAccounts();
    }
}
