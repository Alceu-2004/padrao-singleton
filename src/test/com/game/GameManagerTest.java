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
}