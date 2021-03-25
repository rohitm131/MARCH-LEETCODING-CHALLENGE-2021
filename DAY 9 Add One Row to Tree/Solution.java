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
    
    static void insert(int v, TreeNode root, int depth, int n) {
        if(root == null) {
            return;
        }
        if(depth == n-1) {
            TreeNode temp = root.left;
            root.left = new TreeNode(v);
            root.left.left = temp;
            temp = root.right;
            root.right = new TreeNode(v);
            root.right.right = temp;
        } else {
            insert(v, root.left, depth+1, n);
            insert(v, root.right, depth+1, n);
        }
    }
    
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        if(d == 1) {
            TreeNode n = new TreeNode(v);
            n.left = root;
            return n;
        }
        
        insert(v, root, 1, d);
        return root;
        
    }
}
