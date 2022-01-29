class Solution{
        
    long power(int N,int R){
        return computePowerRecursive(N,R)%1000000007;       
            }
    
    long computePowerRecursive(int N, int R){
        if(R == 0)
            return 1;            
        long result = power(N,R/2);
        result = (result*result)%1000000007;
        if(R%2 == 0)
            return result;
        else
            return result*N;
    }
}
