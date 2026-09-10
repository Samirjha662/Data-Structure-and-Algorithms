1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode invertTree(TreeNode root) {
18        if(root ==null) return root;
19        
20        TreeNode l = invertTree(root.left);
21        TreeNode r = invertTree(root.right);
22
23        TreeNode temp = root.left;
24        root.left = root.right;
25        root.right = temp;
26
27       
28
29        return root;
30    }
31}