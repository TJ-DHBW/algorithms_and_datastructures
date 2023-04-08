package org.dhbw.datastructures;

public interface SimpleList {
    void add(int index, String element);

    String get(int index);

    String getFirst();

    String getLast();

    void set(int index, String element);

    String remove(int index);

    int size();
}
