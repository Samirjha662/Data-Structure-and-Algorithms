class Solution {
    public boolean isPalindrome(String s){
        int i =0; 
        int j =s.length()-1;

     while(i<j)
     {
        while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
         while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
            return false;
        }
        i++; j--;
       
     }
      return true;
    }
    // public boolean isPalindrome(String s) {
    //     StringBuilder st = new StringBuilder();


    //   for(int i =0 ;i< s.length() ;i++){
    //     char ch = Character.toLowerCase(s.charAt(i));
    //     if(Character.isLetterOrDigit(ch)){
    //         st.append(ch);
    //     }
    //   }

    //   int i =0 ;
    //   int j =st.length()-1;
    //   while(i<j){
    //     if(st.charAt(i)!=st.charAt(j)){
    //         return false;
    //     }
    //     i++;
    //     j--;
    //   }
    //   return true;       
    // }


}