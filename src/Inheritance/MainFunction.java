package Inheritance;
class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class MainFunction {
    public static void main(String[] args) {

        Degree dd= new Degree();
        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();

        dd.getDegree();
        ug.getDegree();
        pg.getDegree();
    }
}

