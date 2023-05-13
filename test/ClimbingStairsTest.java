import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
    }
}