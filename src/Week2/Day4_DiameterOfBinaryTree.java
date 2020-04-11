package Week2;

public class Day4_DiameterOfBinaryTree {
    public static void main(String[] args) {
        /*
        Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary
        tree is the length of the longest path between any two nodes in a tree. This path may or may not pass
        through the root.

        Example:
        Given a binary tree
                  1
                 / \
                2   3
               / \
              4   5
        Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

        Note: The length of path between two nodes is represented by the number of edges between them.
        */


    }

    private int maxLen = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        findLongestPath(root);
        return maxLen;
    }

    private int findLongestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLen = findLongestPath(root.left);
        int rightLen = findLongestPath(root.right);
        int pathLen = leftLen + rightLen;
        maxLen = Math.max(pathLen, maxLen);
        return Math.max(leftLen, rightLen) + 1;
    }


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }
}


