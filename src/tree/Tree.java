package tree;

public class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    public boolean setRoot(int value) {
        if (root != null) {
            return false;
        }
        root = new Node(value);
        return true;
    }

    public boolean addChild(int parentValue, int childValue, Side side) {
        if (root == null) {
            return false;
        }

        Node parent = findNode(parentValue);
        if (parent == null) {
            return false;
        }

        if (findNode(childValue) != null) return false;

        Node child = new Node(childValue);

        if (side == Side.LEFT) {
            if (parent.getLeftChild() != null) return false;
            parent.setLeftChild(child);
        } else {
            if (parent.getRightChild() != null) return false;
            parent.setRightChild(child);
        }
        return true;
    }

    public Node findNode(int value) {
        return findNodeRecursive(root, value);
    }

    private Node findNodeRecursive(Node current, int valueToFind) {
        if (current == null) {
            return null;
        }

        if (current.getValue() == valueToFind) {
            return current;
        }

        Node foundLeft = findNodeRecursive(current.getLeftChild(), valueToFind);

        if (foundLeft != null) {
            return foundLeft;
        }

        return findNodeRecursive(current.getRightChild(), valueToFind);
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
        System.out.println();
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
        System.out.println();
    }

    public void traversePostOrder() {
        traversePostOrderRecursive(root);
        System.out.println();
    }

    private void traversePreOrderRecursive(Node node) {
        if (node == null) return;

        System.out.print(node.getValue() + " ");

        traversePreOrderRecursive(node.getLeftChild());

        traversePreOrderRecursive(node.getRightChild());
    }

    private void traverseInOrderRecursive(Node node) {
        if (node == null) return;

        traverseInOrderRecursive(node.getLeftChild());

        System.out.print(node.getValue() + " ");

        traverseInOrderRecursive(node.getRightChild());
    }

    private void traversePostOrderRecursive(Node node) {
        if (node == null) return;

        traversePostOrderRecursive(node.getLeftChild());

        traversePostOrderRecursive(node.getRightChild());

        System.out.print(node.getValue() + " ");
    }

    public int getHeight() {
        return getHeightRecursive(root);
    }

    private int getHeightRecursive(Node node) {
        if (node == null) return -1;

        int leftHeight = getHeightRecursive(node.getLeftChild());
        int rightHeight = getHeightRecursive(node.getRightChild());

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(Node node) {
        if (node == null) return 0;

        return 1 + countNodesRecursive(node.getLeftChild())
                + countNodesRecursive(node.getRightChild());
    }

    public void listLeafNodes() {
        listLeafNodesRecursive(root);
        System.out.println();
    }

    private void listLeafNodesRecursive(Node node) {
        if (node == null) return;

        if (node.getLeftChild() == null && node.getRightChild() == null) {
            System.out.print(node.getValue() + " ");
            return;
        }
        listLeafNodesRecursive(node.getLeftChild());
        listLeafNodesRecursive(node.getRightChild());
    }
}
