package entities;

public class Ball {
    private int xpos;
    private int ypos;
    private int xvel;
    private int yvel;
    private int side;
    private int direction;

    public Ball() {
        xpos = 200;
        ypos = 200;
        xvel = 10;
        yvel = 0;
        side = 10;
        direction = 0;
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

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getXvel() {
        return xvel;
    }

    public void setXvel(int xvel) {
        this.xvel = xvel;
    } 

    public int getYvel() {
        return yvel;
    }

    public void setYvel(int yvel) {
        this.yvel = yvel;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
