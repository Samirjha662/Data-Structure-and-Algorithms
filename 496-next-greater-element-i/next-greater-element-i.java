class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        
        for(int i =0; i<nums1.length ;i++){
            int curr = nums1[i];
            int j =0;
            while(j<nums2.length && nums2[j]!=curr){
                j++;
            }
            int max =Integer.MIN_VALUE;
            while(j<nums2.length){
                if(nums2[j]>curr){
                    max = nums2[j];
                    arr[i]=max;
                    break;
                    
                }
                j++;
            }
            if(max ==Integer.MIN_VALUE) arr[i]=-1;

        }
        return arr;
        
    }
}