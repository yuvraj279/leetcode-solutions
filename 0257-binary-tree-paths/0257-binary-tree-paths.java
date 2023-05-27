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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans =new ArrayList<>();
        String sub="";
        treePath(root,sub,ans);
        return ans;
    }
    void treePath(TreeNode root,String sub,List<String> ans){
        if(root== null) return;
        sub+=root.val;
        if(root.left==null && root.right==null) ans.add(sub);
        sub+="->";
        treePath(root.left,sub,ans);
        treePath(root.right,sub,ans);
    }
}