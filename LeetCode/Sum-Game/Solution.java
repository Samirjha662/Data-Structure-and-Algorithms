1class Solution {
2    public boolean sumGame(String num) {
3        int lsum =0;
4        int l =0;
5        int rsum =0;
6        int r =0;
7        for(int i =0; i<num.length()/2 ;i++){
8            if(num.charAt(i)=='?') l++;
9            else{
10                lsum +=num.charAt(i)-'0';
11            }
12        }
13        for(int i =num.length()/2; i<num.length() ;i++){
14            if(num.charAt(i)=='?') r++;
15            else{
16                rsum +=num.charAt(i)-'0';
17            }
18        }
19
20        // int dif = Math.abs(l-r);
21        // int sumdif = Math.abs(rsum-lsum);
22
23        return 9*(l-r) != 2*(rsum -lsum);
24
25        
26        
27     
28        
29        
30    }
31}