package abs;

//100% abstract class.
public interface Playable {

    //public abstract by default
    void  play();

    public abstract void stop();

    //by default field is public,static,final(constant)
    double pi = 3.14;
    public static final double X = 3;
}
