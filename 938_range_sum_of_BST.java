//https://leetcode.com/problems/range-sum-of-bst/submissions/
//938. Range Sum of BST

//Approach 1
//Non global variable
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
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        return helper(root, L, R);
    }
    
    public int helper(TreeNode root, int L, int R){
        int result=0;
        if(root == null) {
            return 0;
        }
        if(root.val>=L && root.val<=R){
            result=root.val;
        }
        return result + helper(root.left,L,R) + helper(root.right,L,R);
        
    }
}




//Approach 2
//Global variable approach

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
    public int rangeSumBST(TreeNode root, int L, int R) {
        helper(root, L, R);
        return max;
    }
    
    public void helper(TreeNode root, int L, int R){
        if(root == null) {
            return;
        }
        if(root.val>=L && root.val<=R){
            max+=root.val;
        }
        helper(root.left,L,R);
        helper(root.right,L,R);
    }
}