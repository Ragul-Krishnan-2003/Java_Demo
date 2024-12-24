package Methodoverloading;

public class AreaC {
    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        AreaC cr = new AreaC();
        cr.printArea(5);
        cr.printArea(4, 6);
    }
}

