import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
    }
}