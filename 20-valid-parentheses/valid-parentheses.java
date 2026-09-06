class Solution {
    public boolean isValid(String s){
        Stack<Character> st = new Stack();
        int top=-1;

        for(int i =0; i< s.length() ;i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch =='{' || ch =='['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;

                if((ch ==')' && st.peek()!='(') || (ch =='}' && st.peek()!='{') ||(ch ==']' && st.peek()!='[')) return false;
                st.pop();
            }
        }


        return st.isEmpty();
    }}
































































































































    // public boolean isValid(String s ){
    //     char [] ch = new char[s.length()];
    //     int top =0;

    //     for(char c :s.toCharArray()){
    //     switch(c){
    //         case '(':
    //              ch[top++] =')';
    //              break;
    //         case '[':
    //              ch[top++] =']';
    //              break;
    //         case '{':
    //              ch[top++] ='}';
    //              break;
    //         default:
    //                if(top==0 || ch[--top] !=c){
    //                 return false;
    //                }
    //     }
    //     }

    //         return top==0;
    //     }
    // }
    // public boolean isValid(String s) {

    //     Stack<Character> st = new Stack();

    //     for(char ch : s.toCharArray()){

    //         if(ch =='(' || ch =='[' || ch =='{'){
    //             st.push(ch);
    //         }
    //         else{
    //              if(st.isEmpty()){
    //                 return false;
    //              }
    //          if((ch==')' && st.peek()!='(') || 
    //            (ch==']' && st.peek()!='[') || 
    //            (ch=='}' && st.peek()!='{')) {
    //             return false;   
    //         }
             
    //         st.pop();
    //         }

            
    //     }
       
    //     return st.isEmpty();    
    // }
// }