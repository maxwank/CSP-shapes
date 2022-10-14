public class Shapes {

    public static void square(Turtle t, int sideLength) {
        for(int i=0;i<4;i++) { //repeat 4 times
            t.forward(sideLength);
            t.right(90);
        }
    }

    public static void triangle(Turtle t, int sideLength) {
        for(int i=0;i<3;i++) {
            t.forward(sideLength);
            t.right(120);
        }

    }

    public static void circle(Turtle t, int sideLength) {
        for(int i=0;i<360;i++) {
            t.forward(sideLength);
            t.left(1);

        }
    }

    public static void rectangle(Turtle t, int LRsideLength, int TBsideLength) {
        for(int i=0;i<2;i++) {
            t.forward(LRsideLength);
            t.left(90);
            t.forward(TBsideLength);
            t.left(90);
        }
    }

    public static void hexagon(Turtle t, int sideLength) {
        for(int i=0;i<6;i++) {
            t.forward(sideLength);
            t.right(60);
        }
    }

}
