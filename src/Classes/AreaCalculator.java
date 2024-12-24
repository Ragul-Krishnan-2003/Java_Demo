package Classes;

 class Rectangle {
     double length;
     double width;

     Rectangle(double length, double width) {
         this.length = length;
        this.width = width;
     }

     double calculateArea() {
         return length * width;
     }
 }
    public class AreaCalculator{
        public static void main(String[] args) {
            Rectangle r = new Rectangle(10.5,2.3);
            double area = r.calculateArea();
            System.out.println("The area of rectangle is " + area);
        }
    }
