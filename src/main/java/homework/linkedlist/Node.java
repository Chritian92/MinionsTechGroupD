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

    /**
     * Method to get value of Node.
     * @return value, node value.
     */
    public T getValue() {
        return this.value;
    }

    /**
     * Method to get next Node.
     * @return next, next Node.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Method to get previous Node.
     * @return previous, previous Node.
     */
    public Node<T> getPrevious() {
        return previous;
    }

    /**
     * Method to set next Node.
     * @param newNode new Node.
     */
    public void addNext(Node<T> newNode) {
        next = newNode;
    }

    /**
     * Method to set previous Node.
     * @param newNode new Node.
     */
    public void addPrevious(Node<T> newNode) {
        previous = newNode;
    }
}
