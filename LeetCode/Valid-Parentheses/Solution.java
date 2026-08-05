1class Solution {
2    public boolean isValid(String s) {
3
4        Stack<Character> st = new Stack();
5
6        for(char ch : s.toCharArray()){
7
8            if(ch =='(' || ch =='[' || ch =='{'){
9                st.push(ch);
10            }
11            else{
12                 if(st.isEmpty()){
13                    return false;
14                 }
15             if((ch==')' && st.peek()!='(') || 
16               (ch==']' && st.peek()!='[') || 
17               (ch=='}' && st.peek()!='{')) {
18                return false;   
19            }
20             
21            st.pop();
22            }
23
24            
25        }
26       
27        return st.isEmpty();    
28    }
29}