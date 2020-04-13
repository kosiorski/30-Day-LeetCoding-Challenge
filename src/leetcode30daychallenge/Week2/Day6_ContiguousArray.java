package leetcode30daychallenge.Week2;

import java.util.HashMap;

public class Day6_ContiguousArray {
    public static void main(String[] args) {
        /*
        Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

        Example 1:
        Input: [0,1]
        Output: 2
        Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
        Example 2:
        Input: [0,1,0]
        Output: 2
        Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
        Note: The length of the given binary array will not exceed 50,000.
        */

        int[] array1 = {0, 1};
        int[] array2 = {0, 1, 0};

        System.out.println(findMaxLength(array1));
        System.out.println(findMaxLength(array2));
    }

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int zero = 0;
        int one = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }

            if (map.containsKey(zero - one)) {
                length = Math.max(length, i - map.get(zero - one));
            } else {
                map.put(zero - one, i);
            }
        }
        return length;
    }
}
