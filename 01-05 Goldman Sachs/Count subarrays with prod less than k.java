// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int count = 0;
        long mult;
 
        for (int i = 0; i < n; i++) {
            if (a[i] < k )
                count++;
 
            mult = a[i];
 
            for (int j = i + 1; j < n; j++) {
                mult *= a[j];
                if (mult < k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}
