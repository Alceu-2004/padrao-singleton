package com.game;

public class GameManager {

    private static GameManager instance;

    private int score;
    private int level;
    private GameState state;

    private GameManager() {
        this.score = 0;
        this.level = 1;
        this.state = GameState.NOT_STARTED;
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        if (state == GameState.NOT_STARTED || state == GameState.ENDED) {
            score = 0;
            level = 1;
            state = GameState.RUNNING;
        }
    }

    public void pauseGame() {
        if (state == GameState.RUNNING) {
            state = GameState.PAUSED;
        }
    }

    public void resumeGame() {
        if (state == GameState.PAUSED) {
            state = GameState.RUNNING;
        }
    }

    public void endGame() {
        if (state == GameState.RUNNING || state == GameState.PAUSED) {
            state = GameState.ENDED;
        }
    }

    public void resetGame() {
        score = 0;
        level = 1;
        state = GameState.NOT_STARTED;
    }

    public void addScore(int points) {
        if (state == GameState.RUNNING) {
            score += points;
            if (score >= level * 100) {
                level++;
            }
        }
    }

    public int getScore() { return score; }
    public int getLevel() { return level; }
    public GameState getState() { return state; }
}