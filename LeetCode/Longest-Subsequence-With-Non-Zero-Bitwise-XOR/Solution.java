1class Solution {
2    public int longestSubsequence(int[] nums) {
3       
4        int xor =0;
5       int nonZero =0;
6        for(int i =0; i<nums.length ;i++){
7            xor = xor ^ nums[i];
8            if(nums[i]!=0){
9                nonZero++;
10            } 
11
12        }
13        if(xor!=0){
14            return nums.length;
15        }
16        if(nonZero!=0){
17            return nums.length-1;
18        }
19        return 0;
20        
21    }
22}