package ucode.xand0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ScoreTest {

    @Test
    void player0updatesScore() {
        // GIVEN
        Score score = new Score();

        // WHEN
        score.updateScore(MatrixElement.O);

        // THEN
        assertEquals("player X: 0, player 0: 1", score.toString());

    }

    @Test
    void playerXUpdatesScore() {
        // GIVEN
        Score score = new Score();

        // WHEN
        score.updateScore(MatrixElement.X);

        // THEN
        assertEquals("player X: 1, player 0: 0", score.toString());
    }

    @Test
    void cannotUpdateScoreUnlessRealPlayer() {
        // GIVEN
        Score score = new Score();

        // WHEN
        try {
            score.updateScore(MatrixElement.E);
            fail("Expected an exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    /**
     * in acest test am facut nu stiu ce
     */
    @Test
    void actualGameScenarioWorks() {
        // GIVEN
        Score score = new Score();

        // WHEN
        score.updateScore(MatrixElement.X);
        score.updateScore(MatrixElement.O);
        score.updateScore(MatrixElement.O);
        score.updateScore(MatrixElement.X);
        score.updateScore(MatrixElement.X);

        // THEN
        assertEquals("player X: 3, player 0: 2", score.toString());
    }


}