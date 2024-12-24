package Inheritance;

public class BankC extends Bank{
    int balance = 2000;

    @Override
    public int getBalance() {
        return balance;
    }
}
