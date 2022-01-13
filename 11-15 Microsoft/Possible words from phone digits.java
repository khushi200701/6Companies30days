// https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1/

class Solution
{
    static ArrayList<String> possibleWords(int a[], int n)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(n == 0)
            return ans;
        int index = 0;
        String output = "";
        String keypad[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(a,n,index,keypad,output,ans);
        return ans;
    }
    
    static void solve(int arr[],int n,int index,String keypad[],String output,ArrayList<String> ans){
    
        if(index >= n){
            ans.add(output);
            return ;
        }
        
        String temp = keypad[arr[index]];
        
        for(int i=0;i<temp.length();i++){
            char ch = temp.charAt(i);
            solve(arr,n,index+1,keypad,output+ch,ans);
        }
    }
}
