package Intermediate;

import Trees.Node;

public class CountNodesTrees {

    //Counting the number of nodes in the tree
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }
   
    //Getting the sum of all the Nodes
    public static int sumOfNodes(Node root){
       if(root == null){
        return 0;
       } 

       int leftSum = sumOfNodes(root.left);
       int rightSum = sumOfNodes(root.right);

       return leftSum + rightSum + root.data;
    }

    //Getting the height of the tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }


    //Diameter of a Tree
    //Case:1 - Passes through the diameter
    //Case:2 - Doesnt Pass through the diameter
    //0(N^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    //Optimized 0(N);
    static class TreeInfo{
        public int height;
        public int diameter;

        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
    
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
    
        int myHeight = Math.max(left.height, right.height) + 1;
    
        int diameter1 = left.diameter;
        int diameter2 = right.diameter;
        int diameter3 = left.height + right.height + 1;
    
        int mydiameter = Math.max(Math.max(diameter1, diameter2), diameter3);
    
        return new TreeInfo(myHeight, mydiameter);
    }
    
}
