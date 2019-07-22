package ucode.xand0;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixElementTest {

    @Test
    void isXStringActuallyX() {
        // GIVEN
        MatrixElement theElementToTest = MatrixElement.X;

        // WHEN
        String result = theElementToTest.toString();

        // THEN
        assertEquals("X", result);
    }

    @Test
    void isOStringActually0() {
        assertEquals("0", MatrixElement.O.toString());
    }

    @Test
    void isEmptyStringActuallyEmpty() {
        assertEquals(" ", MatrixElement.E.toString());
    }

}