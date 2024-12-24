package Interface;
interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}
public class Sports {
    public static void main(String[] args) {
        Playable fb = new Football();
        Playable vb = new Volleyball();
        Playable bb = new Basketball();

        fb.play();
        vb.play();
        bb.play();
    }
}

