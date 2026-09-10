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
20        Queue<TreeNode> q = new LinkedList<>();
21        q.offer(root);
22
23        while(!q.isEmpty()){
24            int size = q.size();
25            TreeNode tempRoot = q.poll();
26            
27            TreeNode temp = tempRoot.left;
28            tempRoot.left = tempRoot.right;
29            tempRoot.right = temp;
30
31            if(tempRoot.left != null){
32                q.offer(tempRoot.left);
33            }
34
35            if(tempRoot.right != null){
36                q.offer(tempRoot.right);
37            }
38        }
39
40        return root;
41    }
42}