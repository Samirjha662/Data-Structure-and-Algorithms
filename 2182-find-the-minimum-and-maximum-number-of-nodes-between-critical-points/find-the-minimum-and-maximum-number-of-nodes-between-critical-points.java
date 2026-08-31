/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};

        if(head==null || head.next ==null || head.next.next ==null){
            return ans;
        }
        ListNode prev = head;
        ListNode curr =head.next;

        int position =1;
        
         int first = -1;
         int last =-1;

         int min = Integer.MAX_VALUE;
         int max = -1;

        while(curr.next !=null){
           
           ListNode next = curr.next;

           boolean critical = (curr.val > prev.val && curr.val >next.val) || (curr.val <prev.val && curr.val <next.val);

           if(critical){

            if(first ==-1){
                first =position;
            }

            else
            {
                int distance = position -last;
                min =Math.min(min,distance);
            }
            last = position;

            max =last- first;
           }
           prev =curr;
           curr= next;
           position++;    
        }


          if (first == last) {
            return ans;
        }

        ans[0] = min;
        ans[1] = max;

        return ans;
        
    }
}