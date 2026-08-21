class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length ;i++){
            map.put(numbers[i],i);
        }
        
        for(int i =0; i<numbers.length ;i++){
            int rem = target - numbers[i];
            if(map.containsKey(rem)){
                return new int[]{i+1,map.get(rem)+1};
            }
        }

        return new int[]{-1,-1};
    }
}