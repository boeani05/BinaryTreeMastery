package tree;

public record Tree(Node root) {

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        traverseInOrderRecursive(node.getLeftChild());

        System.out.print(node.getValue() + " ");

        traverseInOrderRecursive(node.getRightChild());
    }

    private void traversePreOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getValue() + " ");

        traversePreOrderRecursive(node.getLeftChild());

        traversePreOrderRecursive(node.getRightChild());
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

        Node foundInLeft = findNodeRecursive(current.getLeftChild(), valueToFind);

        if (foundInLeft != null) {
            return foundInLeft;
        }

        return findNodeRecursive(current.getRightChild(), valueToFind);
    }
}
