package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entities.Paddle;
import entities.Ball;
import main.GamePanel;

public class KeyboardInputs implements KeyListener {

    public final int deltaY = 5;

    private GamePanel gamePanel;
    private Paddle player1;
    private Paddle player2;

    public KeyboardInputs(GamePanel gamePanel, Paddle player1, Paddle player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case(KeyEvent.VK_A):
                player1.setYpos(player1.getYpos() - deltaY);
                break;
            case(KeyEvent.VK_D):
                player1.setYpos(player1.getYpos() + deltaY);
                break;
            case(KeyEvent.VK_LEFT):
                player2.setYpos(player2.getYpos() + deltaY);
                break;
            case(KeyEvent.VK_RIGHT):
                player2.setYpos(player2.getYpos() - deltaY);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
