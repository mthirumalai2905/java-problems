package Trees;

import java.util.*;

public class Node {
    public int data;
    public Node left;
    public Node right;

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

        //InOrder(DFS)
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

        //Level Order Traversal(BFS)
        public static void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
        
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
        

        public boolean search(int key){
              return searchRec(root, data);
        }

        //Searching in Trees
        public boolean searchRec(Node root, int key) {
            if (root == null) {
                return false;
            }
            if (root.data > key) {
                return searchRec(root.right, key);
            } else if (root.data == key) {
                return true;
            } else {
                return searchRec(root.left, key);
            }
        }
        


        //Deletion in Trees
        // No child
        // Single Child
        // Double Child - Finding inorder successor 
        // for BST - left most in right subtree

        public static Node delete(Node root, int val) {
            if (root == null) {
                return null;
            }
        
            if (root.data > val) {
                root.left = delete(root.left, val);
            } else if (root.data < val) {
                root.right = delete(root.right, val);
            } else {
                // Case 1 - leaf node
                if (root.left == null && root.right == null) {
                    return null;
                }
                // Case 2 - with single child
                if (root.left == null) {
                    return root.right;
                }
                if (root.right == null) {
                    return root.left;
                }
                // Case 3 - node with two children
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }
        
        public static Node inorderSuccessor(Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }        
    }
}
