package Methodoverloading;

public class PrintNumber {
    public void printn(int number){
        System.out.println("Integer :" + number);
    }
    public void printn(double number){
        System.out.println("Double :" + number);
    }
    public void printn(long number){
        System.out.println("Long :" + number);
    }
    public void printn(short number){
        System.out.println("Short :" + number);
    }
    public void printn(String text){
        System.out.println("String :" + text);
    }
    public void printn( float number){
        System.out.println("Float :" + number);
    }
    public void printn(byte number){
        System.out.println("Byte :" + number);
    }
    public static void main(String [] args){
        PrintNumber pn = new PrintNumber();
        pn.printn(40);
        pn.printn(12.3);
        pn.printn(1000000l);
        pn.printn((short)30000);
        pn.printn("leo");
        pn.printn(12.f);
        pn.printn((byte)123);
    }
}
