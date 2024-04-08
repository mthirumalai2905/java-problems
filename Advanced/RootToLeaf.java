package Advanced;

import java.util.ArrayList;
import Trees.Node;

public class RootToLeaf {

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println(); // Add a newline after printing the path
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        // Leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRoot2Leaf(root.left, new ArrayList<>(path)); // Pass a copy of path for left subtree
            printRoot2Leaf(root.right, new ArrayList<>(path)); // Pass a copy of path for right subtree
        }
    }
}
