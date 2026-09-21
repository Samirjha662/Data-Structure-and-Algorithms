class Solution {
    private int rec2(int n){

        if(n ==1) return 1;
        int prev2=1;
        int prev =2;

        for(int i = 3 ;i<=n ;i++){
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
    private int rec(int n , int[] dp){
        if(n==1 || n==0) return 1;
        if(dp[n]!=-1) return dp[n];
    


        return dp[n] = rec(n-1,dp) + rec(n-2,dp);

    }
   
    public int climbStairs(int n) {
        // int [] dp = new int[n+1];
        // for(int i =0 ;i<dp.length ;i++){
        //     dp[i]=-1; 
        // }
        
        
        
        // return rec(n,dp);
        return rec2(n);
        
    }
}