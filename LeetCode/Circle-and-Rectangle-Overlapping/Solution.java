1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3        
4        int closestX = Math.max(x1,Math.min(x2,xCenter));
5        int closestY = Math.max(y1,Math.min(y2,yCenter));
6
7        int distanceX =xCenter -closestX;
8        int distanceY =yCenter -closestY;
9
10        int disSquare = (distanceX * distanceX) + (distanceY * distanceY);
11
12        if(disSquare<=radius*radius) return true;
13
14
15        return false;
16        
17        
18    }
19}