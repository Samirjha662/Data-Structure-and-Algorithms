1class Solution {
2    private int rec(int n , int[] dp){
3        if(n==1 || n==0) return 1;
4        if(dp[n]!=-1) return dp[n];
5
6
7        return dp[n] = rec(n-1,dp) + rec(n-2,dp);
8
9    }
10   
11    public int climbStairs(int n) {
12        int [] dp = new int[n+1];
13        for(int i =0 ;i<dp.length ;i++){
14            dp[i]=-1;
15        }
16        
17        
18        
19        return rec(n,dp);
20        
21    }
22}