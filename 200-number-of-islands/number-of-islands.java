
class Solution {
   
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
         int [][] direction = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        
        boolean [][] vis = new boolean[m][n];
        int count=0;

        for(int i =0; i< m ;i++){
            for(int j =0; j< n ;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                   
                    vis[i][j]= true;
                    count++;
                    Queue<int []> q =  new LinkedList<>();
                     q.offer(new int[]{i,j});

                     while(!q.isEmpty()){
                         int [] position = q.poll();
                         int r = position[0];
                         int c = position[1];

                        for(int [] dir :direction){
                           int nr = r + dir[0];
                           int nc = c + dir[1];

                        if(nr>=0 && nr<m && nc>=0 && nc< n && grid[nr][nc]=='1' && !vis[nr][nc]){
                        vis[nr][nc]= true;
                        q.offer(new int[]{nr,nc});
                 
                   
                }
                

            }

        }
                }
                
            }
            
        }


       
     

   

    
        return count;
    }
}