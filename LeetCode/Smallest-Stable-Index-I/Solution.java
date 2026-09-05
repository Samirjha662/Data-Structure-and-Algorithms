1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int max = Integer.MIN_VALUE;
4      
5        
6
7        for(int i =0 ;i< nums.length ;i++){
8            max = Math.max(max,nums[i]);
9            int min =Integer.MAX_VALUE;
10            
11
12            for(int j = i ;j< nums.length ;j++){
13                min = Math.min(nums[j],min);
14            }
15
16            if(max -min <= k) return i;
17            
18        }
19        
20
21        return -1;
22        
23    }
24}