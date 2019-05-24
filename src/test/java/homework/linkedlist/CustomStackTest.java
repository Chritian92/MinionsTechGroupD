package homework.linkedlist;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomStackTest {
    private CustomStack<Object> customStack;

    @BeforeMethod
    public void setUp() {
        customStack = new CustomStack<>();
    }

    @Test
    public void testPush() {
        customStack.push("A");
        customStack.push("B");
        assertEquals(customStack.peek().value, "B");
    }

    @Test
    public void testPop() {
        customStack.push("A");
        customStack.push("M");
        customStack.push("R");
        assertEquals(customStack.peek().value, "R");
    }

    @Test
    public void testPeek() {
        customStack.push("R");
        customStack.push("E");
        customStack.push("D");

        assertEquals(customStack.peek().value, "D");
        customStack.pop();
        assertEquals(customStack.peek().value, "E");
    }
}