package homework.linkedlist;

/**
 * IList interface class.
 */
public interface IList<T> {

    /**
     * Function that involve add
     * @param index int index.
     * @param value T value:
     */
    void add(int index, T value);

    /**
     * Function that involve add first.
     * @param value T value.
     */
    void addFirst(T value);

    /**
     * Function that involve add last.
     * @param value T value.
     */
    void addLast(T value);

    /**
     * Function that get a specific node.
     * @param index int  index.
     */
    Node getIndex(int index);

    /**
     * Function that involve remove.
     * @param index int index.
     */
    void remove(int index);

    /**
     * Function that involve remove first.
     */
    void removeFirst();

    /**
     * Function that involve remove last.
     */
    void removeLast();

    /**
     * Function that print a list.
     */
    void printList();
}
