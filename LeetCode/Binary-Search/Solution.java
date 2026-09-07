1class Solution {
2    public int search(int[] nums, int target) {
3        int i = 0 ;
4        int j = nums.length -1;
5
6        while(i<=j){
7            int mid = (i + j)/2;
8
9            if(nums[mid]<target){
10                i =mid+1;
11            }
12           else if(nums[mid]>target){
13                j =mid-1;
14            }
15            else{
16                return mid;
17            }
18
19        }
20        return -1;
21        
22    }
23}