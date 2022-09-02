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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return null;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double level_sum = 0;
            for(int i=0;i<n;i++){
                TreeNode current = q.poll();
                level_sum += current.val;
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);
            }
            double average = level_sum / n;
            result.add(average);
        }
        return result;
    }
}