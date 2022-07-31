class Solution {
    public boolean isValidBST(TreeNode root) {
      return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root,long left,long right)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val<=left || root.val>=right)
        {
            return false;
        }
        return valid(root.left,left,root.val)&&valid(root.right,root.val,right);
    }
}