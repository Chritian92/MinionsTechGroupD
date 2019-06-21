import homework.customTree.Tree;
import homework.linkedlist.CustomList;

/**
 * Main class.
 */
public class Main {

    public static void main(String args[]){
        CustomList cus = new CustomList();
        System.out.println("******Start*******");
        cus.addFirst(1);
        cus.addLast(2);
        cus.addLast(3);
        cus.addLast(4);
        cus.addLast(5);
        cus.addLast(6);
        cus.add(0, 10);
        cus.printList();
        System.out.println("*****************Remove*************");
        cus.remove(2);
        cus.printList();
        System.out.println("******RemoveFirst***");
        cus.removeFirst();
        cus.printList();
        System.out.println("******RemoveLast***");
        cus.removeLast();
        cus.printList();



        Tree customTree = new Tree();

        customTree.add(2);
        customTree.add(6);
        customTree.add(8);
        customTree.add(1);
        customTree.add(6);
        customTree.add(7);
        customTree.add(9);

        customTree.OrdenTree();



    }
}
