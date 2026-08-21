class Solution {
    public int[] twoSum(int[] numbers, int target){
        int i =0; 
        int j = numbers.length-1;
        while(i<j){
            if(numbers[i]+ numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+ numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }      
return new int[]{-1,-1};
    }
   
    // public int[] twoSum(int[] numbers, int target) {
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for(int i=0;i<numbers.length ;i++){
    //         map.put(numbers[i],i);
    //     }
        
    //     for(int i =0; i<numbers.length ;i++){
    //         int rem = target - numbers[i];
    //         if(map.containsKey(rem)){
    //             return new int[]{i+1,map.get(rem)+1};
    //         }
    //     }

    //     return new int[]{-1,-1};
    // }
}