class Node1 {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Insert node
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Search a value in the tree
    public boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        // Searching
        int key = 60;
        System.out.println("Is " + key + " present? " + (tree.search(tree.root, key) ? "Yes" : "No"));
    }
}
