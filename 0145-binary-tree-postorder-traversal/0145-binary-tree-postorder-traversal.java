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
    public List<Integer> postorderTraversal(TreeNode root) {
        // Iterative Solution using one Stack
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node= root;
        while(node!=null || !stack.isEmpty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.peek();
                    stack.pop();
                    result.add(temp.val);
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.peek();
                        stack.pop();
                        result.add(temp.val);
                    }
                }
                else{
                    node=temp;
                }
            }
        }
        return result;
    }
}