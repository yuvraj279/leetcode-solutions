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
    public TreeNode sortedArrayToBST(int[] nums) {
        int s=0;
        int e=nums.length-1;
        return create(nums, s ,e);
    }
    TreeNode create(int[] nums, int s, int e){
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(nums,s,mid-1);
        root.right=create(nums, mid+1,e);
        return root;
    }
}