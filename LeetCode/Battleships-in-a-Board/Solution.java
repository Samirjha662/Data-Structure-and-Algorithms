1class Solution {
2   
3    public int countBattleships(char[][] board){
4        int r = board.length;
5        int c= board[0].length;
6        int count =0; 
7        for(int i =0; i< r ;i++){
8            for(int j = 0; j<c ;j++){
9               if(board[i][j]=='.') continue;
10
11               if(i>0 && board[i-1][j]=='X') continue;
12
13               if(j>0 && board[i][j-1]=='X') continue;
14                count++;
15            
16            }
17        }
18        return count;
19    }
20   
21}