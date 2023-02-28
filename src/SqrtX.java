// https://leetcode.com/problems/sqrtx/

public class SqrtX {
    public int mySqrt(int x) {
        if (x <= 1) return x;

        int start = 1;
        int end = x / 2;

        while (start < end) {
            int mid = ((start + end) / 2) + 1;

            int div = x / mid;
            if (div == mid) return mid;
            if (div > mid)
                start = mid;
            else
                end = mid - 1;
        }

        return start;
    }
}
