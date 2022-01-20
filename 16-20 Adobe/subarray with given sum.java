// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

class Solution
{
   //Function to find a continuous sub-array which adds up to a given number.
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
   {
       int sum=0;
       int front=1;
       int rear=1;
       // Your code here
       for(int a=1;a<=n;a++){
           sum+=arr[a-1];
           if(sum==s){
               break;
           }
           if(sum>s){
               ++front;
               sum=0;
               rear=front;
               a=front-1;
           }else{
           ++rear;
           }
       }
       
  ArrayList<Integer> abc = new ArrayList<>();
 if (rear > n) {
  abc.add(-1);
 } else {
  abc.add(front);
  abc.add(rear);
 }
       return abc;
   }
} 
