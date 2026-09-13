class Solution {

    public double myPow(double x, int n){
        long power = n;

        if(power <0){
            x = 1/x;
            power = -power;

        }

        return power(x,power);
    }

    private double power(double x, long n){
        if(n==0){
            return 1;
        }

        double half = power(x,n/2);
        if(n%2 ==0){
           
            return half* half;
        }
        return half * half *x;
    }
    // public double myPow(double x, int n) {
    //         long power =n;
    //         if(power<0){
    //             x=1/x;
    //             power= -power;
    //         }
    //         double ans = 1;

    //         while(power> 0){
    //             if(power %2 ==1){
    //                 ans *= x;
    //             }
    //             x*=x;
    //             power /=2;

    //         }


    //         return ans;

    // }
}