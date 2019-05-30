package homework.tree;

import homework.linkedlist.Node;

public class CustomTree<T extends Comparable<T>> implements ITree<T>{
    private Node<T> root;

    /**
     * CustomTree constructor.
     */
    public CustomTree() {
        this.root = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> current = root;
        this.addNode(newNode, current);
    }

    /**
     * Method to add Node to Tree.
     * @param newNode new Node to add.
     * @param current current node.
     */
    private void addNode(Node<T> newNode, Node<T> current) {
        if (current == null) {
            this.root = newNode;
        } else {
            if (newNode.getValue().compareTo(current.getValue()) < 0) {
                this.insertToLeft(newNode, current);
            } else {
                this.insertRight(newNode, current);
            }
        }
    }

    /**
     * Method to add to right of Tree.
     */
    private void insertRight(Node<T> newNode, Node<T> current) {
        if (current.getNext() == null) {
            current.addNext(newNode);
        } else {
            this.addNode(newNode, current.getNext());
        }
    }

    /**
     * Method to add to left of Tree.
     */
    private void insertToLeft(Node<T> newNode, Node<T> current) {
        if (current.getPrevious() == null) {
            current.addPrevious(newNode);
        } else {
            this.addNode(newNode, current.getPrevious());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String print() {
        Node<T> current = root;
        StringBuilder result = new StringBuilder();
        print("", current, false, result);
        return result.toString();
    }

    /**
     * Method to print Tree.
     */
    private void print(String structure, Node<T> current, boolean left, StringBuilder stringBuilder) {
        if (current != null) {
            stringBuilder.append(structure)
                    .append(left ? "|-- " : "\\-- ")
                    .append(current.getValue())
                    .append("\n");
            print(structure + (left ? "|   " : "    "), current.getPrevious(), true, stringBuilder);
            print(structure + (left ? "|   " : "    "), current.getNext(), false, stringBuilder);
        }
    }
}
