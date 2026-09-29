class Solution {
    Boolean [][][] dp;

    private boolean hasValidPath1(char[][] grid,int row,int col,int balance){
        if(grid[row][col]=='(') balance++;

        if(grid[row][col]==')') balance--;

        if(balance<0) return false;
    


        if(row==grid.length-1 && col==grid[0].length-1){
              return balance==0;
        }

        if(dp[row][col][balance]!=null){
            return dp[row][col][balance];
        }

        boolean down = false;
        boolean right = false;

        if(row<grid.length-1){
             down = hasValidPath1(grid,row+1,col,balance);}

        if(col<grid[0].length-1){
             right = hasValidPath1(grid,row,col+1,balance);
        }
        return dp[row][col][balance] = down || right;
    }
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if((m+n-1)%2 != 0) return false;
        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') 
        {
        return false;
       }
       dp = new Boolean[m][n][m+n];

        return hasValidPath1(grid,0,0,0);

        
    }
}