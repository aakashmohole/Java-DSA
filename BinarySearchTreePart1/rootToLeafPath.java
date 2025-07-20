package BinarySearchTreePart1;

import java.util.ArrayList;

public class rootToLeafPath {

    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (root.data > val){
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void printRoot2LeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null){
            System.out.println(path.toString());
        }

        printRoot2LeafPath(root.left, path);
        printRoot2LeafPath(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printRoot2LeafPath(root, new ArrayList<>());
    }
}
