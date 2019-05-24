package homework.linkedlist;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Class Custom list with unit test.
 */
public class CustomListTest {
    private CustomList<Object> customList;

    /**
     * Init list
     */
    @BeforeClass
    public void setup() {
        customList = new  CustomList<Object>();
    }


    @Test
    public void testAdd() {
        customList.addFirst(1);
        customList.addFirst(2);
        customList.addFirst(3);
        customList.add(1, 25);
        customList.add(2, 4);
        customList.add(4, 10);
        customList.add(3, "List");
        customList.add(4, false);
        customList.add(5, 3.14159265359);

        assertEquals(customList.getIndex(1).value, 25);
        assertNotEquals(customList.getIndex(2).value, 10);
        assertEquals(customList.getIndex(3).value, "List");
        assertNotEquals(customList.getIndex(4).value, true);
        assertEquals(customList.getIndex(5).value, 3.14159265359);
    }

    @Test
    public void testAddFirst() {
        customList.addFirst(1);
        assertEquals(customList.head.value, 1);
        customList.addFirst("Start");
        assertEquals(customList.head.value, "Start");
    }

    @Test
    public void testAddLast() {
        customList.addLast(4);
        assertEquals(customList.tail.value, 4);
        customList.addLast("End");
        assertEquals(customList.tail.value, "End");
    }

    @Test
    public void testRemove() {
        customList.addFirst(1);
        customList.addFirst(4);
        customList.add(1, 8);
        customList.addLast(4);
        customList.remove(1);
        assertNotEquals(customList.getIndex(1), 2);
    }

    @Test
    public void testRemoveFirst() {
        customList.addFirst(1);
        customList.addFirst(2);
        customList.add(1, 3);
        customList.add(2, 4);
        customList.addLast(5);
        customList.removeFirst();
        assertNotEquals(customList.getIndex(0), 9);
    }

    @Test
    public void testRemoveLast() {
        customList.addFirst(1);
        customList.addLast(5);
        customList.removeLast();
        assertNotEquals(customList.getIndex(1), 5);
    }
}
