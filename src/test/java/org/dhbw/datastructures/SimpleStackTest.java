package org.dhbw.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SimpleStackTest {
    private SimpleStack simpleStack;

    @BeforeEach
    void beforeEach() {
        simpleStack = new SimpleStack();
    }

    @Test
    @DisplayName("Complex test")
    void useCase() {
        assertEquals(0, simpleStack.size());

        simpleStack.push("element1");
        simpleStack.push("element2");
        assertEquals(2, simpleStack.size());

        assertEquals("element2", simpleStack.pop());
        assertEquals(1, simpleStack.size());

        simpleStack.push("element3");
        assertEquals(2, simpleStack.size());

        assertEquals("element3", simpleStack.pop());
        assertEquals("element1", simpleStack.pop());
        assertEquals(0, simpleStack.size());
    }

    @Test
    @DisplayName("Can push single string")
    void pushSingle() {
        simpleStack.push("element1");
    }

    @Test
    @DisplayName("Can push multiple strings")
    void pushMultiple() {
        simpleStack.push("element1");
        simpleStack.push("element2");
    }

    @Test
    @DisplayName("Can pop single string")
    void popSingle() {
        simpleStack.push("element1");

        String popped = simpleStack.pop();

        assertEquals("element1", popped);
    }

    @Test
    @DisplayName("Can pop multiple strings")
    void popMultiple() {
        simpleStack.push("element1");
        simpleStack.push("element2");

        String popped1 = simpleStack.pop();
        String popped2 = simpleStack.pop();

        assertEquals("element1", popped1);
        assertEquals("element2", popped2);
    }

    @Test
    @DisplayName("Pop on empty stack returns null")
    void popEmpty() {
        String popped = simpleStack.pop();

        assertNull(popped);
    }

    @Test
    @DisplayName("Size starts at 0")
    void sizeInitial() {
        int initialSize = simpleStack.size();

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Size increases with push")
    void sizeIncrease() {
        simpleStack.push("element1");
        int size1 = simpleStack.size();

        simpleStack.push("element2");
        int size2 = simpleStack.size();

        assertEquals(1, size1);
        assertEquals(2, size2);
    }

    @Test
    @DisplayName("Size decreases with pop")
    void sizeDecrease() {
        simpleStack.push("element1");
        simpleStack.push("element2");

        simpleStack.pop();
        int size1 = simpleStack.size();

        simpleStack.pop();
        int size2 = simpleStack.size();

        assertEquals(1, size1);
        assertEquals(0, size2);
    }
}