// https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1/

class Solution
{
     boolean subsetSum(int arr[],int n,int sum,boolean dp[][])
   {
       for(int i=0;i<n+1;i++)
       {
           for(int j=0;j<sum+1;j++)
           {
               if(i==0)
               dp[i][j]=false;
               
               if(j==0)
               dp[i][j]=true;
           }
       }
       
       for(int i=1;i<n+1;i++)
       {
           for(int j=1;j<sum+1;j++)
           {
               if(arr[i-1]<=j)
               {
                  dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
               }
               else
               dp[i][j]=dp[i-1][j];
           }
       }
       return dp[n][sum];
   }
   
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	     int range=0;
    for(int e:arr)
        range=range+e;
       
    boolean dp[][]=new boolean[n+1][range+1];
    
    subsetSum(arr,n,range,dp);
    
    int res[]=new int[range/2+1];
    
    for(int j=0;j<=range/2;j++)
    {
        if(dp[n][j])
        res[j]=j;
    }
    
    int min=Integer.MAX_VALUE;
    for(int i=0;i<res.length;i++)
    {
        min=Math.min(min,range-2*res[i]);
    }
    
    return min;
	} 
}
