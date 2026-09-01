class Solution {
   
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        
        int originalColor = image[sr][sc];

        if(originalColor ==color){
            return image;
        }
    
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr,sc});

        boolean [][] vis = new boolean[m][n];
        vis[sr][sc] =true;

        int [][] direction = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];

            image[r][c] = color;

            for(int[] dir :direction){
                int nr = r + dir[0];
                int nc = c + dir[1];

                if(nr>=0 && nr<m && nc>=0 && nc< n && 
                !vis[nr][nc] && image[nr][nc]==originalColor){
                    vis[nr][nc] =true;
                    queue.offer(new int[]{nr,nc});
                }
            }

        }
        return image;       
    }
}