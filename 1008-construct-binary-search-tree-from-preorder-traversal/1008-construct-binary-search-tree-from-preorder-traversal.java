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
    public TreeNode bstFromPreorder(int[] preorder) {
         TreeNode root = new TreeNode(preorder[0]);

         // for(int i=1; i<preorder.length; i++){
         //     TreeNode temp = root;
         //     while(true){
         //         if(preorder[i] < temp.val){
         //             if(temp.left != null && temp.val > preorder[i]){
         //                 temp = temp.left;
         //             }
         //             else{
         //                 temp.left = new TreeNode(preorder[i]);
         //                 break;
         //             }
         //         }
         //         if(preorder[i] > temp.val){
         //             if(temp.right != null && temp.val < preorder[i]){
         //                 temp = temp.right;
         //             }
         //             else{
         //                 temp.right = new TreeNode(preorder[i]);
         //                 break;
         //             }
         //         }
         //     }
         // }
        
        for(int i=1; i<preorder.length;i++){
            helperCreate(root, preorder[i]);
        }
        return root;
    }
    
    public void helperCreate(TreeNode root, int value){
        TreeNode temp = root;
      
        if(value < temp.val){
            if(temp.left != null){
                helperCreate(temp.left, value);
            }
            else{
                temp.left = new TreeNode(value);
            }
        }
        if(value > temp.val){
            if(temp.right != null && temp.val < value){
                helperCreate(temp.right, value);
            }
            else{
                temp.right = new TreeNode(value);
            }
        }
    }
    
}