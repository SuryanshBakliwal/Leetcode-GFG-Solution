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
    int sum=0;
    
    int dfs(TreeNode root, boolean check){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return check==true ? root.val : 0;
        return dfs(root.left, true) + dfs(root.right, false);
    }
    
    
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = dfs(root, false);
        return sum;
    }
}