1class Solution {
2    public boolean isPalindrome(String s){
3        int i =0; 
4        int j =s.length()-1;
5
6     while(i<j)
7     {
8        while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
9            i++;
10        }
11         while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
12            j--;
13        }
14        if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
15            return false;
16        }
17        i++; j--;
18       
19     }
20      return true;
21    }
22    // public boolean isPalindrome(String s) {
23    //     StringBuilder st = new StringBuilder();
24
25
26    //   for(int i =0 ;i< s.length() ;i++){
27    //     char ch = Character.toLowerCase(s.charAt(i));
28    //     if(Character.isLetterOrDigit(ch)){
29    //         st.append(ch);
30    //     }
31    //   }
32
33    //   int i =0 ;
34    //   int j =st.length()-1;
35    //   while(i<j){
36    //     if(st.charAt(i)!=st.charAt(j)){
37    //         return false;
38    //     }
39    //     i++;
40    //     j--;
41    //   }
42    //   return true;       
43    // }
44
45
46}