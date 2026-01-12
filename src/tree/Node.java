package tree;

public class Node {
    private int value;
    private Node rightChild;
    private Node leftChild;
    private Node prev;

    public Node(int value) {
        this.value = value;
        this.rightChild = null;
        this.leftChild = null;
        this.prev = null;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
        leftChild.prev = this;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
        rightChild.prev = this;
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

    public Node getPrev() {
        return this.prev;
    }
}
