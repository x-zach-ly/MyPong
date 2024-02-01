package main;

import javax.swing.JPanel;

import entities.Paddle;
import entities.Ball;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private Paddle player1;
    private Paddle player2;

    public GamePanel(Paddle a, Paddle b) {
        player1 = a;
        player2 = b;
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this, player1, player2) {});
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(player1.getXpos(), player1.getYpos(), player1.getWidth(), player1.getHeight());
        g.fillRect(player2.getXpos(), player2.getYpos(), player2.getWidth(), player2.getHeight());
        repaint();
    }
}
