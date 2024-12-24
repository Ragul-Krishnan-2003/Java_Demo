package Abstraction;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to Savings Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Withdrawal amount exceeds balance or minimum balance requirement.");
        }
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to Current Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Current Account.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1500);
        BankAccount current = new CurrentAccount(2000);

        savings.deposit(500);
        savings.withdraw(300);
        System.out.println("Savings Account Balance: $" + savings.getBalance());

        current.deposit(1000);
        current.withdraw(500);
        System.out.println("Current Account Balance: $" + current.getBalance());
    }
}
