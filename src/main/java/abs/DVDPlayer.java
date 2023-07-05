package abs;

public class DVDPlayer extends Player implements Playable, Test{

    @Override
    public void play() {
        System.out.println("Start playing DVD Disk.....");
    }

    @Override
    public void stop() {
        System.out.println("Stop DVD play");
    }

    @Override
    public void test() {

    }
}
