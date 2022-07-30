class Solution {
    
    public static void solve(TreeNode root,List<List<Integer>> ans)
    {
        Queue<TreeNode> qu= new ArrayDeque<>();
        qu.add(root);
        
        while(qu.size()>0)
        {
            int count = qu.size();
            List<Integer> output = new ArrayList<>();
            for(int i=0; i<count; i++)
            {
                TreeNode temp = qu.remove();
                output.add(temp.val);
                
                if(temp.left != null)
                {
                    qu.add(temp.left);
                }
                
                if(temp.right != null)
                {
                    qu.add(temp.right);
                }
                
            }
            ans.add(output);
        }
        
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        
        solve(root,ans);
        return ans;
    }
}