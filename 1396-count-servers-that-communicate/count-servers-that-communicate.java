class Solution {
    public int countServers(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        
        int [] row = new int[m];
        int [] col = new int[n];

        for(int i =0; i<m ;i++){
            for(int j=0; j<n ;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }

            }
        }

        int totalServer = 0;

        for(int i = 0; i<m ;i++){
            for(int j =0; j<n ;j++){
                if(grid[i][j]==1 && (row[i]>1 || col[j]>1)) totalServer+=1;
            }
        }
        return totalServer;
    }
    // public int countServers(int[][] grid) {
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     int totalServer = 0;
    //     Queue<int[]> q =new ArrayDeque<>();
    //     boolean[][] vis = new boolean[m][n];
    
    //     for(int i =0; i<m ;i++){
    //         for(int j =0; j<n ;j++){
    //             if(grid[i][j]==1){
    //                 q.add(new int[]{i,j});
    //                 vis[i][j]=true;
    //             }
    //         }
    //     }
        
    //     //here you did mistake that you are checking only the adjacent sides not the complete row and columns
    //     int [][] direction = {
    //         {-1,0},
    //         {0,-1},
    //         {0,1},
    //         {1,0}
    //     };

    //     while(!q.isEmpty()){
    //         int[] position =q.poll();
    //         int row =position[0];
    //         int col =position[1];

    //         for(int[] dir : direction){
    //             int r =row + dir[0];
    //             int c =col + dir[1];

    //             if( r>=0 && r<m && c>=0 && c<n && !vis[r][c]){
    //                 if(grid[r][c]==1){
    //                     q.offer(new int[]{r,c});
    //                     vis[r][c]=true;
    //                     totalServer+=1;
    //                 }
    //             }


    //         }





    //     }
    //     return totalServer;
    // }
}