public class Move {
    //declare variables for movement without the pen
    public static void up(Turtle t, int distance) {
        t.up();
        t.setDirection(90);
        t.forward(distance);
        t.setDirection(0);
        t.down();
    }
    public static void down(Turtle t, int distance) {
        t.up();
        t.setDirection(270);
        t.forward(distance);
        t.setDirection(0);
        t.down();
    }
    public static void left(Turtle t, int distance) {
        t.up();
        t.setDirection(180);
        t.forward(distance);
        t.setDirection(0);
        t.down();
    }
    public static void right(Turtle t, int distance) {
        t.up();
        t.setDirection(360);
        t.forward(distance);
        t.setDirection(0);
        t.down();
    }

}
