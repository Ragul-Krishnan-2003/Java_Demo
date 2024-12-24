package Constructors;

public class StudentC {
    int id;
    String name;

    StudentC(int i,String n){
        this.id = i;
        this.name = n;
    }
    StudentC( StudentC s){
        this.id = s.id;
        this.name = s.name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StudentC s1 = new StudentC(111,"Leo");
        StudentC s2 = new StudentC(s1);

        s2.display();
    }
}
