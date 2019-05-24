package homework.linkedlist;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomQueueTest {
    private CustomQueue<Object> customQueue;


    @BeforeMethod
    public void setUp() {
        customQueue = new CustomQueue<>();
    }

    @Test
    public void testAdd() {
        customQueue.add("2");
        assertEquals(customQueue.peek().value, "2");
    }

    /**
     * Test that involve remove method.
     */
    @Test
    public void remove() {
        customQueue.add("1");
        customQueue.add("2");
        Node removed = customQueue.remove();
        assertEquals(removed.value, "1");
    }

    /**
     * Test that involve peek method.
     */
    @Test
    public void peek() {
        customQueue.add("10");
        customQueue.add("11");
        customQueue.add("12");
        customQueue.add("13");

        assertEquals(customQueue.peek().value, "10");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "11");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "12");

    }
}