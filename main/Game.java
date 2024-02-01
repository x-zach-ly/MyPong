package main;

import entities.Ball;
import entities.Paddle;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Paddle player1;
    private Paddle player2;
    private Ball ball;

    public Game() {
        ball = new Ball();
        player1 = new Paddle(20, 150);
        player2 = new Paddle(340, 150);

        gamePanel = new GamePanel(player1, player2, ball);
        gameWindow = new GameWindow(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
    }
}