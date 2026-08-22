class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0; 
        int prod = 1;
        int p =n;
        while(p>0){
            int rem = p %10;
            sum +=rem;
            prod*=rem;
            p=p/10;
        }

      return n%(sum+prod)==0;
        
    }
}