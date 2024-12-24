package Inheritance;
//A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B
public class Bank {
    public int getBalance(){
        return 0;
    }

    public static void main(String[] args) {
        BankA obj = new BankA();
        BankB obj1 = new BankB();
        BankC obj2 = new BankC();
        System.out.println(obj.getBalance());
        System.out.println(obj1.getBalance());
        System.out.println(obj2.getBalance());
    }
}
