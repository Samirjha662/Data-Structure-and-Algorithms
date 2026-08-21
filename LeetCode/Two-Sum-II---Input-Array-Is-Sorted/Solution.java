1class Solution {
2   
3    public int[] twoSum(int[] numbers, int target) {
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for(int i=0;i<numbers.length ;i++){
7            map.put(numbers[i],i);
8        }
9        
10        for(int i =0; i<numbers.length ;i++){
11            int rem = target - numbers[i];
12            if(map.containsKey(rem)){
13                return new int[]{i+1,map.get(rem)+1};
14            }
15        }
16
17        return new int[]{-1,-1};
18    }
19}