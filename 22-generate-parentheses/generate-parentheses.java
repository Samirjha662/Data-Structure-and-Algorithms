class Solution {
    public void dp(int n, List<String> ls,StringBuilder sb, int open, int close){
        if(open ==n && close ==n){
            ls.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            dp(n,ls,sb,open+1,close);
            
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(close<open){
            sb.append(')');
             dp(n,ls,sb,open, close+1);
             
             sb.deleteCharAt(sb.length()-1);
        }
       

    }
   
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        dp(n,result,new StringBuilder(),0,0);
        return result;
       
        
    }
}