// https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {

    //121
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int reversed = 0;
        int tempNum;

        while (x != 0) {
            tempNum = x % 10;
            reversed = reversed * 10 + tempNum;
            x /= 10;
        }

        return original == reversed;
    }
}
