package abs;

public class TypePlayer extends Player implements Playable{

    @Override
    public void play() {
        System.out.println("Start type record Playing.....");
    }

    @Override
    public void stop() {
        System.out.println("stop record playing");

    }
}
