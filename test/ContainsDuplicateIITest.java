import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateIITest {

    @Test
    void containsNearbyDuplicate() {
        ContainsDuplicateII solution = new ContainsDuplicateII();

        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}