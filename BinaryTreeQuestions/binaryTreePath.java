package BinaryTreeQuestions;

import java.util.ArrayList;

public class binaryTreePath {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void allPath(Node root, String path, ArrayList<String > ans){
        if(root.left == null && root.right == null){
            ans.add(path);
        }
        if(root.left != null){
            allPath(root.left, path + " ->"+ String.valueOf(root.left.val), ans);
        }
        if(root.right != null){
            allPath(root.right, path + " ->"+ String.valueOf(root.right.val), ans);
        }
    }

    public static ArrayList<String > helper(Node root){
        ArrayList<String > ans = new ArrayList<>();
        String path =  "" + root.val;

        allPath(root, path, ans);
        return ans;
    }
    public static void main(String[] args) {
        // sample tree:
        //      1
        //     / \
        //    2   3
        //     \
        //      5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);

        ArrayList<String> paths = helper(root);
        for (String p : paths) {
            System.out.println(p);
        }
    }
}
