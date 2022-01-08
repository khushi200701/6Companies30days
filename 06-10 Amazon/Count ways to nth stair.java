// https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1/#

class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
    Long countWays(int m)
    {
        // your code here
        Long ways=0L;
        for(int i=0;i<=m;i++){
           ways++;
           m--;
       }
       return ways;
    }    
}
