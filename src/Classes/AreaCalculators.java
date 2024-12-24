package Classes;
class Square{
    int side;

    Square(int  side){
        this.side = side;
    }
    double calculateArea(){
        return side*side;
    }
}
public class AreaCalculators {
    public static void main(String[] args) {
      Square s = new Square(6);
      double area = s.calculateArea();
        System.out.println("The area of square: " + area );
    }

}
