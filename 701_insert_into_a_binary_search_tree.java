//https://leetcode.com/problems/insert-into-a-binary-search-tree/
//701. Insert into a Binary Search Tree

//My own solution
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root== null) {
            root = new TreeNode(val);
            return root;
        }
        helper(root,val);
        return root;
        
    }
    public void  helper(TreeNode root, int val){
        if(root== null){
            return;
        } 
        if(val<root.val) {
            if(root.left==null){
                root.left=new TreeNode(val);;
            } else helper(root.left,val);
            
        } else {
             if(root.right==null){
                root.right= new TreeNode(val);;
            } else helper(root.right,val);
        } 
        
    }
}