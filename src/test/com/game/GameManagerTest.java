package com.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameManagerTest {

    @Test
    void shouldReturnSameInstance() {
        GameManager g1 = GameManager.getInstance();
        GameManager g2 = GameManager.getInstance();
        assertSame(g1, g2);
    }

    @Test
    void shouldStartGameCorrectly() {
        GameManager game = GameManager.getInstance();
        game.resetGame();
        game.startGame();

        assertEquals(GameState.RUNNING, game.getState());
        assertEquals(0, game.getScore());
        assertEquals(1, game.getLevel());
    }

    @Test
    void shouldAddScoreOnlyWhenRunning() {
        GameManager game = GameManager.getInstance();
        game.resetGame();

        game.addScore(50);
        assertEquals(0, game.getScore());

        game.startGame();
        game.addScore(50);
        assertEquals(50, game.getScore());
    }

    @Test
    void shouldIncreaseLevel() {
        GameManager game = GameManager.getInstance();
        game.resetGame();

        game.startGame();
        game.addScore(150);

        assertEquals(2, game.getLevel());
    }

    @Test
    void shouldPauseAndResume() {
        GameManager game = GameManager.getInstance();
        game.resetGame();

        game.startGame();
        game.pauseGame();
        assertEquals(GameState.PAUSED, game.getState());

        game.resumeGame();
        assertEquals(GameState.RUNNING, game.getState());
    }

    @Test
    void shouldEndGame() {
        GameManager game = GameManager.getInstance();
        game.resetGame();

        game.startGame();
        game.endGame();

        assertEquals(GameState.ENDED, game.getState());
    }

    @Test
    void shouldResetGame() {
        GameManager game = GameManager.getInstance();

        game.startGame();
        game.addScore(200);
        game.resetGame();

        assertEquals(0, game.getScore());
        assertEquals(1, game.getLevel());
        assertEquals(GameState.NOT_STARTED, game.getState());
    }
}