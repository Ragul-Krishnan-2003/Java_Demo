package Inheritance;

import patterns.Square;

public class SquareShape extends RectangularShape{
    void getShape(){
        System.out.println("This is a Square shape");
        super.getShape();
    }

    public static void main(String[] args) {
        SquareShape obj = new SquareShape();
        obj.getShape();
    }
}
