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

    public void setXpos(int x) {
        xpos = x;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int y) {
        ypos = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getYvel() {
        return yvel;
    }

    public void setYvel(int yvel) {
        this.yvel = yvel;
    }
}
