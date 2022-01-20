// https://practice.geeksforgeeks.org/problems/longest-arithmetic-progression1019/1/

class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        
        //Hashmap for each index denoting the longest AP at that point corresponding to different d values
        HashMap<Integer,Integer>[]dp = new HashMap[n];
        int ans  = Integer.MIN_VALUE;
        
        for(int i=0; i<A.length;i++){
            
            dp[i] = new HashMap<Integer, Integer>();
            
            for(int j=0; j<i;j++){
                
                int diff = A[i]-A[j];
                
                //Similar to longest common subsequence, we check if the map at jth value has a difference of diff,
                //if yes, then we add 1 to its length and keep updating them in map of i as well.
                dp[i].put(diff, dp[j].getOrDefault(diff,1)+1);
                
                ans = Math.max(ans, dp[i].get(diff));
            }
        }
        
