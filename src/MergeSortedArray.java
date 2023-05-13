// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1pointer = m - 1;
        int num2pointer = n - 1;
        int insertPointer = m + n -1;

        while (num2pointer >= 0) {
            if (num1pointer >= 0 && nums1[num1pointer] > nums2[num2pointer]) {
                nums1[insertPointer--] = nums1[num1pointer--];
            } else {
                nums1[insertPointer--] = nums2[num2pointer--];
            }
        }
    }
}
