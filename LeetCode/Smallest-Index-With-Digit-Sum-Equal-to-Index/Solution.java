1class Solution {
2    public int smallestIndex(int[] nums) {
3
4        for(int i =0 ;i< nums.length ;i++){
5            int n = nums[i];
6            int sum =0;
7            while(n>0){
8                int rem = n % 10;
9                sum+= rem;
10                n =n/10;
11            }
12            if(sum ==i) return i;
13        }
14        
15        return -1;
16    }
17}