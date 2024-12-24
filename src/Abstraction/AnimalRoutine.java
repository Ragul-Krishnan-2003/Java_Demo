package Abstraction;
abstract class Animals{
    public abstract void eat();
    public abstract void sleep();
}
class Lions extends Animals{
    @Override
    public void eat() {
        System.out.println("The lion hunts and eat the meat.");
    }

    @Override
    public void sleep() {
        System.out.println("The lion Sleeps a 20 hr per day");
    }
}
class Tigers extends Animals{
    @Override
    public void eat() {
        System.out.println("The Tiger will haunt and eats like a beast");
    }

    @Override
    public void sleep() {
        System.out.println("The Tiger sleep on the tree");
    }
}
class Deers extends Animals{
    @Override
    public void eat() {
        System.out.println("The deer will eat the grass and leaves");
    }

    @Override
    public void sleep() {
        System.out.println("The deer sleep lightly and staying alert");
    }
}
public class AnimalRoutine {
    public static void main(String[] args) {
        Animals lion = new Lions();
        Animals tiger = new Tigers();
        Animals deer = new Deers();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    }
}
