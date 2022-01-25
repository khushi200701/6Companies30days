class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int k = sc.nextInt();
                    String str = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.findMaximumNum(str, k));
                }
        }
}// } Driver Code Ends
class Solution
{
    //Function to find the largest number after k swaps.
    public String findMaximumNum(String s, int k){
        max = Long.parseLong(s);
        f(s,k);
        
        return Long.toString(max);
    }
    
    long max;
    
    public void f(String s, int k){
        max = Math.max(Long.valueOf(s),Long.valueOf(max));

        if(k == 0)
            return;
            
        int n = s.length();
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(j)>s.charAt(i)){
                    
                    s = swap(s,i,j);
                    f(s,k-1);
                    s = swap(s,i,j);
                }
            }
        }
    }
    
    public String swap(String s, int i,int j){
        char[] c = s.toCharArray();
        
        char ch = c[i];
        c[i] = c[j];
        c[j] = ch;
        
        return s.valueOf(c);
    }
}
