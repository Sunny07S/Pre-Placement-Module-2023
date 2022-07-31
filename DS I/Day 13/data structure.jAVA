class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        
        TreeNode curr = root;
        insertIntoBSTAux(root, val);
        return curr;
    }
    
    public void insertIntoBSTAux(TreeNode node, int val) {
        if(node!= null){
            if(node.val>val ){
                if(node.left == null){
                    TreeNode ans = new TreeNode(val);
                    node.left  = ans;
                }
                else{
                    insertIntoBSTAux(node.left,  val);
                }
            }
            else {
                if(node.right == null){
                    TreeNode ans = new TreeNode(val);
                    node.right  = ans;
                }
                else{
                    insertIntoBSTAux(node.right,  val);
                }  
            }
        }
    }
}