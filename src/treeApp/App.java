package treeApp;

import tree.Side;
import tree.Tree;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();

        boolean doesMenuLoop = true;

        while (doesMenuLoop) {
            System.out.println("""
                    
                    === BinaryTree Mastery ===
                    
                    1. Add node
                    2. Traverse Pre-Order
                    3. Traverse In-Order
                    4. Traverse Post-Order
                    5. Get Height of Tree
                    6. Count of Nodes
                    7. List Leaf Nodes
                    8. Exit
                    """);

            int menuChoice = readInt(scanner, "Choose an option: ");

            switch (menuChoice) {
                case 1 -> addNodeFlow(scanner, tree);

                case 2 -> {
                    if (tree.getRoot() == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        break;
                    }
                    System.out.println("\n===Traversing Pre-Order ===");
                    tree.traversePreOrder();
                }

                case 3 -> {
                    if (tree.getRoot() == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        break;
                    }
                    System.out.println("\n=== Traversing In-Order ===");
                    tree.traverseInOrder();
                }

                case 4 -> {
                    if (tree.getRoot() == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        break;
                    }
                    System.out.println("\n=== Traversing Post-Order ===");
                    tree.traversePostOrder();
                }

                case 5 -> {
                    if (tree.getRoot() == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        break;
                    }
                    System.out.println("\n=== Height of Tree ===");
                    System.out.println(tree.getHeight());
                }

                case 6 -> {
                    if (tree.getRoot() == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        break;
                    }
                    System.out.println("\n=== Count of all nodes ===");
                    System.out.println(tree.countNodes());
                }

                case 7 -> {
                    if (tree.getRoot() == null) {
                        System.out.println("\nThere aren't any nodes yet.");
                        break;
                    }
                    System.out.println("\n=== Leaf Nodes ===");
                    tree.listLeafNodes();
                }

                case 8 -> doesMenuLoop = false;

                default -> System.err.println("\nNot a valid input.");
            }
        }
    }

    private static void addNodeFlow(Scanner scanner, Tree tree) {
        int newNodeVal = readInt(scanner, "\nEnter an Integer value for the new Node: ");

        if (tree.getRoot() == null) {
            tree.setRoot(newNodeVal);
            System.out.println("\nNode " + newNodeVal + " set as new root.");
            return;
        }

        int parentNodeVal = readInt(scanner, "\nEnter the value of the parent's node: ");
        int sideChoice = readInt(scanner, "\nAdd node to the left(1) or to the right(2)?: ");

        Side side;
        if (sideChoice == 1) {
            side = Side.LEFT;
        } else if (sideChoice == 2) {
            side = Side.RIGHT;
        } else {
            System.err.println("\nInvalid input. Try again!");
            return;
        }

        boolean success = tree.addChild(parentNodeVal, newNodeVal, side);

        if (success) {
            System.out.println("\nSuccessfully added " + side + " child.");
        } else {
            System.err.println("\nFailed to add node. Possible reasons:");
            System.err.println("- Parent node not found");
            System.err.println("- Chosen side is already occupied");
            System.err.println("- Value already exists in the tree");
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();

            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("Enter a valid Integer!");
            }
        }
    }
}
