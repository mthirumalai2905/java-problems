package Trees;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public class BinaryTree {
        Node root;

        public void insert(int data) {
            root = insertRec(root, data);
        }

        //Insertion in Tree Node
        public Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
            } else if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        public void inorder() {
            inorderRec(root);
        }

        //Traversal in Trees
        public void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }

        public Node search(int key){
              return searchRec(root, data);
        }

        //Searching in Trees
        public Node searchRec(Node root, int key){
            if(root == null || root.data == key){
                return root;
            }
            if(root.data < key){
                return searchRec(root.right, key);
            }
            return searchRec(root.left, key);
        }

        //Deletion in Trees
    }
}
