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
    static int maxDia;
    public int level(TreeNode root){
        if(root == null) return 0;

        int left = level(root.left);
        int right = level(root.right);

        int dia = left+right;
        maxDia = Math.max(maxDia,dia);

        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        level(root);

        return maxDia;
    }
}
