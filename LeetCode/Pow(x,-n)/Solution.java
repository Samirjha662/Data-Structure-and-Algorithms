1class Solution {
2    public double myPow(double x, int n) {
3            long power =n;
4            if(power<0){
5                x=1/x;
6                power= -power;
7            }
8            double ans = 1;
9
10            while(power> 0){
11                if(power %2 ==1){
12                    ans *= x;
13                }
14                x*=x;
15                power /=2;
16
17            }
18
19
20            return ans;
21
22    }
23}