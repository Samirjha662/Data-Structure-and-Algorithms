class Solution {
    public boolean sumGame(String num) {
        int lsum =0;
        int l =0;
        int rsum =0;
        int r =0;
        for(int i =0; i<num.length()/2 ;i++){
            if(num.charAt(i)=='?') l++;
            else{
                lsum +=num.charAt(i)-'0';
            }
        }
        for(int i =num.length()/2; i<num.length() ;i++){
            if(num.charAt(i)=='?') r++;
            else{
                rsum +=num.charAt(i)-'0';
            }
        }

        // int dif = Math.abs(l-r);
        // int sumdif = Math.abs(rsum-lsum);

        return 9*(l-r) != 2*(rsum -lsum);

        
        
     
        
        
    }
}