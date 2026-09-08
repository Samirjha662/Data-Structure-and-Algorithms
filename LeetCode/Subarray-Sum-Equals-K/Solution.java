1class Solution {
2     public int subarraySum(int[] nums, int k) {
3       HashMap<Integer,Integer> map = new HashMap<>();
4       map.put(0,1);
5
6
7       int prefixSum=0;
8       int cnt = 0;
9        
10        for(int i = 0 ;i< nums.length; i++){
11            prefixSum += nums[i];
12            
13            if(map.containsKey(prefixSum-k)){
14                cnt+= map.get(prefixSum-k);
15            }
16            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
17           
18        }
19       
20        return cnt;
21    }
22    // public int subarraySum(int[] nums, int k) {
23    //     int count =0;
24        
25    //     for(int i = 0 ;i< nums.length; i++){
26    //         int sum = nums[i];
27    //         if(sum ==k) count++;
28    //         for( int j = i+1; j< nums.length ;j++){
29    //            sum += nums[j];
30    //            if(sum== k) count++;
31    //         }
32    //     }
33    //     return count;
34    // }
35}