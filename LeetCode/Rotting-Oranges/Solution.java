1class Solution {
2  
3    public int orangesRotting(int[][] grid) {
4        Queue<int[]> q = new LinkedList<>();
5        int fresh = 0;
6        int minutes = 0;
7        
8        int rows = grid.length;
9        int cols = grid[0].length;
10
11        for(int i =0; i< rows ;i++){
12            for(int j =0; j< cols ;j++){
13                if(grid[i][j]==2){
14                    q.offer(new int[]{i,j});
15                }
16                
17                if(grid[i][j]==1) fresh++;
18            }
19        }
20        int [][] directions = {
21            {0,-1},
22            {0,1},
23            {1,0},
24            {-1,0}
25        };
26        while(!q.isEmpty() && fresh>0){
27            int size = q.size();
28
29            for(int i =0 ;i<size ;i++){
30                int[] position = q.poll();
31                int r = position[0];
32                int c = position[1];
33
34                for(int [] dir :directions){
35                    int nr =r+ dir[0];
36                    int nc =c+ dir[1];
37
38                    if(nr<0 || nr>=rows || nc<0 || nc>=cols){
39                        continue;
40                    }
41
42                    if(grid[nr][nc]==1){
43                        grid[nr][nc]=2;
44                        fresh--;
45
46                        q.offer(new int[]{nr,nc});
47                    }
48                }
49
50            }
51            minutes++;
52
53        }
54        if(fresh> 0) return -1;
55        return minutes;
56    }
57}