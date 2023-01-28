//Symmetric Tree
//.............................................................


class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root== null) return true;
   
        return  Symmetric(root.left,root.right);
  }

  public boolean Symmetric(TreeNode l,TreeNode r) {
      if (l== null || r == null){
          return (l==r);
      } 
 
      if(l.val!=r.val){
          return false;
      }
      return Symmetric(l.left,r.right) && Symmetric(l.right,r.left);

  }
}