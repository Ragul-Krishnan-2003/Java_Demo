package Constructors;//  parameterised constructor.
class Strang{
    String name;
    int age;

    Strang(String name,int age){
      this.name = name;
      this.age = age;
    }
    public void displayDetail(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        Strang pp = new Strang("Leo",25);
        pp.displayDetail();
    }
}

