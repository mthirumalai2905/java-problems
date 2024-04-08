package Advanced;

import Trees.Node;

public class PrintingInRange {
    public static void PrintInRange(Node root, int x, int y){
        if(root == null){
            return;
        }
        if(root.data >= x & root.data <= y){
            PrintInRange(root.left,x,y);
            System.out.print(root.data + " ");
            PrintInRange(root.right, x, y);
        }
        else if(root.data >= y){
            PrintInRange(root.left,x,y);
        }
        else{
            PrintInRange(root.right, x, y);
        }

    }
}
