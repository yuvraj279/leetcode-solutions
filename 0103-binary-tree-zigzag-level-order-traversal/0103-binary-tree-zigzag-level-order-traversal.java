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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        if(root== null) return ans;
        Queue<TreeNode> que= new LinkedList<>();
        int l=0;
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> sub=new ArrayList<>();
            int size=que.size();
            for(int i=0;i<size;i++){
                if(que.peek().left!=null) que.offer(que.peek().left);
                if(que.peek().right!=null) que.offer(que.peek().right);
                sub.add(que.poll().val);
            }
            if(l%2==1) Collections.reverse(sub);
            l++;
            ans.add(sub);
        }
        return ans;
    }
}