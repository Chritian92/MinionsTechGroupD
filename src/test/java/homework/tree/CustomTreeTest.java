package homework.tree;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

/**
 * Class Custom tree with unit test.
 */
public class CustomTreeTest {
    private ITree<Integer> integerTree;


    @BeforeClass
    public void setup() {
        integerTree = new CustomTree<>();
    }

    /**
     * test on case positive.
     */
    @Test
    public void test1() {
        integerTree.add(50);
        integerTree.add(40);
        integerTree.add(80);
        integerTree.add(30);
        integerTree.add(60);
        integerTree.add(70);
        integerTree.add(90);
        integerTree.add(10);
        assertEquals("\\-- 50\n" +
                "    |-- 40\n" +
                "    |   |-- 30\n" +
                "    |   |   |-- 10\n" +
                "    \\-- 80\n" +
                "        |-- 60\n" +
                "        |   \\-- 70\n" +
                "        \\-- 90\n", integerTree.print());
    }

    /**
     * test on case negative.
     */
    @Test
    public void test2() {
        integerTree.add(50);
        integerTree.add(40);
        integerTree.add(80);
        integerTree.add(30);
        integerTree.add(60);
        integerTree.add(70);
        integerTree.add(90);
        integerTree.add(10);
        assertNotEquals("\\-- 50\n" +
                "    \\-- 80\n" +
                "        |-- 60\n" +
                "        |   \\-- 70\n" +
                "        \\-- 90\n" +
                "    |-- 40\n" +
                "    |   |-- 30\n" +
                "    |   |   |-- 10\n", integerTree.print());
    }

}