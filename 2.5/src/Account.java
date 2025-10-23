public class Account {
    private String accountNumber;
    private Customer customer;
    private double balance;

    public Account(String accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        customer.displayInfo();
        System.out.printf("Balance: $%.2f%n", balance);
    }
}