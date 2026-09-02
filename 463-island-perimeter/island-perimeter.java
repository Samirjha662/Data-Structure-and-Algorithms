class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
       Queue<int[]> queue = new ArrayDeque<>();
       boolean [][] vis = new boolean[m][n];
        outer:
       for(int i =0; i< m ;i++){
        for(int j =0; j<n ;j++){
            if(grid[i][j] ==1){
                queue.add(new int[]{i,j});
                vis[i][j]=true;
                break outer;
               
            }
            

        }
       }
       
       int [][] direction = {
         {-1,0},
         {1,0},
         {0,-1},
         {0,1}
       };

       while(!queue.isEmpty()){
        int [] cell = queue.poll();
       int r = cell[0];
       int c = cell[1];

       count+=4;

       for(int[] dir : direction){
        int nr = r+ dir[0];
        int nc = c+ dir[1];
        if(nr>=0 && nr<m && nc>=0 && nc< n && 
                !vis[nr][nc] && grid[nr][nc]==1){
                    vis[nr][nc] =true;
                    queue.offer(new int[]{nr,nc});
                }

        if(nr >= 0 && nr < m && nc >= 0 && nc < n &&
           grid[nr][nc] == 1) {

        count--;
    }
       }


       }
       return count;
    }
}