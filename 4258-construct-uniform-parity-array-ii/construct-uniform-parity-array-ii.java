class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd= Integer.MAX_VALUE;
        int i =0;
        if(nums1.length<2)return true;
        while(i<nums1.length){
            if(nums1[i]%2!=0){
                odd = Math.min(odd,nums1[i]);
                
            }
            i++;
            
        }
        if(odd ==Integer.MAX_VALUE) return true;

        for(int num : nums1){
          if(num %2 ==0 && num <odd)
          return false;
            
        }
     
      return true;
    }
}