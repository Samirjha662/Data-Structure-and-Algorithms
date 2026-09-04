1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for(int i =0 ;i<nums.length ;i++){
6            if(map.containsKey(nums[i])) return true;
7            else {
8                map.put(nums[i],1);
9            }
10        }
11
12        return false;
13        
14    }
15}