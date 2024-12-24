package Interface;
interface Animall {
    void bark();
}

class Dog implements Animall {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.bark();
    }
}

