class Solution {
    public boolean checkString(String s) {
        // if(s.length()==1)return true;
        boolean x = true;

        int i =0; 
        while(s.charAt(i)!='b' && i<s.length()){
            if(i==s.length()-1) return true;
            i++;
        }
        while(i<s.length()){
            if(s.charAt(i)=='a'){
                x=false;
                return x;
            }
            i++;
        }


        return x;
        
    }
}