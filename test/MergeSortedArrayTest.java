import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void merge() {
        MergeSortedArray solution = new MergeSortedArray();

        // test1
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};

        solution.merge(num1, 3, num2, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, num1);

        // test2

        num1 = new int[]{1};
        num2 = new int[]{};

        solution.merge(num1, 1, num2, 0);

        assertArrayEquals(new int[]{1}, num1);

        // test3

        num1 = new int[]{0};
        num2 = new int[]{1};

        solution.merge(num1, 0, num2, 1);

        assertArrayEquals(new int[]{1}, num1);
    }
}