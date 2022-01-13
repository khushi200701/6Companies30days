// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1/

class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int top=0, down=r-1, left=0, right=c-1;
        int dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left; i<=right; i++){
                    al.add(matrix[top][i]);
                }
                top+=1;
            }
            else if(dir==1){
                for(int i=top; i<=down; i++){
                    al.add(matrix[i][right]);
                }
                right-=1;
            }
            else if(dir==2){
                for(int i=right; i>=left; i--){
                    al.add(matrix[down][i]);
                }
                down-=1;
            }
            else if(dir==3){
                for(int i=down; i>=top; i--){
                    al.add(matrix[i][left]);
                }
                left+=1;
            }
            dir = (dir+1) % 4;
        }
        return al;
    }
}
