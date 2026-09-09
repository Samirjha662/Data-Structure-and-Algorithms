class Solution {
     public int lengthOfLongestSubstring(String s) {
       int i =0;
        int max=0;

        for(int j =0; j< s.length(); j++){
            for(int k =i ;k< j ;k++){
                if(s.charAt(k)==s.charAt(j)){
                    i = k+1;
                    break;
                }
            }
            int length = j-i +1;
            if(length>max) max = length;

        }
        
        return max;
        
    }
    // public int lengthOfLongestSubstring(String s) {
    //     HashSet<Character> map = new HashSet<>();
    //     int count =0;
    //     int i= 0;

    //     for(int j = 0 ;j< s.length() ;j++){
    //         char ch = s.charAt(j);
    //         while(map.contains(ch)){
    //              map.remove(s.charAt(i));
    //             i++; 
    //         }
    //         map.add(ch);
    //          count = Math.max(count,j-i +1);  
            
    //     }
    //     return count;
        
    // }
}