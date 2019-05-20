package homework.linkedlist;

/**
 * Custom list class.
 */
public class CustomList implements IList {
    Node head;
    Node tail;

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(int index, Object value) {
        Node new_node = new Node(value);
        Node currentNode = head;
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            new_node.next = currentNode.next;
            currentNode.next.previous = new_node;
            new_node.previous = currentNode;
            currentNode.next = new_node;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addFirst(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void printList() {
        Node currentNode = head;
        while (true) {
            System.out.println(currentNode.value);
            if (currentNode.next == null) {
                break;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addLast(Object value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(int index) {
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        currentNode.next = currentNode;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeFirst() {
        head = head.next;
        head.previous = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeLast() {
        tail = tail.previous;
        tail.next = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Node getIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}
