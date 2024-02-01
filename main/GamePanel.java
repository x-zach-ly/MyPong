package main;

import javax.swing.JPanel;
import entities.Ball;
import entities.Paddle;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Graphics;
// import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private Paddle player1;
    private Paddle player2;
    private Ball ball;

    public GamePanel(Paddle a, Paddle b, Ball ball) {
        player1 = a;
        player2 = b;
        this.ball = ball;
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this, player1, player2));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(player1.getXpos(), player1.getYpos(), player1.getWidth(), player1.getHeight());
        g.fillRect(player2.getXpos(), player2.getYpos(), player2.getWidth(), player2.getHeight());
        checkCollision();
        ballMove();
        g.fillRect(ball.getXpos(), ball.getYpos() + ball.getYvel(), ball.getSide(), ball.getSide());
        repaint();
    }

    public void ballMove() {
        for(int i = 0; i < 1000000000; i++) {}
        ball.setXpos(ball.getXpos() + ball.getXvel());
    }

    public void checkCollision() {
        switch(ball.getDirection()) {
            case(0):
                if(ball.getXpos() + ball.getSide() > player2.getXpos() && ball.getYpos() + ball.getSide() > player2.getYpos() 
                && ball.getYpos() < player2.getYpos() + player2.getHeight()) {
                    ball.setYvel(player2.getYvel());
                    ball.setXvel(-1 * ball.getXvel());
                    ball.setDirection(1);
                }
                break;
            case(1):
                if(ball.getXpos() < player1.getXpos() + player1.getWidth() && ball.getYpos() + ball.getSide() > player1.getYpos() 
                && ball.getYpos() < player1.getYpos() + player1.getHeight()) {
                    ball.setYvel(player1.getYvel());
                    ball.setXvel(-1 * ball.getXvel());
                    ball.setDirection(0);
                }
                break;
        }
    }
}
