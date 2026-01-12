package treeApp;

import tree.Node;
import tree.Tree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = null;

        boolean doesMenuLoop = true;
        int menuChoice;

        while (doesMenuLoop) {
            System.out.println("""
                    
                    === BinaryTree Mastery ===
                    
                    1. Add node
                    2. Traverse Pre-Order
                    3. Traverse In-Order
                    4. Coming Soon
                    5. Coming Soon
                    6. Coming Soon
                    7. Coming Soon
                    8. Exit
                    """);

            while (true) {
                try {
                    menuChoice = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("\nError while reading input: " + e.getMessage());
                } finally {
                    scanner.nextLine();
                }
            }

            switch (menuChoice) {
                case 1:
                    int newNodeVal;
                    int leftOrRightChild;
                    int parentNodeVal;
                    Node newNode;
                    Node parentNode;

                    System.out.println("\n=== Enter an Integer value for the new Node ===");

                    while (true) {
                        try {
                            newNodeVal = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.err.println("\nError while reading input: " + e.getMessage());
                        } finally {
                            scanner.nextLine();
                        }
                    }

                    newNode = new Node(newNodeVal);

                    if (tree == null || tree.root() == null) {
                        tree = new Tree(newNode);

                        System.out.println("\nNode " + newNodeVal + " set as new root.");
                    } else {
                        System.out.println("\n--- Enter the value of the parent's node ---");

                        while (true) {
                            try {
                                parentNodeVal = scanner.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.err.println("\nError while reading input: " + e.getMessage());
                            } finally {
                                scanner.nextLine();
                            }
                        }

                        parentNode = tree.findNode(parentNodeVal);

                        System.out.println("\nAdd node " + newNodeVal + " to the left(1) or to the right(2)? ---");

                        while (true) {
                            try {
                                leftOrRightChild = scanner.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.err.println("\nError while reading input: " + e.getMessage());
                            } finally {
                                scanner.nextLine();
                            }
                        }

                        if (parentNode != null) {
                            if (leftOrRightChild == 1) {
                                if (parentNode.getLeftChild() == null) {
                                    parentNode.setLeftChild(newNode);
                                    System.out.println("\nSuccessfully added left child.");
                                } else {
                                    System.out.println("\nLeft Child is already occupied!");
                                }
                            } else if (leftOrRightChild == 2) {
                                if (parentNode.getRightChild() == null) {
                                    parentNode.setRightChild(newNode);
                                    System.out.println("\nSuccessfully added right child.");
                                } else {
                                    System.out.println("\nRight Child is already occupied!");
                                }
                            } else {
                                System.err.println("\nInvalid input. Try again!");
                            }
                        } else {
                            System.err.println("\nParent node can't be found...");
                        }
                    }
                    break;

                case 2:
                    if (tree == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        return;
                    }

                    System.out.println("\n=== Traversing Pre-Order ===");

                    tree.traversePreOrder();
                    break;
                case 3:
                    if (tree == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        return;
                    }

                    System.out.println("\nTraversing In-Order");

                    tree.traverseInOrder();
                    break;
            }
        }
    }
}
