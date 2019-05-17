package homework.linkedlist;

/**
 * Node class.
 */
public class Node<T> {
    Node next;
    Node previous;
    T value;

    /**
     * Constructor.
     * @param value generic data.
     */
    public Node(T value) {
        this.value =value;
        this.previous= null;
        this.next = null;
    }
}
