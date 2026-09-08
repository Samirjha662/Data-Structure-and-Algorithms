1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count =0;
4        
5        for(int i = 0 ;i< nums.length; i++){
6            int sum = nums[i];
7            if(sum ==k) count++;
8            for( int j = i+1; j< nums.length ;j++){
9               sum += nums[j];
10               if(sum== k) count++;
11            }
12        }
13        return count;
14    }
15}