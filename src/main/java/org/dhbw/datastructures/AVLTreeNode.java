package org.dhbw.datastructures;

/**
 * Extends a binary tree node to also hold a balance factor
 */
public class AVLTreeNode extends BinaryTreeNode {
    private int bf;

    public AVLTreeNode(BinaryTreeNode left, int data, BinaryTreeNode right) {
        super(left, data, right);
    }

    public int getBf() {
        return bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }
}
