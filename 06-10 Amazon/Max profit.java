// https://practice.geeksforgeeks.org/problems/maximum-profit4657/1

class Solution {
    static int maxProfit(int k, int n, int price[]) {
        // code here
        int[][] profit = new int[k + 1][n + 1];

        for (int i = 0; i <= k; i++)
            profit[i][0] = 0;

        for (int j = 0; j <= n; j++)
            profit[0][j] = 0;

        for (int i = 1; i <= k; i++) 
        {
            for (int j = 1; j < n; j++)
            {
                int max_so_far = 0;

                for (int m = 0; m < j; m++)
                max_so_far = Math.max(max_so_far, price[j] -
                             price[m] + profit[i - 1][m]);

                profit[i][j] = Math.max(profit[i] [j - 1], 
                                              max_so_far);
            }
        }

        return profit[k][n - 1];
    }
}
