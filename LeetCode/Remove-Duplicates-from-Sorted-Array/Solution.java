1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i =0;
4        for(int j = i+1 ;j<nums.length; j++){
5                if(nums[i]==nums[j]) continue;
6                if(nums[j-1]==nums[j]) continue;
7                else if(nums[i]!= nums[j]){
8                    nums[i+1] = nums[j];
9                    i++;
10                }
11
12        }
13        return i+1;
14        
15    }
16}