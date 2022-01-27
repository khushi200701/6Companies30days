class Solution{
    int sumTree(Node root){
        if(root==null) return 0;
        
         int leftSum= sumTree(root.left);
         int rightSum=sumTree(root.right);
         
         int x=root.data;
         int tsum=leftSum+rightSum;
         root.data=tsum;
         return tsum+x;
    }
        
    public void toSumTree(Node root){
        sumTree(root);
    }
}
