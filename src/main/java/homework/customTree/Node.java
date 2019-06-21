package homework.customTree;

/**
 * Class Node by CustomTree
 */
public class Node {
    Node right;
    Node left;
    int fe;
    int value;

    /**
     * Constructor node class.
     * @param value generic data type value.
     */
    public Node(int value) {
        this.value = value;
        this.fe = 0;
        this.right = null;
        this.left = null;

    }
}
