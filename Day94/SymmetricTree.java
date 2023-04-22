/**problem : https://leetcode.com/problems/symmetric-tree/description
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }
    boolean helper(TreeNode left, TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        return (left.val==right.val) && helper(left.left, right.right) && helper(left.right, right.left);
    }
}