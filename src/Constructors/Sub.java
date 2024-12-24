package Constructors;

public class Sub {
    Sub(int a,int b){
        System.out.println(a-b);
    }
    Sub(int a,int b,int c){
        System.out.println(a-b-c);
    }

    public static void main(String[] args) {
        Sub ss = new Sub(12,5);
        Sub ss2 =new Sub(12,3,1);
    }

}
