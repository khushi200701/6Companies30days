// https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
       int [] result = new int[n];
        result[0] = 1;
        for (int i=1; i<n; i++) {
            result[i] = 1;
            for (int j = i-1; j>=0; j -= result[j]) {
                if (price[j] > price[i]) 
                    break;  
                result[i] += result[j];
            }
        }
        return result;
    }
    
}
