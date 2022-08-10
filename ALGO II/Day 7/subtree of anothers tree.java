class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        
        return (root.val==subRoot.val?check(root,subRoot):false) ||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        
    }
    public boolean check(TreeNode root,TreeNode subRoot)
    {
        if(subRoot==null && root==null)
            return true;
        else
            if(subRoot==null || root==null)
                return false;
        else
           if(root.val!=subRoot.val)
                return false;
        return check(root.left,subRoot.left) && check(root.right,subRoot.right);
    }
}