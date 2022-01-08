// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
       PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
       
       int i;
   
       for(i=0;i<k;i++)
       {
           q.add(arr[i]);
       }
            list.add(q.peek());
           q.remove(arr[0]);
       
       
       for(;i<n;i++)
       {
           q.add(arr[i]);
           list.add(q.peek());
           q.remove(arr[i-k+1]);
       }
      
         return list;
    }
}
