1class Solution {
2    public int reverseDegree(String s) {
3        int total =0;
4        int j =1;
5
6        for(int i = 0 ;i< s.length() ;i++){
7
8            int p = 26 - (int)(s.charAt(i)-'a');
9            total = total + (p*j);
10            j++;
11
12        }
13
14        return total;
15        
16    }
17}