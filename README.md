# BinaryTree Mastery

A robust and interactive console-based Java application designed to deepen your understanding and practical skills with fundamental binary tree concepts. This project allows users to build and manipulate a custom binary tree, performing common operations with a focus on code quality and user experience.

## Features

-   **Interactive Console Menu:** User-friendly text-based interface for all tree operations.
-   **Robust Input Handling:** Custom `readInt` utility ensures valid integer input, preventing runtime errors.
-   **Dynamic Node Addition (`Add node`):**
    -   Initialize the tree with a root node.
    -   Add new nodes as left or right children to any existing parent node (identified by its value).
    -   Comprehensive validation: Checks if the parent node exists, if the chosen child slot is available, and prevents adding nodes with duplicate values.
    -   Utilizes a type-safe `Side` enum for clearer child placement.
-   **Tree Traversals:**
    -   **Pre-Order Traversal:** Displays nodes in the order: Root -> Left Subtree -> Right Subtree.
    -   **In-Order Traversal:** Displays nodes in the order: Left Subtree -> Root -> Right Subtree.
    -   **Post-Order Traversal:** Displays nodes in the order: Left Subtree -> Right Subtree -> Root.
-   **Tree Properties:**
    -   **Get Height of Tree:** Calculates the height (longest path from root to leaf) of the tree.
    -   **Count of Nodes:** Determines the total number of nodes in the tree.
    -   **List Leaf Nodes:** Identifies and lists all nodes that have no children, ordered from left to right.
-   **Enhanced Node Definition:** `Node` values are `final`, `parent` references are managed, and `IllegalArgumentException` is thrown for invalid child assignments.
-   **Modular Design:** Logic is well-separated into `Node`, `Tree`, `Side`, and `App` classes, promoting maintainability and readability.

## How to Run

1.  **Project Setup:**
    -   Create a main project directory.
    -   Inside, create two subdirectories: `tree` and `treeApp`.
    -   Place `Node.java`, `Tree.java`, `Side.java` into the `tree` directory.
    -   Place `App.java` into the `treeApp` directory.
2.  **Compile:** Open your terminal/command prompt, navigate to your main project directory, and compile the Java files:
    ```bash
    javac -d out tree/Node.java tree/Side.java tree/Tree.java treeApp/App.java
    ```
3.  **Execute:** Run the application:
    ```bash
    java -cp treeApp.App
    ```

## Project Structure

-   `tree/Node.java`: Defines the fundamental building block (node) with its value, children, and parent.
-   `tree/Tree.java`: Manages the overall tree structure and implements all core tree algorithms (traversals, search, properties, node addition logic).
-   `tree/Side.java`: An enum for specifying LEFT or RIGHT child placement, improving type safety and readability.
-   `treeApp/App.java`: Contains the main application entry point, user interface, input handling, and orchestrates tree operations.

## Current Progress

-   ✅ Node structure defined (`Node.java`) with enhanced robustness.
-   ✅ `Side` enum implemented for type-safe child assignment.
-   ✅ Tree structure defined (`Tree.java`) with proper root and child management.
-   ✅ Robust node addition functionality (`addChild`) encapsulated in `Tree.java`.
-   ✅ Pre-Order, In-Order, and Post-Order Traversals implemented.
-   ✅ Height calculation (`getHeight`) implemented.
-   ✅ Node counting (`countNodes`) implemented.
-   ✅ Leaf node listing (`listLeafNodes`) implemented.
-   ✅ Interactive console menu (`App.java`) with robust input handling and clear user feedback.

## Next Steps (Future Enhancements)

-   Transform into a **Binary Search Tree (BST)**:
    -   Modify `addChild` logic to follow BST rules (smaller values left, larger values right).
    -   Optimize `findNode` for BST performance.
-   Implement **Node Deletion** for BSTs (a challenging but rewarding task!).
-   Explore other tree types like **Heaps** or **Balanced Search Trees (e.g., AVL Trees)**.
-   Add graphical visualization (e.g., using libraries like JavaFX or Swing for a basic GUI).