package com.game;

public class GameSimulator {

    public static void main(String[] args) {
        GameManager game = GameManager.getInstance();

        game.startGame();
        game.addScore(120);

        System.out.println("Score: " + game.getScore());
        System.out.println("Level: " + game.getLevel());

        game.pauseGame();
        game.resumeGame();
        game.endGame();
    }
}