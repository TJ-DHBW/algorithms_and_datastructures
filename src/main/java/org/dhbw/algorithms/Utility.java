package org.dhbw.algorithms;

public class Utility {
    /**
     * This is a utility function to swap the position of two elements in an array by their index. Can be used with: Utility.swap()
     *
     * @param array  The array to swap the elements in.
     * @param index1 Index of the first element to swap.
     * @param index2 Index of the second element to swap.
     */
    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
