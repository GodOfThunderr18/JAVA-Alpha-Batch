package BSearchTree;

public class AVLTrees {

    // Node class to represent an AVL Tree node
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1; // New node is initially at height 1
        }
    }

    // Root of the AVL Tree
    private static Node root;

    // Helper method to get the height of a node
    public static int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return the new root
        return x;
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return the new root
        return y;
    }

    // Get Balance factor of a node
    public static int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Insert a key into the AVL Tree and return the new root
    public static Node insert(Node node, int key) {
        // Perform the normal BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate keys are not allowed
            return node;
        }

        // Update the height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get the balance factor to check whether this node became unbalanced
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.data) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && key > node.right.data) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the unchanged node pointer
        return node;
    }

    // Preorder traversal of the AVL Tree
    public static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        // Insert nodes into the AVL Tree
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /* The AVL Tree after insertion:
                  30
                 /  \
               20   40
              /  \     \
            10   25    50
        */

        // Print the preorder traversal of the AVL Tree
        System.out.println("Preorder traversal of the AVL Tree:");
        preorder(root);
    }
}
