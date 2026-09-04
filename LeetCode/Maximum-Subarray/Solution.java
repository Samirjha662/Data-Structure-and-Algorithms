1class Solution {
2    public int maxSubArray(int[] nums) {
3       
4        int globalSum =nums[0];
5         int currentSum =nums[0];
6
7        for(int i =1; i< nums.length ;i++){
8            currentSum = Math.max(nums[i], currentSum + nums[i]);
9            globalSum =Math.max(currentSum, globalSum);
10        }
11
12        return globalSum;
13        
14    }
15}