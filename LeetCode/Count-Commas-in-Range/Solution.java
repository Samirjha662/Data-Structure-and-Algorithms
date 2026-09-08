1class Solution {
2    public int countCommas(int n) {
3        if(n< 1000) return 0;
4        int count =0;
5
6        for( int i = 1000 ;i<=n ;i++){
7            count++;
8        }
9
10        return count;
11        
12    }
13}