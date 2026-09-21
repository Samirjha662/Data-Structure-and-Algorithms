1class Solution {
2    private int rec2(int n){
3
4        if(n ==1) return 1;
5        int prev2=1;
6        int prev =2;
7
8        for(int i = 3 ;i<=n ;i++){
9            int curri = prev + prev2;
10            prev2 = prev;
11            prev = curri;
12        }
13        return prev;
14    }
15    private int rec(int n , int[] dp){
16        if(n==1 || n==0) return 1;
17        if(dp[n]!=-1) return dp[n];
18    
19
20
21        return dp[n] = rec(n-1,dp) + rec(n-2,dp);
22
23    }
24   
25    public int climbStairs(int n) {
26        // int [] dp = new int[n+1];
27        // for(int i =0 ;i<dp.length ;i++){
28        //     dp[i]=-1; 
29        // }
30        
31        
32        
33        // return rec(n,dp);
34        return rec2(n);
35        
36    }
37}