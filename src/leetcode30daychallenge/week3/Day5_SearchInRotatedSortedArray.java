package leetcode30daychallenge.week3;

public class Day5_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        /*
        Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

        (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

        You are given a target value to search. If found in the array return its index, otherwise return -1.

        You may assume no duplicate exists in the array.

        Your algorithm's runtime complexity must be in the order of O(log n).

        Example 1:
        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4

        Example 2:
        Input: nums = [4,5,6,7,0,1,2], target = 3
        Output: -1
        */

        int[] input1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;

        int[] input2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;

        System.out.println(search(input1, target1));
        System.out.println(search(input2, target2));

    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid])
                return mid;

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
