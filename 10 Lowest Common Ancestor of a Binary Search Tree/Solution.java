class Solution {

    // T: O(n) worst case (list), O(log n) avg
    // S: O(n) worst case (list), O(log n) avg
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q); // on left of root
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q); // on right of root
        return root; // root is LCA otherwise

        // ITERATIE SOLUTION, achieves O(1) space!
        // while(root != null){
        // if(p.val < root.val && q.val < root.val) root = root.left; // on left of root
        // else if(p.val > root.val && q.val > root.val) root = root.right; // on right
        // of root
        // else return root;
        // }
        // return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

// If they’re both on one side, rec call there. Otherwise, root is LCA.
// (this is because the nodes are either on different sides, or one of the nodes
// is the root. We could cover those cases before the rec call, but no need
// here. Cleaner code :)
