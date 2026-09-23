class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum =0; 
        long max =Integer.MIN_VALUE;
        int i =0;
        int j =0;
     while(j<k){
            sum+=nums[j];
            j++;
        }
        max = Math.max(max, sum);

       while(j<nums.length){
        sum-=nums[i++];
        sum+=nums[j++];
        max=Math.max(max,sum);
     
       }


        return (double)max/k;
    }
}