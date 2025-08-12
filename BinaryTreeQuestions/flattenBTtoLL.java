package BinaryTreeQuestions;

public class flattenBTtoLL {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node rooot){
        if(rooot == null){
            return;
        }
        System.out.print(rooot.val + " ");
        preorder(rooot.left);
        preorder(rooot.right);
    }

    public static Node nextRight = null;
    public static void flatten(Node root){
        if(root == null){
            return;
        }

        flatten(root.right);
        flatten(root.left);
        root.left = null;
        root.right = nextRight;
        nextRight = root;
    }
    public static void main(String[] args) {
        /*
                  1
                /   \
               2     5
              / \     \
             3   4     6
    */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        flatten(root);

        preorder(root);
    }
}
