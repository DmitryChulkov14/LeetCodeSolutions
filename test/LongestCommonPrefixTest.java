import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}