class Solution {
    // public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    //     int count =0;

    //     for(int i =0; i<arr1.length ;i++){
    //         boolean check = true;
    //         for(int j =0; j<arr2.length ;j++){
    //             if(Math.abs(arr1[i]-arr2[j])<=d){
    //                 check =false;
    //                 break;

    //             }
                 
    //         }
    //         if(check)count++;
    //     }
        
    //     return count;
    // }
     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
      int count =0;
      int i =0; int j =0;
      while(i<arr1.length){
        if(Math.abs(arr1[i]-arr2[j])<=d){
            i++;
            j=0;
        }
        else{j++;};
      
        if(j==arr2.length){
            count++;
            i++;
            j=0;
        }
      }
      return count;
    }
}