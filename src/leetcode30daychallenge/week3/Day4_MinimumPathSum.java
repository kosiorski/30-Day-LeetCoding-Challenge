package leetcode30daychallenge.week3;

public class Day4_MinimumPathSum {
    public static void main(String[] args) {

        /*
        Given a m x n grid filled with non-negative numbers, find a path from top left to bottom
        right which minimizes the sum of all numbers along its path.

        Note: You can only move either down or right at any point in time.

        Example:

        Input:
        [
          [1,3,1],
          [1,5,1],
          [4,2,1]
        ]
        Output: 7
        Explanation: Because the path 1→3→1→1→1 minimizes the sum.
        */

        int[][] input =
                {
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
                };

        System.out.println(minPathSum(input));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] mins = new int[m][n];
        mins[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            mins[i][0] = mins[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            mins[0][j] = mins[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                mins[i][j] = Math.min(mins[i - 1][j], mins[i][j - 1]) + grid[i][j];
            }
        }
        return mins[m - 1][n - 1];
    }
}
