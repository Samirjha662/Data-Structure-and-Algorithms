1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        boolean [] vis = new boolean[rooms.size()];
4        vis[0] =true;
5
6        boolean changed = true;
7
8        while(changed){
9            changed = false;
10
11            for(int i = 0 ;i<rooms.size();i++){
12                if(!vis[i]) continue;
13
14                for(int key : rooms.get(i)){
15                    if(!vis[key]){
16                        vis[key] =true;
17                        changed =true;
18                    }
19
20                }
21            }
22        }
23
24      
25
26        for(int i =0; i< vis.length ;i++){
27            if(!vis[i]) return false;
28        }
29        return true;
30    }
31
32}