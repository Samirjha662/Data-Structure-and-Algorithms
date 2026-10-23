class Solution {
    public int sortPermutation(int[] nums) {
        int ans=0;
        int j =0;

       for(int i = 0; i<nums.length ;i++){
            if(nums[i]!=i){
                ans = nums[i];
                j=i;
                break;

            }
       }
         for(int i = j+1; i<nums.length ;i++){
            if(nums[i]!=i){
                ans = ans & nums[i];
            }
       }

       if(ans ==0) return 0;

       return ans;    
        
    }
}