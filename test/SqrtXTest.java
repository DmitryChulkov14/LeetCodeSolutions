import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtXTest {

    @Test
    void mySqrt() {
        SqrtX solution = new SqrtX();

        assertEquals(2, solution.mySqrt(4));
        assertEquals(2, solution.mySqrt(8));
    }
}