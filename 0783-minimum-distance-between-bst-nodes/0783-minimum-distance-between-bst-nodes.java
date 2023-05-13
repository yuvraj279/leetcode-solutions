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
    public int minDiffInBST(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        traversal(root,ans);
        int i=0;
        int min=Integer.MAX_VALUE;
        
        while(!ans.isEmpty()&& i<ans.size()-1){
            int current =ans.get(i+1)-ans.get(i);
            if(current<min){
                min=current;
            }
            i++;
        }
        return min;
    }
    void traversal(TreeNode root, List<Integer> ans){
        if(root==null) return;
        traversal(root.left,ans);
        ans.add(root.val);
        traversal(root.right,ans);
    }
}