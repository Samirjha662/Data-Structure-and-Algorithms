class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
       int i =1; 
       while(i<nums.length){
        int first = nums[i-1];
        int second = nums[i];
        if(second<10) first=first*10+second;
        else if(second<100) first=first*100+second;
        else if(second<1000) first=first*1000+second;
        else{ first= first*10000+second;};
        i+=2;
        min = Math.min(min, first);
       }

       return min;
        
    }
}