package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;

    public GamePanel() {
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs() {});
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(ALLBITS, ABORT, WIDTH, HEIGHT);
    }
}
