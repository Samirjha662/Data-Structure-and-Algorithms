class Solution {
    public int smallestNumber(int n, int t) {

        for(int i =n ;i<n +20 ;i++){
           String str = Integer.toString(i);
            int count =1;
           for(int j =0 ;j<str.length() ;j++){
                count *=str.charAt(j)-'0';
           }
          
            if(count % t ==0){
                return i;
            }
        }

        return -1;
        
    }
}