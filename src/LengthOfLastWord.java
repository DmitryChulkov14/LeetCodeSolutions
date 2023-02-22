// https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
//        Using string methods solution:
//
//        String[] splitedInputString = s.trim().split(" ");
//        return splitedInputString[splitedInputString.length - 1].length();

        // logical solution
        int lengthOfLastWord = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') {
                lengthOfLastWord++;
            } else {
                if (lengthOfLastWord > 0) break;
            }
        }
        return lengthOfLastWord;
    }
}
