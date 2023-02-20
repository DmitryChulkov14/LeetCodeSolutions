import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CinemaSeatAllocationTest {

    @Test
    void maxNumberOfFamilies() {
        CinemaSeatAllocation solution = new CinemaSeatAllocation();

        assertEquals(4, solution.maxNumberOfFamilies(3, new int[][]{{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}}));
        assertEquals(2, solution.maxNumberOfFamilies(2, new int[][]{{2,1},{1,8},{2,6}}));
        assertEquals(4, solution.maxNumberOfFamilies(4, new int[][]{{4,3},{1,4},{4,6},{1,7}}));
    }
}