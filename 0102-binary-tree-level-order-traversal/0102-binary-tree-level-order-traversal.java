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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> ans=new ArrayList<>();
            int level=que.size();
            for(int i=0;i<level; i++){
                if(que.peek().left!=null) que.add(que.peek().left);
                if(que.peek().right!=null) que.add(que.peek().right);
                ans.add(que.poll().val);
            }
            result.add(ans);
        }
        return result;
    }
}