1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3       
4        int[] nums2 = new int[nums.length];
5        int suffMin  = nums[nums.length-1];
6        nums2[nums.length-1] = suffMin;
7
8       for(int j = nums.length-2 ;j>=0 ;j--){
9            suffMin = Math.min(suffMin, nums[j]);
10            nums2[j]= suffMin;
11       }
12       int max = Integer.MIN_VALUE;
13
14       for(int i =0 ;i< nums2.length ;i++){
15        max = Math.max(max,nums[i]);
16        if(max - nums2[i]<=k) return i;
17       }
18        return -1;
19    }
20}