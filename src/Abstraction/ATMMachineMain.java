package Abstraction;

class ATMMachine {
    public void Enter_Card() {
        System.out.println("Card Verification");
    }

    public void Enter_Pin() {
        System.out.println("Pin Verification");
    }

    public void Cash_Withdrawal() {
        System.out.println("To withdraw cash from ATM");
    }

    public void Validate_Withdraw_Amount() {
        System.out.println("Validate the Amount to be withdraw");
    }

    public void Update_Amount() {
        System.out.println("Update the Amount after withdraw");
    }

    public void Cash_Dispose() {
        System.out.println("Dispose the cash from ATM");
    }

    public void Mini_Statement() {
        System.out.println("Get the mini statement");
    }
}
public class ATMMachineMain {
    public static void main(String[] args) {
        ATMMachine am = new ATMMachine();
//Accessing the Public Properties and methods
        am.Enter_Card();     // Card Verification
        am.Enter_Pin();    // Pin Verification
        am.Cash_Withdrawal();   // To withdraw cash from ATM
        am.Validate_Withdraw_Amount();  // Validate the Amount to be withdraw
        am.Update_Amount();   // Update the Amount after withdraw
        am.Cash_Dispose();
    }
}