package ucode.xand0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class XAnd0MatrixTest {

    private XAnd0Matrix matrix;

    @BeforeEach
    void initTests() {
        matrix = new XAnd0Matrix();
    }

    @Test
    void makeMove() {
        // GIVEN
        PlayerMove move = new PlayerMove(1, 1);
        MatrixElement theElementToSet = MatrixElement.X;

        // WHEN
        matrix.makeMove(move, theElementToSet);

        // THEN
        assertEquals(matrix.getMatrix()[1][1], theElementToSet);
    }

    @Test
    void isGameWon() {
        // GIVEN
        MatrixElement theElementToSet = MatrixElement.X;
        PlayerMove move1 = new PlayerMove(0, 0);
        PlayerMove move2 = new PlayerMove(1, 1);
        PlayerMove move3 = new PlayerMove(2, 2);

        // WHEN
        matrix.makeMove(move1, theElementToSet);
        matrix.makeMove(move2, theElementToSet);
        matrix.makeMove(move3, theElementToSet);

        // THEN
        assertTrue(matrix.isGameWon(theElementToSet));
    }

}