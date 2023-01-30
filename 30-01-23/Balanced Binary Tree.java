#Balanced Binary Tree
#....................................................


class Solution {
    public boolean isBalanced(TreeNode root) {   
    Queue<TreeNode> q = new LinkedList<>();    
    if(root == null)
    {
        return true;
    }   
    q.add(root);   
    while(!q.isEmpty())
    {
        TreeNode current = q.poll();
        int l=0;
        int r=0;
        if(current.left!=null)
        {
             l = height(current.left);
            q.add(current.left);
        }
        if(current.right!=null)
        {
            r = height(current.right);
            q.add(current.right);
        }       
        if(Math.abs(l-r)>1)
        {
            return false;
        }        
    }
    return true;    
}

public int height(TreeNode node)
{
    if(node == null)
    {
        return 0;
    }
    return 1+ Math.max(height(node.left),height(node.right));
}
}