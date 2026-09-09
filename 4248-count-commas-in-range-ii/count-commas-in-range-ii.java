class Solution {
    public long countCommas(long n) {

        if(n<1000) return 0;
        else if(n<1_000_000) return n-999;
        else if(n<1_000_000_000L) return  (2*(n-999999L) +(999999L-999L));
        else if(n<1_000_000_000_000L) return (3L*(n-999999999L) +2L*(999999999L-999999L) +(999999L-999L));
        else if(n<1_000_000_000_000_000L) return (4L*(n-999999999999L) +3L*(999999999999L-999999999L) +2L*(999999999L-999999L) +(999999L-999L));
        else return  (1L+ 4L*(n-999999999999L) +3L*(999999999999L-999999999L) +2L*(999999999L-999999L) +(999999L-999L)) ;



        
        
    }
}