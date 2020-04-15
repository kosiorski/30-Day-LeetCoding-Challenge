package leetcode30daychallenge.week2;

public class Day7_PerformStringShifts {
    public static void main(String[] args) {
        /*
        You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

        direction can be 0 (for left shift) or 1 (for right shift).
        amount is the amount by which string s is to be shifted.
        A left shift by 1 means remove the first character of s and append it to the end.
        Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
        Return the final string after all operations.



        Example 1:

        Input: s = "abc", shift = [[0,1],[1,2]]
        Output: "cab"
        Explanation:
        [0,1] means shift to left by 1. "abc" -> "bca"
        [1,2] means shift to right by 2. "bca" -> "cab"
        Example 2:

        Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
        Output: "efgabcd"
        Explanation:
        [1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
        [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
        [0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
        [1,3] means shift to right by 3. "abcdefg" -> "efgabcd"


        Constraints:

        1 <= s.length <= 100
        s only contains lower case English letters.
        1 <= shift.length <= 100
        shift[i].length == 2
        0 <= shift[i][0] <= 1
        0 <= shift[i][1] <= 100
        */


        String s1 = "abc";          //"cab"
        String s2 = "abcdefg";      //"efgabcd"
        String s3 = "mecsk";        //"kmecs"

        int[][] shift1 = {{0, 1}, {1, 2}};
        int[][] shift2 = {{1, 1}, {1, 1}, {0, 2}, {1, 3}};
        int[][] shift3 = {{1, 4}, {0, 5}, {0, 4}, {1, 1}, {1, 5}};


        System.out.println(stringShift(s1, shift1));
        System.out.println(stringShift(s2, shift2));
        System.out.println(stringShift(s3, shift3));

    }

    public static String stringShift(String s, int[][] shift) {
        if (s.length() == 1) {
            return s;
        }
        int offset = 0;
        for (int[] ints : shift) {
            if (ints[0] == 0) {
                offset -= ints[1];
            } else {
                offset += ints[1];
            }
        }
        offset = offset % s.length();
        if (offset == 0) {
            return s;
        } else if (offset < 0) {
            offset += s.length();
        }
        return s.substring(s.length() - offset) + s.substring(0, s.length() - offset);
    }
}
