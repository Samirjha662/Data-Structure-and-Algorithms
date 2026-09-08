1class Solution {
2    //  public int subarraySum(int[] nums, int k) {
3    //    HashMap<Integer,Integer> map = new HashMap<>();
4    //    int prefixSum=0;
5    //    int cnt = 0;
6        
7    //     for(int i = 0 ;i< nums.length; i++){
8    //         prefix+= nums[i];
9            
10    //         if(map.containsKey(k - prefixSum)){
11    //             cnt+= map.get(k-prefixSum);
12    //         }
13    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
14           
15    //     }
16       
17    //     return cnt;
18    // }
19    public int subarraySum(int[] nums, int k) {
20        int count =0;
21        
22        for(int i = 0 ;i< nums.length; i++){
23            int sum = nums[i];
24            if(sum ==k) count++;
25            for( int j = i+1; j< nums.length ;j++){
26               sum += nums[j];
27               if(sum== k) count++;
28            }
29        }
30        return count;
31    }
32}