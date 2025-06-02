// Node class for Binary Tree
class Node {
    int key;
    Node left, right;

    // Constructor to create a new node
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// BinaryTree class
class BinaryTree1 {
    Node root;

    // Constructor for BinaryTree, initializing the root to null
    public BinaryTree1() {
        root = null;
    }

    // Method to insert a new node with the given key
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in the tree
    private Node insertRec(Node root, int key) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to print the tree in a structured way
    public void printTree() {
        printTreeRec(root, "", true);
    }

    // A utility function to print the tree
    private void printTreeRec(Node root, String indent, boolean last) {
        if (root != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }

            System.out.println(root.key);
            printTreeRec(root.left, indent, false);
            printTreeRec(root.right, indent, true);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes to form the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the tree structure
        System.out.println("Binary Tree Structure:");
        tree.printTree();
    }
}
