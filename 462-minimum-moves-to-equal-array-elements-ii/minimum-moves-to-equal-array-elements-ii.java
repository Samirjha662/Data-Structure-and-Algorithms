class Solution {
    public int minMoves2(int[] nums) {
        int mid =0;
        int left=0;
        int right =nums.length-1;
       
        Arrays.sort(nums);
        if(nums.length%2==0){
            mid=(right-left)/2+left;
            mid+=1;
        }
        else{
             mid=(right-left)/2+left;
        }
        int count=0;
        for(int i =0; i< nums.length ;i++){
            if(i==mid) continue;
            count+=Math.abs(nums[mid]-nums[i]);   
        }
        return count;
        
    }
}