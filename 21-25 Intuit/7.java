class Solution {    
    public int trip(int[] w, int c)
    {        int tripcnt = 0, currcap = 0;        
        for(int i=0; i<w.length; i++)
        {
            if(currcap + w[i] <= c)
            {
                currcap += w[i];
            }
            else
            {
                tripcnt++;
                currcap = w[i];
            }
        }
        return tripcnt + 1;
    }
    
    public int shipWithinDays(int[] w, int d) {        
        int lo=w[0], hi=0, mid;
        for(int i=0;i<w.length;i++)
        {
            lo = Math.max(lo, w[i]);
            hi += w[i];
        }        
        while(lo < hi)
        {
            mid = lo + (hi-lo)/2;            
            if(trip(w, mid) <= d)
            {
                hi = mid;
            }
            else 
                lo = mid+1;                
        }
        return lo;
    }
}
