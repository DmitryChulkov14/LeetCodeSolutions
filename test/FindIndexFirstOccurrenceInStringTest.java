import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexFirstOccurrenceInStringTest {

    @Test
    void strStr() {
        FindIndexFirstOccurrenceInString solution = new FindIndexFirstOccurrenceInString();

        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(0, solution.strStr("a", "a"));
    }
}