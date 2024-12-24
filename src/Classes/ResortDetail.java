package Classes;
import java.util.*;
class Resort{
    int RNo;
    String Name;
    int Charges;
    int Days;
    public double Amount(){
        double amt;
        amt = Charges * Days;
        if(amt >= 11000)
            amt = amt*1.02;
        return amt;
    }
    public void GetInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number :");
        RNo = scan.nextInt();
        System.out.println("Enter the name: ");
        Name = scan.next();
        System.out.println("Enter the Charges :");
        Charges = scan.nextInt();
        System.out.println("Enter the Days :");
        Days = scan.nextInt();
    }
    public void DisplayInfo(){
        System.out.println("Room Number :" + RNo);
        System.out.println("Name :" + Name);
        System.out.println("Charges :" + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount :" + Amount());
    }
}
class ResortDetail {
    public static void main(String[] args) {
        Resort re = new Resort();
        re.GetInfo();
        re.DisplayInfo();
        re.Amount();
    }
}
