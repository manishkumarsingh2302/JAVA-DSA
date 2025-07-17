class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Insert a node into the binary tree
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Inorder Traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Print inorder traversal
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}
