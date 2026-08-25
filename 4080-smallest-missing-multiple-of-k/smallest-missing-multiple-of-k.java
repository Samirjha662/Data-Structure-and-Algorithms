class Solution {
     public int missingMultiple(int[] nums, int k) {
        for(int multiple=k;;multiple+=k){
            boolean found=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==multiple){
                    found=true;
                    break;
                }
            }
            if(!found){
            return multiple;
            }
        }
        
    }
    // public int missingMultiple(int[] nums, int k) {
    //     HashMap<Integer ,Integer> map = new HashMap<>();
    //     int max = 0;

    //     for(int i =0; i<nums.length ;i++){
    //         map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    //          max = Math.max(nums[i],max);
    //     }
      

    //     for(int i =1; i<=max ;i++){
    //          int ans = k *i;
    //          if(map.containsKey(ans)){
    //             continue;
    //          }else return ans;

    //     }
    //     return max +k;
        
    // }
}