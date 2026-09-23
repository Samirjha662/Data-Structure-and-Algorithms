1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        long sum =0; 
4        long max =Integer.MIN_VALUE;
5        int i =0;
6        int j =0;
7     while(j<k){
8            sum+=nums[j];
9            j++;
10        }
11        max = Math.max(max, sum);
12
13       while(j<nums.length){
14        sum-=nums[i++];
15        sum+=nums[j++];
16        max=Math.max(max,sum);
17     
18       }
19
20
21        return (double)max/k;
22    }
23}