package Abstraction;
abstract class Animal{
    abstract void sound();
}

class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("Roar");
    }
}

class Tiger extends Animal{
    @Override
    void sound() {
        System.out.println("Growl");
    }
}
public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}
