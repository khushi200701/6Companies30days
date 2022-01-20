// https://practice.geeksforgeeks.org/problems/implement-atoi/1/

class Solution
{
   int atoi(String str) {
       int n=str.length();
       int ans=0;
       if(str.charAt(0)=='-')
       {
           for(int i=1;i<n;i++)
           {
               if(str.charAt(i)>='0' && str.charAt(i)<='9')
               {
                   ans=(ans*10)+(str.charAt(i)-'0');
               }
               else{
                   return -1;
               }
           }
       }
       else{
           for(int i=0;i<n;i++)
           {
               if(str.charAt(i)>='0' && str.charAt(i)<='9')
               {
                   ans=(ans*10)+(str.charAt(i)-'0');
               }
               else{
                   return -1;
               }
           }
       }
       if(str.charAt(0)=='-')
       {
           return -ans;
       }
       return ans;
       
   }
}
