1class Solution {
2   
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        int m = image.length;
5        int n = image[0].length;
6        
7        int originalColor = image[sr][sc];
8
9        if(originalColor ==color){
10            return image;
11        }
12    
13        Queue<int[]> queue = new ArrayDeque<>();
14        queue.offer(new int[]{sr,sc});
15
16        boolean [][] vis = new boolean[m][n];
17        vis[sr][sc] =true;
18
19        int [][] direction = {
20            {-1,0},
21            {1,0},
22            {0,-1},
23            {0,1}
24        };
25
26        while(!queue.isEmpty()){
27            int[] cell = queue.poll();
28            int r = cell[0];
29            int c = cell[1];
30
31            image[r][c] = color;
32
33            for(int[] dir :direction){
34                int nr = r + dir[0];
35                int nc = c + dir[1];
36
37                if(nr>=0 && nr<m && nc>=0 && nc< n && 
38                !vis[nr][nc] && image[nr][nc]==originalColor){
39                    vis[nr][nc] =true;
40                    queue.offer(new int[]{nr,nc});
41                }
42            }
43
44        }
45        return image;       
46    }
47}