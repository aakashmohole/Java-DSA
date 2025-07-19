package BinaryTreeQuestions;

public class invertBinaryTree {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void invertTree(Node root){
        if(root == null){
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
    }

    public static void preorder(Node rooot){
        if(rooot == null){
            return;
        }
        System.out.print(rooot.val + " ");
        preorder(rooot.left);
        preorder(rooot.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        invertTree(root);
        preorder(root);
    }
}
