package homework.customTree;

/**
 * Class CustomTree
 */
public class Tree {
    Node root;

    /**
     * Method by add.
     * @param value int.
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
        } else {
            this.addNode(newNode, this.root);
        }
    }

    /**
     * Method by addNode
     * @param newNode node
     * @param customRoot custom root.
     */
    private void addNode(Node newNode, Node customRoot) {
        Node currentNode = customRoot;
        if (newNode.value <= customRoot.value) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                this.addNode(newNode, currentNode.left);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                this.addNode(newNode, currentNode.right);
            }
        }
        newNode.fe = 1 + Math.max(this.getNodeFe(newNode.right), this.getNodeFe(newNode.left));
        int balance = this.getBalance(newNode);
        System.out.println("the fe is: " + balance);
        this.verifyBalance(this.root);
    }

    /**
     * Method by verify the balance.
     * @param node node.
     */
    private void verifyBalance(Node node) {
        if (node == null) {
            return;
        }
        this.verifyBalance(node.left);
        System.out.println("the fe is: " + this.getFe(node));
        if (this.getBalance(node) == 2) {
            this.rigthRotate(node);
        }
        this.verifyBalance(node.right);
    }

    /**
     * Method by get balance.
     * @param node node.
     */
    private int getBalance(Node node) {
        return this.getNodeFe(node.right) - this.getNodeFe(node.left);
    }

    /**
     * Method by get Fe
     * @param node node
     */
    public int getFe(Node node) {
        if (node == null) {
            return 0;
        }
        return this.getNodeFe(node.right) - this.getNodeFe(node.left);
    }

    /**
     * Method by get Node Fe.
     * @param node node
     */
    private int getNodeFe(Node node) {
        if (node == null)
            return -1;
        return node.fe;
    }

    /**
     * Method by rotate to left.
     * @param currentNode node.
     */
    public Node leftRotate(Node currentNode) {
        Node aux = currentNode.right;
        currentNode.right = aux.left;
        aux.right = currentNode;
        currentNode.fe = Math.max(this.getNodeFe(currentNode.right), this.getNodeFe(currentNode.left)) + 1;
        aux.fe = Math.max(this.getNodeFe(aux.right), this.getNodeFe(aux.left)) + 1;
        return aux;
    }

    /**
     * Method by rotate to right.
     * @param currentNode node.
     */
    public Node rigthRotate(Node currentNode) {
        Node aux = currentNode.left;
        currentNode.left = aux.right;
        aux.right = currentNode;
        currentNode.fe = Math.max(this.getNodeFe(currentNode.right), this.getNodeFe(currentNode.left)) + 1;
        aux.fe = Math.max(this.getNodeFe(aux.right), this.getNodeFe(aux.left)) + 1;
        System.out.println("++++++++++++++++++++++++++++++++++++");
        preOrdenAux(aux);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        return aux;
    }


    /**
     * Method by Get Order.
     * @param currentRoot node.
     */
    private void preOrdenAux(Node currentRoot) {
        if (currentRoot == null) {
            return;
        }
        System.out.println(currentRoot.value);
        this.preOrdenAux(currentRoot.left);
        this.preOrdenAux(currentRoot.right);
    }

    /**
     * Method to order tree.
     */
    public void OrdenTree() {
        this.ordenAux(this.root);
    }

    /**
     * Method by order aux.
     * @param node node
     */
    private void ordenAux(Node node) {
        if (node == null) {
            return;
        }
        this.ordenAux(node.left);
        System.out.println(node.value);
        this.ordenAux(node.right);
    }

}
