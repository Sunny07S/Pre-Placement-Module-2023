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
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    inOrderTrv(root, ans);
    return ans;
}
public void inOrderTrv(TreeNode root, List<Integer> ans){
    if(root == null){
        return;
    }
    inOrderTrv(root.left, ans);
    ans.add(root.val);
    inOrderTrv(root.right, ans);

}
}