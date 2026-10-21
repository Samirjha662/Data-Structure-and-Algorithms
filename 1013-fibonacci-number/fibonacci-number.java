class Solution {
//     private int fib(int n, int[] dp){
//         if(n<=1) return n;
//         if(dp[n]!=0) return dp[n];

//         return dp[n] =fib(n-1)+fib(n-2);

//     }
     
//     public int fib(int n) {
//         int[] dp = new int[n+1];
//         return fib(n,dp);
//     }


//tabulation
// public int fib(int n){
//      if(n<1) return n;
//     int[] dp = new int[n+1];
//     dp[0] =0;
//     dp[1] =1;

//     for(int i =2 ;i<=n ;i++){
//         dp[i] = dp[i-1] +dp[i-2];
//     }
   
//     return dp[n];
// }

// little space optimization

public int fib(int n){
    if(n<1) return n;
    int prev2 = 0;
    int prev =1;

    for(int i =2 ;i<=n ;i++){
        int curri = prev +prev2;
        prev2 =prev;
        prev = curri;
    }
    return prev;
}


}