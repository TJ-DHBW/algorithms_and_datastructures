package org.dhbw.algorithms;

public interface SearchStrategy {
    /**
     * Searches a target value in an array. If the target value is not contained in the array, returns -1.
     *
     * @param arrayToSearchIn The array in which to search. Must be sorted.
     * @param target          The target value to search for.
     * @return The index of the target element or -1.
     */
    int search(int[] arrayToSearchIn, int target);
}
