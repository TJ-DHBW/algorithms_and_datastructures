package org.dhbw.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleListTest {
    private SimpleList simpleList;

    @BeforeEach
    void beforeEach() {
        // Choose which implementation to test against by commenting and uncommenting.
        // Btw. this is not how to do this properly.
        simpleList = new SimpleLinkedList();
        //simpleList = new SimpleDoublyLinkedList();
    }

    @Test
    @DisplayName("Can add single string")
    void addSingle() {
        simpleList.add(0, "element1");
    }

    @Test
    @DisplayName("Can add multiple strings")
    void addMultiple() {
        simpleList.add(0, "element1");
        simpleList.add(0, "element2");
    }

    @Test
    @DisplayName("Throws when trying to add with negative index")
    void addThrowsOnNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.add(-1, "element1"));
    }

    @Test
    @DisplayName("Throws when trying to add with index larger than size")
    void addThrowsOnLargeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.add(666, "element1"));
    }

    @Test
    @DisplayName("Can get string at the beginning")
    void getBeginning() {
        simpleList.add(0, "element1");

        String gotten = simpleList.get(0);

        assertEquals("element1", gotten);
    }

    @Test
    @DisplayName("Can get string not at the beginning")
    void getNotBeginning() {
        simpleList.add(0, "element1");
        simpleList.add(0, "element2");

        String gotten = simpleList.get(1);

        assertEquals("element1", gotten);
    }

    @Test
    @DisplayName("Throws when trying to get with negative index")
    void getThrowsOnNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.get(-1));
    }

    @Test
    @DisplayName("Throws when trying to get with index larger than size")
    void getThrowsOnLargeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.get(666));
    }

    @Test
    @DisplayName("Can get first value")
    void getFirstGetsFirstValue() {
        simpleList.add(0, "element1");
        simpleList.add(0, "element2");

        String first = simpleList.getFirst();

        assertEquals("element2", first);
    }

    @Test
    @DisplayName("getFirst throws, when list is empty")
    void getFirstThrowsOnEmpty() {
        assertThrows(Exception.class, () -> simpleList.getFirst());
    }

    @Test
    @DisplayName("Can get last value")
    void getLastGetsLastValue() {
        simpleList.add(0, "element1");
        simpleList.add(0, "element2");

        String last = simpleList.getLast();

        assertEquals("element1", last);
    }

    @Test
    @DisplayName("getLast throws, when list is empty")
    void getLastThrowsOnEmpty() {
        assertThrows(Exception.class, () -> simpleList.getLast());
    }

    @Test
    @DisplayName("Can set value of existing element")
    void setCanSet() {
        simpleList.add(0, "element1");

        simpleList.set(0, "modified");

        assertEquals("modified", simpleList.getFirst());
    }

    @Test
    @DisplayName("Throws when trying to set with negative index")
    void setThrowsOnNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.set(-1, "modified"));
    }

    @Test
    @DisplayName("Throws when trying to set with index larger than size")
    void setThrowsOnLargeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.set(666, "modified"));
    }

    @Test
    @DisplayName("Can remove element")
    void canRemove() {
        simpleList.add(0, "element1");
        simpleList.add(0, "element2");

        String removed = simpleList.remove(1);

        assertEquals("element1", removed);
    }

    @Test
    @DisplayName("Throws when trying to remove with negative index")
    void removeThrowsOnNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.remove(-1));
    }

    @Test
    @DisplayName("Throws when trying to remove with index larger than size")
    void removeThrowsOnLargeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> simpleList.remove(666));
    }

    @Test
    @DisplayName("Size starts at 0")
    void sizeInitial() {
        int initialSize = simpleList.size();

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Size increases with add")
    void sizeIncreases() {
        simpleList.add(0, "element1");
        int size1 = simpleList.size();

        simpleList.add(0, "element2");
        int size2 = simpleList.size();

        assertEquals(1, size1);
        assertEquals(2, size2);
    }

    @Test
    @DisplayName("Size decreases with remove")
    void sizeDecreases() {
        simpleList.add(0, "element1");
        simpleList.add(0, "element2");

        simpleList.remove(0);
        int size1 = simpleList.size();

        simpleList.remove(0);
        int size2 = simpleList.size();

        assertEquals(1, size1);
        assertEquals(0, size2);
    }
}