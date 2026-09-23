1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] arr = new int[nums1.length];
4        
5        for(int i =0; i<nums1.length ;i++){
6            int curr = nums1[i];
7            int j =0;
8            while(j<nums2.length && nums2[j]!=curr){
9                j++;
10            }
11            int max =Integer.MIN_VALUE;
12            while(j<nums2.length){
13                if(nums2[j]>curr){
14                    max = nums2[j];
15                    arr[i]=max;
16                    break;
17                    
18                }
19                j++;
20            }
21            if(max ==Integer.MIN_VALUE) arr[i]=-1;
22
23        }
24        return arr;
25        
26    }
27}