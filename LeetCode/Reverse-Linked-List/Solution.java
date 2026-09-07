1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        ListNode temp = head;
14         ListNode prev = null;
15
16        while(temp!= null){
17           ListNode next = temp.next;
18
19            temp.next = prev;
20            prev = temp;
21            temp = next;
22        }
23        return prev;
24    }
25}