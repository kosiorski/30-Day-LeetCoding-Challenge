package leetcode30daychallenge.week3;

public class Day6_ConstructBinarySearchTreeFromPreorderTraversal {
    public static void main(String[] args) {
        /*
        Return the root node of a binary search tree that matches the given preorder traversal.

        (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a
        value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder
        traversal displays the value of the node first, then traverses node.left, then traverses node.right.)


        Example 1:

        Input: [8,5,1,7,10,12]
        Output: [8,5,10,1,7,null,12]



        Note:

        1 <= preorder.length <= 100
        The values of preorder are distinct.
        */

        int[] input = {8, 5, 1, 7, 10, 12};
        TreeNode result = bstFromPreorder(input);


    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        return dfs(preorder, 0, preorder.length - 1);
    }

    private static TreeNode dfs(int[] preorder, int l, int r) {
        if (l > r) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[l]);
        int biggerIndex = l + 1;
        while (biggerIndex <= r && preorder[biggerIndex] < preorder[l]) {
            biggerIndex++;
        }

        root.left = dfs(preorder, l + 1, biggerIndex - 1);
        root.right = dfs(preorder, biggerIndex, r);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
