class Solution {
     public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);


       int prefixSum=0;
       int cnt = 0;
        
        for(int i = 0 ;i< nums.length; i++){
            prefixSum += nums[i];
            
            if(map.containsKey(prefixSum-k)){
                cnt+= map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
           
        }
       
        return cnt;
    }
    // public int subarraySum(int[] nums, int k) {
    //     int count =0;
        
    //     for(int i = 0 ;i< nums.length; i++){
    //         int sum = nums[i];
    //         if(sum ==k) count++;
    //         for( int j = i+1; j< nums.length ;j++){
    //            sum += nums[j];
    //            if(sum== k) count++;
    //         }
    //     }
    //     return count;
    // }
}