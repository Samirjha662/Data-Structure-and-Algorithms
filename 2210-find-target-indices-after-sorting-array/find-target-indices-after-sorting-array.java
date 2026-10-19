class Solution {
    // public List<Integer> targetIndices(int[] nums, int target) {

    //     Arrays.sort(nums);
    //     List<Integer> ls = new ArrayList<>();

    //     for(int i =0; i<nums.length ;i++){
    //         if(nums[i]==target) ls.add(i);
    //         if(nums[i]>target) break;

    //     }
    //     return ls;
        
    // }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        int count =0; int small =0;

        for(int i =0; i<nums.length ;i++){
            if(nums[i]<target)  small++;
            if(nums[i]==target) count++;

        }

        if(count==0) return ls;

        for(int i =0; i<count ;i++){
            ls.add(small++);

        }
        return ls;
        
    }
}