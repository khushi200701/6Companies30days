// https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1/

class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
          Queue<Node> q = new LinkedList<>();
           Node nextcurr;
          q.add(root);
          while(q.isEmpty() == false){
               nextcurr = null;
              int count = q.size();
              for(int i =0;i<count;i++){
                 Node curr = q.poll();
                 if( i == 0){
                     nextcurr = curr;
                 }
                 else{
                     nextcurr.nextRight = curr;
                     nextcurr = curr;
                 }
                 if(curr.left != null){
                     q.add(curr.left);
                 }
                  if(curr.right != null){
                     q.add(curr.right);
                 }
              }
          }
    }
}
