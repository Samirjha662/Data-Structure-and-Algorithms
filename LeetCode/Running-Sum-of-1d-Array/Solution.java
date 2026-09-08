1class Solution {
2    public int[] runningSum(int[] nums) {
3        int[] arr = new int[nums.length];
4        int sum = 0;
5
6        for(int i =0; i< nums.length ;i++){
7            sum += nums[i];
8            arr[i] = sum;
9
10        }
11        return arr;   
12    }
13}