

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
    int height(TreeNode root){
        if(root==null)return 0;
        int left=height(root.left);
        if(left==-1)
            return -1;
        int right=height(root.right);
        if(right==-1)
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return 1+Math.max(left,right);

    }
    public static void main(String args[]){
        Solution s=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(s.isBalanced(root));
    }   
}