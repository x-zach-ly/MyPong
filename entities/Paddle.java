package entities;

public class Paddle {
    private int xpos;
    private int ypos;
    private int yvel;
    private int height;
    private int width;

    public Paddle() {
        xpos = 0;
        ypos = 0;
        yvel = 0;
        height = 50;
        width = 10;
    }

    public Paddle(int X, int Y) {
        xpos = X;
        ypos = Y;
        yvel = 0;
        height = 50;
        width = 10;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }
}
