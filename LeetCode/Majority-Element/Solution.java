1class Solution {
2    public int majorityElement(int[] nums) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for(int i =0 ;i<nums.length ;i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8        }
9
10        return map.entrySet()
11        .stream()
12        .filter(entry -> entry.getValue()> nums.length/2)
13        .map(entry -> entry.getKey())
14        .findFirst()
15        .orElse(-1);
16      
17    }
18}