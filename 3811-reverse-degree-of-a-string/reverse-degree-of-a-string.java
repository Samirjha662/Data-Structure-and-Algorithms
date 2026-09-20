class Solution {
    public int reverseDegree(String s) {
        int total =0;
        int j =1;

        for(int i = 0 ;i< s.length() ;i++){

            int p = 26 - (int)(s.charAt(i)-'a');
            total = total + (p*j);
            j++;

        }

        return total;
        
    }
}