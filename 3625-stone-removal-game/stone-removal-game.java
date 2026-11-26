class Solution {
    public boolean canAliceWin(int n) {
       int p = n;

        for (int i = 10; i >= 1; i--) {

            if (p < i) {
                return i % 2 == 1 ? true : false;
            }

            p -= i;
        }

        return false;
        
    }
}