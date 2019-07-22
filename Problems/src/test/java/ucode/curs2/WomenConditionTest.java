package ucode.curs2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WomenConditionTest {

    @Test
    public void testCondition1() {
        WomenCondition womenCondition = new WomenCondition();

        boolean result = womenCondition.isComplexCondition();

        assertTrue(result);
    }

}