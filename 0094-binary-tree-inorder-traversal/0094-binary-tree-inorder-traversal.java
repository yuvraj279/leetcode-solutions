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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Iterative Solution
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node =root;
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }
            else{
                if(stack.isEmpty()) break;
                node= stack.pop();
                result.add(node.val);
                node =node.right;
            }
        }
        return result;
    }
}