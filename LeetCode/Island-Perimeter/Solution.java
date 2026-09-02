1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int count =0;
6       Queue<int[]> queue = new ArrayDeque<>();
7       boolean [][] vis = new boolean[m][n];
8        outer:
9       for(int i =0; i< m ;i++){
10        for(int j =0; j<n ;j++){
11            if(grid[i][j] ==1){
12                queue.add(new int[]{i,j});
13                vis[i][j]=true;
14                break outer;
15               
16            }
17            
18
19        }
20       }
21       
22       int [][] direction = {
23         {-1,0},
24         {1,0},
25         {0,-1},
26         {0,1}
27       };
28
29       while(!queue.isEmpty()){
30        int [] cell = queue.poll();
31       int r = cell[0];
32       int c = cell[1];
33
34       count+=4;
35
36       for(int[] dir : direction){
37        int nr = r+ dir[0];
38        int nc = c+ dir[1];
39        if(nr>=0 && nr<m && nc>=0 && nc< n && 
40                !vis[nr][nc] && grid[nr][nc]==1){
41                    vis[nr][nc] =true;
42                    queue.offer(new int[]{nr,nc});
43                }
44
45        if(nr >= 0 && nr < m && nc >= 0 && nc < n &&
46           grid[nr][nc] == 1) {
47
48        count--;
49    }
50       }
51
52
53       }
54       return count;
55    }
56}