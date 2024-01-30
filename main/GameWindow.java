package main;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;

    public GameWindow() {
        jframe = new JFrame();

        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
}
