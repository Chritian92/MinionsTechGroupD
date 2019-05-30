package homework.tree;

/**
 * ITree interface class.
 */
public interface ITree<T> {
    /**
     * Function that involve add
     * @param value to add to Tree.
     */
    void add(T value);

    /**
     * Function that involve print.
     */
    String print();
}
