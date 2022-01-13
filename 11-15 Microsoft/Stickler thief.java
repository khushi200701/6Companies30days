// https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1/

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[arr.length + 2];
       dp[0] = 0;
       dp[1] = 0;//maintaining history in dp array so that we can compare 
       for (int i = 0; i < arr.length; i++) {
           dp[i + 2] = Math.max(arr[i] + dp[i], dp[i + 1]);
       }
       return dp[dp.length-1];
    }
}
