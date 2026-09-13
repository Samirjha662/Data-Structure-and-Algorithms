1class Solution {
2
3    public double myPow(double x, int n){
4        long power = n;
5
6        if(power <0){
7            x = 1/x;
8            power = -power;
9
10        }
11
12        return power(x,power);
13    }
14
15    private double power(double x, long n){
16        if(n==0){
17            return 1;
18        }
19
20        double half = power(x,n/2);
21        if(n%2 ==0){
22           
23            return half* half;
24        }
25        return half * half *x;
26    }
27    // public double myPow(double x, int n) {
28    //         long power =n;
29    //         if(power<0){
30    //             x=1/x;
31    //             power= -power;
32    //         }
33    //         double ans = 1;
34
35    //         while(power> 0){
36    //             if(power %2 ==1){
37    //                 ans *= x;
38    //             }
39    //             x*=x;
40    //             power /=2;
41
42    //         }
43
44
45    //         return ans;
46
47    // }
48}