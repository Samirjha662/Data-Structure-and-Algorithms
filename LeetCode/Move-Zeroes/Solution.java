1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i =0; 
4        int j =0;
5
6        while(j< nums.length){
7            if(nums[j]!=0){
8                int temp = nums[j];
9                nums[j] = nums[i];
10                nums[i] = temp;
11                i++;
12            }
13            j++;
14        }
15      
16         
17        
18    }
19}