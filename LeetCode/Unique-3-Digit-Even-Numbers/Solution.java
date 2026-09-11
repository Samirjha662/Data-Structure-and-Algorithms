1class Solution {
2    public int totalNumbers(int[] digits) {
3        HashSet<Integer> set = new HashSet();
4      
5        
6
7        for(int i =0 ;i< digits.length ;i++)
8        {
9            if(digits[i]==0){
10                   continue;
11                }
12
13            for(int j =0; j<digits.length ;j++)
14            {
15                if(i==j) continue;
16
17                for(int k =0; k<digits.length ;k++)
18                {
19                    if(k==i  || k==j) continue;
20
21                    if(digits[k] %2 !=0) continue;
22
23                    int num = digits[i]*100 + digits[j]*10+ digits[k];
24
25                    set.add(num);
26                }
27
28            }
29        } 
30        
31        return set.size();
32    }
33}