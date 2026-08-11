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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    // void invert(TreeNode root) {
    //     TreeNode leftNode = root.left;
    //     TreeNode rightNode = root.right;
    //     if(leftNode == null && rightNode == null) {
    //         return;
    //     }
    //     TreeNode temp = leftNode;
    //     leftNode = rightNode;
    //     rightNode = temp;
    //     invert(leftNode.left);
    //     invert(rightNode.right);
    // }

    // void swap(TreeNode leftNode, TreeNode rightNode) {
    //     if(leftNode == null) {
    //         leftNode = rightNode;
    //     }
    //     else if(rightNode == null) {
    //         rightNode = leftNode;
    //     }
    //     else {
    //         TreeNode temp = leftNode;
    //         leftNode = rightNode;
    //         rightNode = temp;
    //     }
    // }
}
