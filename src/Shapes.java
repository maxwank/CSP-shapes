public class Shapes {

    public static void square(Turtle t, int sideLength) {
        for (int i = 0; i < 4; i++) { //repeat 4 times
            t.forward(sideLength);
            t.right(90);
        }
    }

    public static void triangle(Turtle t, int sideLength) {
        for (int i = 0; i < 3; i++) {
            t.forward(sideLength);
            t.right(120);
        }

    }

    public static void circle(Turtle t, int sideLength) {
        for (int i = 0; i < 360; i++) {
            t.forward(sideLength);
            t.left(1);

        }
    }

    public static void rectangle(Turtle t, int LRsideLength, int TBsideLength) {
        for (int i = 0; i < 2; i++) {
            t.forward(LRsideLength);
            t.left(90);
            t.forward(TBsideLength);
            t.left(90);
        }
    }

    public static void hexagon(Turtle t, int sideLength) {
        for (int i = 0; i < 6; i++) {
            t.forward(sideLength);
            t.right(60);
        }
    }

    public static void spiral(Turtle t, int size) {
        for (double sideLength = 0.5; sideLength < size; sideLength += 0.3) {
            t.forward(sideLength);
            t.right(20);
        }
    }

    public static void initial(Turtle t, int sideLength) {
        for (int m = 0; m < 2; m++) {
            t.setDirection(70);
            t.forward(sideLength);
            t.setDirection(290);
            t.forward(sideLength);
        }

        t.up();
        Move.left(t,20);
        t.setDirection(70);
        t.up();
        t.forward(sideLength);
        t.down();

        for (int w = 0; w < 2; w++){
            t.setDirection(290);
            t.forward(sideLength);
            t.setDirection(70);
            t.forward(sideLength);
        }

    }
}