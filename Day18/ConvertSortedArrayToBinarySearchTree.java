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

/*problem : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/ */

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }
    private TreeNode bst(int[] nums,int left,int right){
        if(left>right) return null;

        int middle = (left+right)/2;
        TreeNode current = new TreeNode(nums[middle]);
        current.left = bst(nums,left,middle-1);
        current.right = bst(nums,middle+1,right);
        return current;
    }
}