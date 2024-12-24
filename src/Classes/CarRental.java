package Classes;
import java.util.*;
class Car{
    int CarId;
    String CarType;
    int Rent;
    public void GetCar(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Car Id :");
        CarId = scan.nextInt();
        System.out.println("Enter Car Type: ");
        CarType = scan.next();
    }
    public int GetRent(){
        if(CarType.equals("Small"))
            Rent = 1000;
        if(CarType.equals("Van"))
            Rent = 700;
        if(CarType.equals("SUV"))
            Rent = 2500;
        return Rent;
    }
    public void ShowCar(){
        System.out.println("Car Id :" + CarId );
        System.out.println("Car Type :" +CarType);
        System.out.println("Rent :" + GetRent());
    }
}
public class CarRental {
    public static void main(String[] args) {
        Car cc = new Car();
        cc.GetCar();
        cc.GetRent();
        cc.ShowCar();
    }
}
