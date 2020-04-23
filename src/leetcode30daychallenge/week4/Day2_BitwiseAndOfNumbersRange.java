package leetcode30daychallenge.week4;

public class Day2_BitwiseAndOfNumbersRange {
    public static void main(String[] args) {
        /*
        Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

        Example 1:
        Input: [5,7]
        Output: 4

        Example 2:
        Input: [0,1]
        Output: 0
        */

        int m1 = 5, n1 = 7;
        int m2 = 0, n2 = 0;

        System.out.println(rangeBitwiseAnd(m1, n1));
        System.out.println(rangeBitwiseAnd(m2, n2));
    }

    public static int rangeBitwiseAnd(int m, int n) {
        while (n > m) {
            n = n & n - 1;
        }
        return m & n;
    }
}
