class Solution {
    public int largestRectangleArea(int[] heights){
        Stack<Integer> stack =new Stack();
        int  max = 0;

        for(int i =0 ;i<=heights.length ;i++){
            int currentHeight =(i==heights.length) ? 0: heights[i];

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width =i;
                }
                else {
                    width = i-stack.peek()-1;
                }

                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        return max;
    }
    // public int largestRectangleArea(int[] heights) {
    //     int max = 0;
        
    //      for(int i =0 ;i< heights.length ;i++){
    //        int x =heights[i];
    //         for( int j = i+1; j< heights.length ;j++){
                
    //             if(heights[i]<=heights[j]){
    //                 x+=heights[i];
    //             }
                
    //             else break;
              
    //         }
    //         for( int j =i-1; j>=0 ;j--){
    //             if(heights[j]>= heights[i]){
    //                 x+=heights[i];
    //             }
    //             else break;
    //         }

    //      max = Math.max(x,max);
             
    //      }

    //     return max;
    // }
}