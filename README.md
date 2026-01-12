# BinaryTree Mastery

A console-based Java application designed to help you understand and interact with the fundamental concepts of binary trees. This project allows users to build a custom binary tree by adding nodes and then perform common tree traversals.

## Features

-   **Interactive Console Menu:** Easy-to-use text-based interface for all operations.
-   **Dynamic Node Addition:**
    -   Add a new root node if the tree is empty.
    -   Add new nodes as left or right children to any existing node in the tree.
    -   Includes validation to ensure parent nodes exist and child slots are not already occupied.
-   **Pre-Order Traversal:** Displays tree nodes in the order: Root -> Left Subtree -> Right Subtree.
-   **In-Order Traversal:** Displays tree nodes in the order: Left Subtree -> Root -> Right Subtree.
-   **Robust Input Handling:** Catches `InputMismatchException` for non-integer inputs.

## How to Run

1.  **Save the files:** Ensure `App.java` is in a directory named `treeApp/`, and `Node.java`, `Tree.java` are in a directory named `tree/`. Both `treeApp` and `tree` should be in the same parent directory.
2.  **Compile:** Open your terminal or command prompt, navigate to the parent directory of `treeApp` and `tree`, and compile the Java files:
    ```bash
    javac treeApp/App.java tree/Node.java tree/Tree.java
    ```
3.  **Execute:** Run the application:
    ```bash
    java treeApp.App
    ```

## Project Structure

-   `tree/Node.java`: Defines the basic building block (node) of the binary tree.
-   `tree/Tree.java`: Manages the overall tree structure and implements tree-specific algorithms (traversals, node search).
-   `treeApp/App.java`: Contains the main application logic, user interface, and integration of tree operations.

## Current Progress

-   ✅ Node structure defined (`Node.java`).
-   ✅ Tree structure defined (`Tree.java`).
-   ✅ Node addition functionality (with validation) implemented in `App.java`.
-   ✅ Pre-Order Traversal implemented in `Tree.java` and accessible from `App.java`.
-   ✅ In-Order Traversal implemented in `Tree.java` and accessible from `App.java`.
-   ☑️ Node search (`findNode`) implemented in `Tree.java` (used internally for adding nodes).

## Future Enhancements (Coming Soon!)

-   Implement **Post-Order Traversal**.
-   Calculate and display the **height of the tree**.
-   Count and display the **total number of nodes** in the tree.
-   Identify and display all **leaf nodes**.
-   Add functionality for **node deletion**.
-   (Potentially explore iterative versions of traversals using a stack.)