package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entities.Paddle;
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
                player1.setYvel(-1 * deltaY);
                break;
            case(KeyEvent.VK_D):
                player1.setYpos(player1.getYpos() + deltaY);
                player1.setYvel(deltaY);
                break;
            case(KeyEvent.VK_LEFT):
                player2.setYpos(player2.getYpos() + deltaY);
                player2.setYvel(deltaY);
                break;
            case(KeyEvent.VK_RIGHT):
                player2.setYpos(player2.getYpos() - deltaY);
                player2.setYvel(-1 * deltaY);
                break;
            default:
                player1.setYvel(0);
                player2.setYvel(0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
