// https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1/

class Solution {
   
   List<String> ans;
   public List<String> AllParenthesis(int n) 
   {
       ans  = new ArrayList<>();
       generateUtil(n,n,"");
       return ans;
   }
   public void generateUtil(int open,int closed, String s){
       if(open==0 && closed==0){
           ans.add(s);
       }
       if(open > 0){
           generateUtil(open-1,closed,s+'(');
       }
       if(closed>open){
           generateUtil(open,closed-1,s+')');
       }
   }
}
