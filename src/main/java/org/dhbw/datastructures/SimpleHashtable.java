package org.dhbw.datastructures;

import org.dhbw.NotYetImplementedException;

import java.util.LinkedList;
import java.util.List;

public class SimpleHashtable {
    private final List<KeyValuePair>[] hashtableArray;

    public SimpleHashtable(int size) {
        this.hashtableArray = (List<KeyValuePair>[]) new LinkedList[size];
        for (int i = 0; i < this.hashtableArray.length; i++) {
            this.hashtableArray[i] = new LinkedList<>();
        }
    }

    /**
     * Calculates the hash of a given key.
     *
     * @param key The key to hash.
     * @return The calculated hash.
     */
    private int hashOf(String key) {
        throw new NotYetImplementedException();
    }

    /**
     * Searches a given key in the hashtable and returns the corresponding value. If the key is not in the hashtable, return null.
     *
     * @param key The key to search for.
     * @return The value corresponding to the key, or null
     */
    public int get(String key) {
        throw new NotYetImplementedException();
    }

    /**
     * Inserts a key-value pair into the hashtable. If the key already exists, it overwrites the value.
     *
     * @param key   The key under which to store the value.
     * @param value The value to insert.
     */
    public void put(String key, int value) {
        throw new NotYetImplementedException();
    }

    /**
     * Tries to remove a key-value pair from the hashtable. If the key is not in the hashtable, it does nothing.
     *
     * @param key The key of the key-value pair to remove.
     */
    public void remove(String key) {
        throw new NotYetImplementedException();
    }

    /**
     * This class can be used to store key-value pairs
     */
    private static class KeyValuePair {
        private final String key;
        private final int value;

        public KeyValuePair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }
}
