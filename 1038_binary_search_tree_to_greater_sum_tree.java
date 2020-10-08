//1038. Binary Search Tree to Greater Sum Tree
//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//
//SIMPLE DFS approach
class Solution {
 int sum = 0;
    public TreeNode bstToGst(TreeNode node) {
        if (node == null) return node;
        bstToGst(node.right);
        sum += node.val;
        node.val = sum;
        bstToGst(node.left);
        return node;
    }
}

//with helper function, but it is not necessary
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=0;
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }
    
    public void helper(TreeNode root) {
        if(root == null){
          return;  
        } 
        helper(root.right);
        //System.out.println("max is" +max);
        max+=root.val; 
        root.val=max;
        helper(root.left);
    }
}