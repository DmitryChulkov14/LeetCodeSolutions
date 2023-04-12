import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

        assertEquals(2.00000, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.50000, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}