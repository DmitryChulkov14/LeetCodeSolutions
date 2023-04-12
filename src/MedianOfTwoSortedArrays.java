// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = getMergedArray(nums1, nums2);

        if (mergedArray.length % 2 == 0) {
            // if mergedArray.length is even, then we need to take 2 numbers from middle of array,
            // sum them and divide by 2.0 (by .0 we're converting result to double)
            return (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2.0;
        } else {
            return mergedArray[mergedArray.length / 2];
        }
    }

    private int[] getMergedArray(int[] nums1, int[] nums2) {
        int indexOfNums1 = 0;
        int indexOfNums2 = 0;
        int mergedArrayIndex = 0;

        int[] mergedArray = new int[nums1.length + nums2.length];

        while (indexOfNums1 < nums1.length && indexOfNums2 < nums2.length) {
            if (nums1[indexOfNums1] < nums2[indexOfNums2]) {
                mergedArray[mergedArrayIndex++] = nums1[indexOfNums1++];
            } else {
                mergedArray[mergedArrayIndex++] = nums2[indexOfNums2++];
            }
        }

        // if num2 doesn't contain any more elements, but num1 does - then add all left elements from num1 to mergedArray
        while (indexOfNums1 < nums1.length) {
            mergedArray[mergedArrayIndex++] = nums1[indexOfNums1++];
        }

        // if num1 doesn't contain any more elements, but num2 does - then add all left elements from num2 to mergedArray
        while (indexOfNums2 < nums2.length) {
            mergedArray[mergedArrayIndex++] = nums2[indexOfNums2++];
        }

        return mergedArray;
    }
}
