package Classes;
class Account{
    int accountNo;
    String accountName;
    int amount;

    Account(int accountNo,String accountName,int amount){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.amount = amount;
    }
    public void Deposit(int depAmt){
        this.amount += depAmt;
        System.out.println(this.amount);
    }
    public void Withdraw(int withAmnt){
        this.amount -= withAmnt;
        System.out.println(this.amount);
    }
    public void Display_balance(){
        System.out.println(this.amount);
    }
    public void Display_userdetails(){
        System.out.println("Account no" + accountNo );
        System.out.println("Account name" + accountName);
        System.out.println("Amount" + amount);
    }

}
public class BankAccount {
    public static void main(String[] args) {
        Account acc = new Account(123, "leo", 300);
        acc.Withdraw(30);
        acc.Deposit(40);
        acc.Display_balance();
        acc.Display_userdetails();
    }

}
