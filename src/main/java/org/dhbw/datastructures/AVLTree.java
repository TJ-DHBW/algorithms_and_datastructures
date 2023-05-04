package org.dhbw.datastructures;

import org.dhbw.NotYetImplementedException;

public class AVLTree {
    private AVLTreeNode root;

    /**
     * Tries to rotate the given node to the left. If the given node does not have a right child, throws an exception.
     *
     * @param unbalancedNode The node that is unbalanced.
     */
    private void rotateLeft(AVLTreeNode unbalancedNode) {
        throw new NotYetImplementedException();
    }

    /**
     * Tries to rotate the given node to the right. If the given node does not have a right child, throws an exception.
     *
     * @param unbalancedNode The node that is unbalanced.
     */
    private void rotateRight(AVLTreeNode unbalancedNode) {
        throw new NotYetImplementedException();
    }

    /**
     * Searches through the tree, tries to find a given value and returns if it was successful.
     *
     * @param target The number to search for.
     * @return True, if tree contains target. False otherwise.
     */
    public boolean contains(int target) {
        throw new NotYetImplementedException();
    }

    /**
     * Tries to insert a given value into the tree, while maintaining the max height difference. If the value is already in the tree, it does nothing.
     *
     * @param valueToInsert The value to insert.
     */
    public void insert(int valueToInsert) {
        throw new NotYetImplementedException();
    }

    /**
     * Tries to remove a given value from the tree, while maintaining the max height difference. If the value is not in the tree, it does nothing.
     *
     * @param valueToRemove The value to remove.
     */
    public void remove(int valueToRemove) {
        throw new NotYetImplementedException();
    }
}
