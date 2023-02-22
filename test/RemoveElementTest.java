import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement solution = new RemoveElement();
        assertEquals(5, solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        assertEquals(2, solution.removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}