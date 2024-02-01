package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case(KeyEvent.VK_A):
                break;
            case(KeyEvent.VK_D):
                break;
            case(KeyEvent.VK_LEFT):
                break;
            case(KeyEvent.VK_RIGHT):
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
