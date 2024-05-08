
public class TreeNode {
	
	TreeNode root ;
	TreeNode left ;
	TreeNode right ;
	
	int val;

	public TreeNode(TreeNode root, TreeNode left, TreeNode right, int val) {
		 
		this.root = root;
		this.left = left;
		this.right = right;
		this.val = val;
	}
	

}

class Solution1 {
    public boolean isSymmetric(TreeNode root) {
    	
    	if ( root == null) return true;
    	
    	
    	return true;
        
    }
    
    public boolean isMirror(TreeNode left, TreeNode right)
    {
    	
    	if( left == null && right==null) return true;
    	
    	if( left == null || right==null) return false;
    	
    	if(left.val!=right.val) return false;
    	
    	return isMirror(left.left, right.right) && isMirror(right.right, left.left);
    }
}
