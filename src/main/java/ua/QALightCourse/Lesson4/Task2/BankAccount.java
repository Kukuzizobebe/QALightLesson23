package ua.QALightCourse.Lesson4.Task2;

public class BankAccount {
    private int accountNumber;
    private String ownerFirstName;
    private int balance;

    public BankAccount() {
        this.accountNumber = 0;
        this.ownerFirstName = "Unknown";
        this.balance = 0;
    }

    public BankAccount(int accountNumber, int balance, String ownerFirstName) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Incorrect value 'balance' for " + ownerFirstName
            );
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerFirstName = ownerFirstName;
    }

    public void withdrawMoney(int valueToWithdraw) {
        if (valueToWithdraw <= 0) {
            throw new IllegalArgumentException("Value to withdraw must be positive");
        }
        if (valueToWithdraw > balance) {
            throw new IllegalArgumentException(
                    "Insufficient funds for withdrawal"
            );
        }
        balance -= valueToWithdraw;
    }

    public void topUpMoney(int valueToTopUp) {
        if (valueToTopUp <= 0) {
            throw new IllegalArgumentException("Value to top up must be positive");
        }
        balance += valueToTopUp;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber + ", owner first name: " + ownerFirstName + ", balance: " + balance;
    }
}