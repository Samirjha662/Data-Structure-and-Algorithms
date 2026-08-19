class Solution {
  
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;
        
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i =0; i< rows ;i++){
            for(int j =0; j< cols ;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                
                if(grid[i][j]==1) fresh++;
            }
        }
        int [][] directions = {
            {0,-1},
            {0,1},
            {1,0},
            {-1,0}
        };
        while(!q.isEmpty() && fresh>0){
            int size = q.size();

            for(int i =0 ;i<size ;i++){
                int[] position = q.poll();
                int r = position[0];
                int c = position[1];

                for(int [] dir :directions){
                    int nr =r+ dir[0];
                    int nc =c+ dir[1];

                    if(nr<0 || nr>=rows || nc<0 || nc>=cols){
                        continue;
                    }

                    if(grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;

                        q.offer(new int[]{nr,nc});
                    }
                }

            }
            minutes++;

        }
        if(fresh> 0) return -1;
        return minutes;
    }
}