1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        List<List<Integer>> outer = new ArrayList<>();
5     
6        Arrays.sort(nums);
7
8        for(int i = 0 ;i< nums.length -2 ;i++){
9            
10            if(i>0 && nums[i]==nums[i-1]) continue;
11        
12        int j =i+1;
13        int k = nums.length -1;
14
15        while(j<k){
16            if(nums[i]+nums[j]+nums[k]==0) {
17                List<Integer> inner = new ArrayList<>();
18                inner.add(nums[i]);
19                inner.add(nums[j]);
20                inner.add(nums[k]);
21                outer.add(inner);
22                
23            while(j<k && nums[j]==nums[j+1]) j++;
24            while(j<k && nums[k] ==nums[k-1]) k--;
25            
26           
27            j++;
28            k--;
29            
30            }
31            else if(nums[i]+nums[j]+nums[k]>0){
32                k--;
33            }
34            else{
35                j++;
36            }
37            
38        }
39        }
40        
41
42       return outer;
43    }
44}