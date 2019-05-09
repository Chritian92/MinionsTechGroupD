package homework.linkedlist;

public class CustomList implements IList {
    Node head;
    Node tail;


    @Override
    public void add(int index, int value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    @Override
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

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

    @Override
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public void remove(int index) {
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    @Override
    public void removeFirst() {
        head = head.next;
    }

    @Override
    public void removeLast() {
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        tail = currentNode;
        currentNode.next = null;
    }

}
