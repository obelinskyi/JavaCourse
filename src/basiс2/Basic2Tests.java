package basiс2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Basic2Tests {

    @Test
    void testNextRandomInt() {
        for (int i = 0; i < 1000; i++) {
            int randomInt = Basic2.nextRandomInt();
            assertTrue(randomInt >= -1000 && randomInt <= 1000,
                    "nextRandomInt() returned value which is not between -1000 and 1000");
        }
    }

    @Test
    void testSumHigherBound() {
        assertTrue(Basic2.arraySum(5) <= 5 * Basic2.HIGHER_BOUND,
                "Sum of 5 numbers could not be more than " + 5 * Basic2.HIGHER_BOUND);
        assertTrue(Basic2.arraySum(10) <= 10 * Basic2.HIGHER_BOUND,
                "Sum of 10 numbers could not be more than " + 10 * Basic2.HIGHER_BOUND);
    }

    @Test
    void testSumLowerBound() {
        int sum;
        sum = Basic2.arraySum(5);
        assertTrue(sum >= (5 * Basic2.LOWER_BOUND),
                "Sum of 5 numbers could not be less than " + (5 * Basic2.LOWER_BOUND) + ". Actual sum: " + sum);
        sum = Basic2.arraySum(10);
        assertTrue(sum >= (10 * Basic2.LOWER_BOUND),
                "Sum of 10 numbers could not be more than " + (10 * Basic2.LOWER_BOUND) + ". Actual sum: " + sum);
    }

}
