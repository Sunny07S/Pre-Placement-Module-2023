class Solution {
public:
	
	//checking if the left subtree and right subtree are mirror images or not
    bool isMirror(TreeNode* root1, TreeNode* root2) 
    {
        if(root1==NULL && root2==NULL) //if both trees are empty
            return true;
        if(root1==NULL || root2==NULL) //if one of the trees is empty
            return false;
        return root1->val==root2->val && isMirror(root1->left, root2->right) && isMirror(root1->right, root2->left);
    }
	
    bool isSymmetric(TreeNode* root) {
        return isMirror(root->left, root->right); //sending the left node and right node of the root to the isMirror function
    }
};
