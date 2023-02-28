// https://leetcode.com/problems/add-binary/

public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int digitSum;

        StringBuilder sum = new StringBuilder();

        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            digitSum = carry;

            if (indexA >= 0) {
                digitSum += a.charAt(indexA--) - '0';
            }

            if (indexB >= 0) {
                digitSum += b.charAt(indexB--) - '0';
            }

            if (digitSum > 1)
                carry = 1;
            else
                carry = 0;

            sum.insert(0, digitSum % 2);
        }

        return sum.toString();
    }
}
