package Week1;

public class Day5_BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {

        /*
        Say you have an array for which the ith element is the price of a given stock on day i.
        Design an algorithm to find the maximum profit. You may complete as many transactions as you like
        (i.e., buy one and sell one share of the stock multiple times).
        Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
        */

        int[] array1 = {7, 1, 5, 3, 6, 4};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {7, 6, 4, 3, 1};     

        System.out.println(maxProfit(array1));
        System.out.println(maxProfit(array2));
        System.out.println(maxProfit(array3));


    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }
}
