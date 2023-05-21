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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] width=new int[1];
        dbt(root, width);
        return width[0];
    }
    
    int dbt(TreeNode root,int[] width){
        if(root==null) return 0;
        int left=dbt(root.left,width);
        int right=dbt(root.right,width);
        width[0]=Math.max(width[0],left+right);
        return Math.max(left,right)+1;
    }
}