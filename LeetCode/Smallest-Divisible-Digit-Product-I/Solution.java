1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        for(int i =n ;i<n +20 ;i++){
5           String str = Integer.toString(i);
6            int count =1;
7           for(int j =0 ;j<str.length() ;j++){
8                count *=str.charAt(j)-'0';
9           }
10          
11            if(count % t ==0){
12                return i;
13            }
14        }
15
16        return -1;
17        
18    }
19}