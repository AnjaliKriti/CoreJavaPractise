package org.example.service.collections;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeIsBST {

    // Helper method to perform in-order traversal and check for BST
    private static boolean isBSTUtil(TreeNode root, Integer prev) {
        if (root == null) {
            return true;
        }

        // Check the left subtree
        if (!isBSTUtil(root.left, prev)) {
            return false;
        }

        // Check the current node's value
        if (prev != null && root.val <= prev) {
            return false;
        }

        // Update the previous value
        prev = root.val;

        // Check the right subtree
        return isBSTUtil(root.right, prev);
    }

    // Main method to check if the given tree is a BST
    public static boolean isBST(TreeNode root) {
        // Use Integer instead of int to handle null values for the initial 'prev'
        Integer prev = null;
        return isBSTUtil(root, prev);
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a BST:
        //       4
        //      / \
        //     2   5
        //    / \
        //   1   3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // Check if the tree is a BST
        boolean isBST = isBST(root);

        System.out.println("Is the given tree a Binary Search Tree? " + isBST);
    }
}
