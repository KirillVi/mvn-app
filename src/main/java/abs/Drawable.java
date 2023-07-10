package abs;

public interface Drawable extends Printable {
    void draw();

}
class Triangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }

    @Override
    public void print() {

    }
}

    class testerDraw{
        public static void main(String[] args) {
            new Triangle().draw();
            new Triangle().printDefault();
        }
    }


