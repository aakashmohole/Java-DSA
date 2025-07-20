package BinarySearchTreePart1;

public class printInRange {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;

        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInRangeA(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printInRangeA(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRangeA(root.right, k1, k2);

        }else if (root.data <  k1){
            printInRangeA(root.left, k1, k2);

        }else {
            printInRangeA(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printInRangeA(root, 5, 12);
    }
}
