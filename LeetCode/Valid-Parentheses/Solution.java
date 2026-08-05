1class Solution {
2    public boolean isValid(String s ){
3        char [] ch = new char[s.length()];
4        int top =0;
5
6        for(char c :s.toCharArray()){
7        switch(c){
8            case '(':
9                 ch[top++] =')';
10                 break;
11            case '[':
12                 ch[top++] =']';
13                 break;
14            case '{':
15                 ch[top++] ='}';
16                 break;
17            default:
18                   if(top==0 || ch[--top] !=c){
19                    return false;
20                   }
21        }
22        }
23
24            return top==0;
25        }
26    }
27    // public boolean isValid(String s) {
28
29    //     Stack<Character> st = new Stack();
30
31    //     for(char ch : s.toCharArray()){
32
33    //         if(ch =='(' || ch =='[' || ch =='{'){
34    //             st.push(ch);
35    //         }
36    //         else{
37    //              if(st.isEmpty()){
38    //                 return false;
39    //              }
40    //          if((ch==')' && st.peek()!='(') || 
41    //            (ch==']' && st.peek()!='[') || 
42    //            (ch=='}' && st.peek()!='{')) {
43    //             return false;   
44    //         }
45             
46    //         st.pop();
47    //         }
48
49            
50    //     }
51       
52    //     return st.isEmpty();    
53    // }
54// }