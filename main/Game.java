package main;

import entities.Paddle;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Paddle player1;
    private Paddle player2;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);

        player1 = new Paddle(20, 150);
        player2 = new Paddle(320, 150);
    }
}