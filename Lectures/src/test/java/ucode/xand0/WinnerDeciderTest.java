package ucode.xand0;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static ucode.xand0.MatrixElement.E;
import static ucode.xand0.MatrixElement.O;
import static ucode.xand0.MatrixElement.X;

class WinnerDeciderTest {

    private static Stream<Arguments> generateMatrixElements() {
        return Stream.of(
                Arguments.of(new MatrixElement[][]{
                        {X, E, E},
                        {X, O, O},
                        {X, O, E}
                }, true, MatrixElement.X),
                Arguments.of(new MatrixElement[][]{
                        {O, E, E},
                        {X, O, O},
                        {X, O, E}
                }, false, MatrixElement.X),
                Arguments.of(new MatrixElement[][]{
                        {O, E, E},
                        {O, O, O},
                        {X, O, E}
                }, true, MatrixElement.O)
        );
    }

    @ParameterizedTest
    @MethodSource("generateMatrixElements")
    void test1(MatrixElement[][] matrixElements, boolean condition, MatrixElement testedMatrixElement) {
        // GIVEN
        WinnerDecider winnerDecider = new WinnerDecider(matrixElements);

        // WHEN
        boolean result = winnerDecider.isGameWon(testedMatrixElement);

        // THEN
        assertEquals(condition, result);
    }


}