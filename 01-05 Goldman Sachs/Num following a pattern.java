// https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1

class Solution{
    static String printMinNumberForPattern(String seq){
        // code here
             String result = "";
        Stack<Integer> stk = new Stack<Integer>();
 
       
        for (int i = 0; i <= seq.length(); i++) {
                     stk.push(i + 1);
            if (i == seq.length() || seq.charAt(i) == 'I') {
            
                while (!stk.empty()) {
                    result += String.valueOf(stk.peek());
                    stk.pop();
                }
            }
        }
        return (result);
    }
}
