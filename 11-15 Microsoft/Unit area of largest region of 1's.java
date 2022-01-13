// https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1/

class Solution
{
    public int findMaxArea(int[][] grid)
   {
       int result=0;
       for(int i=0;i<grid.length;i++) {
           for(int j=0;j<grid[0].length;j++) {
               if(grid[i][j] == 1) {
                   int num = search(i,j,grid);
                   result = result > num ? result : num;
               }
           }
       }
       return result;
   }
   public int search(int i,int j, int[][]grid) {
       
       if(i < 0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 ) 
           return 0;
       
       grid[i][j] = 0;
       int sum = 0;
       sum += search(i+1,j,grid);
       sum += search(i,j+1,grid);
       sum += search(i,j-1,grid);
       sum += search(i-1,j,grid);
       
       sum += search(i+1,j+1,grid);
       sum += search(i-1,j-1,grid);
       sum += search(i+1,j-1,grid);
       sum += search(i-1,j+1,grid);
       return sum + 1;
   }
}
