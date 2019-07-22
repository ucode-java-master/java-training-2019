package ucode.xand0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerMoveTest {

    @Test
    void playerMoveGetters() {
        // GIVEN
        PlayerMove playerMove = new PlayerMove(2, 3);

        // THEN
        assertEquals(2, playerMove.getLine());
        assertEquals(3, playerMove.getColumn());
    }

}