package leetcode30daychallenge.week1;

public class Day4_MoveZeroes {
    public static void main(String[] args) {

        /*
        Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order
        of the non-zero elements.
        */

        int[] array = {0, 1, 0, 3, 12};

        moveZeroes(array);

        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int j = count; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
