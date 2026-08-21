1class Solution {
2    public int[] twoSum(int[] numbers, int target){
3        int i =0; 
4        int j = numbers.length-1;
5        while(i<j){
6            if(numbers[i]+ numbers[j]==target){
7                return new int[]{i+1,j+1};
8            }
9            else if(numbers[i]+ numbers[j]>target){
10                j--;
11            }
12            else{
13                i++;
14            }
15        }      
16return new int[]{-1,-1};
17    }
18   
19    // public int[] twoSum(int[] numbers, int target) {
20    //     HashMap<Integer, Integer> map = new HashMap<>();
21
22    //     for(int i=0;i<numbers.length ;i++){
23    //         map.put(numbers[i],i);
24    //     }
25        
26    //     for(int i =0; i<numbers.length ;i++){
27    //         int rem = target - numbers[i];
28    //         if(map.containsKey(rem)){
29    //             return new int[]{i+1,map.get(rem)+1};
30    //         }
31    //     }
32
33    //     return new int[]{-1,-1};
34    // }
35}