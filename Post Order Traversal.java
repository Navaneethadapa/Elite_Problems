//Post Order Traversal
//.................................................................




class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            return;  
        }
        postOrder(root.left,list); 
        postOrder(root.right,list); 
        list.add(root.val); 
    }
}