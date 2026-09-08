1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5        map.put(0,-1);
6        int prefixSum = 0;
7
8        for(int i =0; i< nums.length ;i++){
9
10            prefixSum+= nums[i];
11             int remainder = prefixSum%k;
12
13            if(map.containsKey(remainder)){
14                if( i-map.get(remainder) >=2){
15                     return true;
16                }
17               
18            }else{
19                  map.put(remainder, i);
20            }
21          
22
23            
24        }
25        return false;
26        
27    }
28}