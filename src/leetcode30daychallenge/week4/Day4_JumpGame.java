package leetcode30daychallenge.week4;

public class Day4_JumpGame {
    public static void main(String[] args) {
        /*
        Given an array of non-negative integers, you are initially positioned at the first index of the array.

        Each element in the array represents your maximum jump length at that position.

        Determine if you are able to reach the last index.

        Example 1:

        Input: [2,3,1,1,4]
        Output: true
        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
        Example 2:

        Input: [3,2,1,0,4]
        Output: false
        Explanation: You will always arrive at index 3 no matter what. Its maximum
        jump length is 0, which makes it impossible to reach the last index.
        */

        int[] input1 = {2, 3, 1, 1, 4};
        int[] input2 = {3, 2, 1, 0, 4};

        System.out.println(canJump(input1));
        System.out.println(canJump(input2));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length <= 1)
            return true;

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max <= i && nums[i] == 0)
                return false;

            if (i + nums[i] > max) {
                max = i + nums[i];
            }

            if (max >= nums.length - 1)
                return true;
        }
        return false;
    }
}
