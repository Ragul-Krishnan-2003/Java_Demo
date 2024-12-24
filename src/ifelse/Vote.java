package ifelse;
import java.util.*;
public class Vote {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("Eligible to vote");
        }
       else{
           System.out.println("Not eligible");
      }

        }
    }

