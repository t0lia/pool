package com.t0lia.design_pattern.III_behavioral.iterator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IteratorTest {
    @Test
    public void fixedStackTest() {
        Stack stack = new FixedStack();

        assertNull(stack.pop());

        assertTrue(stack.push("one"));
        assertTrue(stack.push("two"));
        assertTrue(stack.push("three"));
        assertTrue(stack.push("four"));
        assertFalse(stack.push("five"));

        assertEquals("four", stack.pop());
        assertEquals("three", stack.pop());
        assertEquals("two", stack.pop());
        assertEquals("one", stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void testIterator() {
        FixedStack stack = new FixedStack();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        FixedStack.Iterator i = stack.new Iterator();
        assertTrue(i.hasNext());
        assertEquals(i.next(), "one");
        assertTrue(i.hasNext());
        assertEquals(i.next(), "two");
        assertTrue(i.hasNext());
        assertEquals(i.next(), "three");
        assertFalse(i.hasNext());
    }

    @Test
    public void testConcurrentIterator() {
        FixedStack stack = new FixedStack();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        FixedStack.Iterator i1 = stack.new Iterator();
        FixedStack.Iterator i2 = stack.new Iterator();
        assertTrue(i1.hasNext());
        assertEquals(i1.next(), "one");

        assertTrue(i2.hasNext());
        assertEquals(i2.next(), "one");

        assertTrue(i1.hasNext());
        assertEquals(i1.next(), "two");

        assertTrue(i2.hasNext());
        assertEquals(i2.next(), "two");
    }
}