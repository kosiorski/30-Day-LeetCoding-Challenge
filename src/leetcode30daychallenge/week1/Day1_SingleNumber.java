package leetcode30daychallenge.week1;

import java.util.Arrays;

public class Day1_SingleNumber {
    public static void main(String[] args) {

        /*
        Given a non-empty array of integers, every element appears twice except for one. Find that single one.
        Note:
        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
        */

        int[] array1 = {2, 2, 1, 24, 1, 25, 24, 25, 7};
        System.out.println(singleNumber(array1));

    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
