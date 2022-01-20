// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1/

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
       int leader = arr[arr.length - 1];
       for(int i = arr.length-1 ; i >= 0 ; i--)
       {
           if(arr[i] >= leader)
           {
               leader = arr[i];
               al.add(leader);
           }
       }
       Collections.reverse(al);
       return al;
    }
}
