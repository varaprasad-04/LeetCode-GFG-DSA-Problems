/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int[] average(TreeNode root,int sum,int c){
        if(root==null)
            return new int[]{sum,c};
        sum+=root.val;
        c++;
        int[] left=average(root.left,sum,c);
        int right[]=average(root.right,left[0],left[1]);

        return right;
    }
    public int averageOfSubtree(TreeNode root) {
        int c=0;
        Stack<TreeNode>s1=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode curr=s1.pop();
            int val=curr.val,sum=0,n=0;
            int arr[]=average(curr,sum,n);
            if(arr[0]/arr[1] ==val)
                c++;
            if(curr.left!=null) 
                s1.push(curr.left);
            if(curr.right!=null)
                s1.push(curr.right);
        }
        return c;
    }
}