//Convert Sorted Array to Binary Search Tree
//..............................................................



public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null)return null;
        return getBST(0,nums.length-1,nums);
    }
    
    public TreeNode getBST(int start,int end,int[] nums){
        if(start>end)return null;
        if(start==end){
            TreeNode tree = new TreeNode(nums[start]);
            tree.left = tree.right = null;
            return tree;
        }
        int index = (start + end)/2;
        TreeNode tree = new TreeNode(nums[index]);
        tree.left = getBST(start,index-1,nums);
        tree.right = getBST(index+1,end,nums);
        return tree;
        
    }
}