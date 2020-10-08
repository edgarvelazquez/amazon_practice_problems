//1315. Sum of Nodes with Even-Valued Grandparent
//https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/

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
    public int sumEvenGrandparent(TreeNode root) {      
        return helper(root,1,1);   //(root,0,0)  does not work
        
    }
    
    public int helper(TreeNode root, int gp, int GGP){
        
        if(root ==  null) return 0;
        int sum=0;
        if(GGP%2==0){ //This is the reason why we need to send 1, otherwise, it will count the first iterations of parent and grandparent which are 0%2=0 sum=6, 0%2=0 sum=7, 0%2=0 sum=8
            sum=root.val;
        } else{
            sum=0;
        }
        return helper(root.right,root.val,gp) + helper(root.left,root.val,gp)+sum;
    }
   
}

/*
Steps
1. Variable for layer
*/