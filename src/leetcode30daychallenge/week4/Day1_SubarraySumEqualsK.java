package leetcode30daychallenge.week4;

import java.util.HashMap;

public class Day1_SubarraySumEqualsK {
    public static void main(String[] args) {
        /*
        Given an array of integers and an integer k, you need to find the total number of continuous subarrays
        whose sum equals to k.

        Example 1:
        Input:nums = [1,1,1], k = 2
        Output: 2

        Note:
        The length of the array is in range [1, 20,000].
        The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
        */

        int[] input = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(input, k));


    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for (int value : nums) {
            sum += value;
            int n = map.getOrDefault(sum - k, 0);
            count += n;

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
