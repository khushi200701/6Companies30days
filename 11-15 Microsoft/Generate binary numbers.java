//https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1/

class solve{    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n)
    {
        // Your code here
         ArrayList<String> res = new ArrayList<>(); 
        Queue<String> q = new ArrayDeque<>(); 
        q.add("1");
        int count = 0;
        
        while(q.size() > 0){
            String rem = q.remove(); 
            res.add(rem); 
            count++; 
            if(count == n) return res; 
            q.add(rem + "0"); 
            q.add(rem + "1"); 
        }
         return res; 
    }    
}
