package org.dhbw.datastructures;

/**
 * This is the simple implementation of a binary tree node. It does not have to be changed, but can be used.
 */
public class BinaryTreeNode {
    private BinaryTreeNode left;
    private int data;
    private BinaryTreeNode right;

    public BinaryTreeNode(BinaryTreeNode left, int data, BinaryTreeNode right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}