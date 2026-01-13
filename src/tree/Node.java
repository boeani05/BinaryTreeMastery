package tree;

public class Node {
    private final int value;
    private Node rightChild;
    private Node leftChild;
    private Node parent;

    public Node(int value) {
        this.value = value;
    }

    public void setLeftChild(Node leftChild) {
        if (leftChild == null) {
            throw new IllegalArgumentException("left child must not be null");
        }

        this.leftChild = leftChild;
        leftChild.parent = this;
    }

    public void setRightChild(Node rightChild) {
        if (rightChild == null) {
            throw new IllegalArgumentException("right child must not be null");
        }
        this.rightChild = rightChild;
        rightChild.parent = this;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int getValue() {
        return this.value;
    }

    public Node getParent() {
        return this.parent;
    }

    @Override
    public String toString() {
        return "Node(" + value + ")";
    }
}
