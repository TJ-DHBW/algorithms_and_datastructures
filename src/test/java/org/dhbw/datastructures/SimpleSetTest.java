package org.dhbw.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleSetTest {
    private SimpleSet simpleSet;

    @BeforeEach
    void beforeEach() {
        simpleSet = new SimpleSet();
    }

    @Test
    @DisplayName("Complex test")
    void useCase() {
        assertEquals(0, simpleSet.size());

        assertTrue(simpleSet.add("element1"));
        assertTrue(simpleSet.add("element2"));
        assertEquals(2, simpleSet.size());

        assertFalse(simpleSet.contains("element3"));
        assertTrue(simpleSet.contains("element2"));
        assertEquals(2, simpleSet.size());

        assertTrue(simpleSet.remove("element2"));
        assertFalse(simpleSet.contains("element2"));
        assertEquals(1, simpleSet.size());

        assertFalse(simpleSet.add("element1"));
        assertTrue(simpleSet.add("element3"));
        assertEquals(2, simpleSet.size());

        assertFalse(simpleSet.remove("element2"));
        assertTrue(simpleSet.remove("element1"));
        assertTrue(simpleSet.remove("element3"));
        assertEquals(0, simpleSet.size());
    }

    @Test
    @DisplayName("Adding a new element returns true")
    void addingNewReturnsTrue() {
        boolean addSuccess = simpleSet.add("element1");

        assertTrue(addSuccess);
    }

    @Test
    @DisplayName("Adding an existing element returns false")
    void addingExistingReturnsFalse() {
        simpleSet.add("element1");

        boolean addTwiceSuccess = simpleSet.add("element1");

        assertFalse(addTwiceSuccess);
    }

    @Test
    @DisplayName("Removing an existing element returns true")
    void removingExistingReturnsTrue() {
        simpleSet.add("element1");

        boolean removeSuccess = simpleSet.remove("element1");

        assertTrue(removeSuccess);
    }

    @Test
    @DisplayName("Removing a non existing element returns false")
    void removingNonExistingReturnsFalse() {
        boolean removeSuccess = simpleSet.remove("element1");

        assertFalse(removeSuccess);
    }

    @Test
    @DisplayName("Removing the same existing element twice returns true, then false")
    void removingSameElementTwice() {
        simpleSet.add("element1");

        boolean removeSuccess1 = simpleSet.remove("element1");
        boolean removeSuccess2 = simpleSet.remove("element1");

        assertTrue(removeSuccess1);
        assertFalse(removeSuccess2);
    }

    @Test
    @DisplayName("Contains returns true for an existing element")
    void containsReturnsTrueForExisting() {
        simpleSet.add("element1");

        boolean containsResult = simpleSet.contains("element1");

        assertTrue(containsResult);
    }

    @Test
    @DisplayName("Contains returns false for a non existing element")
    void containsReturnsFalseForNonExisting() {
        boolean containsResult = simpleSet.contains("element1");

        assertFalse(containsResult);
    }

    @Test
    @DisplayName("Contains returns the same result for multiple calls")
    void containsReturnsSameResult() {
        simpleSet.add("element1");

        boolean containsResultExisting1 = simpleSet.contains("element1");
        boolean containsResultExisting2 = simpleSet.contains("element1");
        boolean containsResultNonExisting1 = simpleSet.contains("element2");
        boolean containsResultNonExisting2 = simpleSet.contains("element2");

        assertEquals(containsResultExisting1, containsResultExisting2);
        assertEquals(containsResultNonExisting1, containsResultNonExisting2);
    }

    @Test
    @DisplayName("Size starts at 0")
    void sizeInitial() {
        int initialSize = simpleSet.size();

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Size increases with adding new elements")
    void sizeCanIncrease() {
        simpleSet.add("element1");
        int size1 = simpleSet.size();

        simpleSet.add("element2");
        int size2 = simpleSet.size();

        assertEquals(1, size1);
        assertEquals(2, size2);
    }

    @Test
    @DisplayName("Size does not increase for adding existing elements")
    void sizeCanRejectIncrease() {
        simpleSet.add("element1");

        simpleSet.add("element1");
        int size = simpleSet.size();

        assertEquals(1, size);
    }

    @Test
    @DisplayName("Size decreases with removing elements")
    void sizeCanDecrease() {
        simpleSet.add("element1");
        simpleSet.add("element2");

        simpleSet.remove("element1");
        int size1 = simpleSet.size();

        simpleSet.remove("element2");
        int size2 = simpleSet.size();

        assertEquals(1, size1);
        assertEquals(0, size2);
    }

    @Test
    @DisplayName("Size does not decrease for removing non existing elements")
    void sizeCanRejectDecrease() {
        simpleSet.remove("element1");
        int size = simpleSet.size();

        assertEquals(0, size);
    }
}
