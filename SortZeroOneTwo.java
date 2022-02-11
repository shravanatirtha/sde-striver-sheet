import java.util.Arrays;

/**
 * Given an array consisting of only 0s, 1s and 2s. Write a program to in-place
 * sort the
 * array without using inbuilt sort functions. ( Expected: Single pass-O(N) and
 * constant space)
 * 
 */

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 1, 0, 0, 2, 1, 0, 1, 1 };
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}