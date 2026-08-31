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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int[] ans = {-1,-1};
14
15        if(head==null || head.next ==null || head.next.next ==null){
16            return ans;
17        }
18        ListNode prev = head;
19        ListNode curr =head.next;
20
21        int position =1;
22        
23         int first = -1;
24         int last =-1;
25
26         int min = Integer.MAX_VALUE;
27         int max = -1;
28
29        while(curr.next !=null){
30           
31           ListNode next = curr.next;
32
33           boolean critical = (curr.val > prev.val && curr.val >next.val) || (curr.val <prev.val && curr.val <next.val);
34
35           if(critical){
36
37            if(first ==-1){
38                first =position;
39            }
40
41            else
42            {
43                int distance = position -last;
44                min =Math.min(min,distance);
45            }
46            last = position;
47
48            max =last- first;
49           }
50           prev =curr;
51           curr= next;
52           position++;    
53        }
54
55
56          if (first == last) {
57            return ans;
58        }
59
60        ans[0] = min;
61        ans[1] = max;
62
63        return ans;
64        
65    }
66}