package BinaryTreePart3;

public class KthLevel {
    static class Node{
        int val;
        Node left, right;

        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }
    public static void kthLevel(Node root, int level, int k){
        if (root == null){
            return;
        }
        if (level == k){
            System.out.print(root.val+ " ");
            return;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node root =  new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k =3;
        kthLevel(root,1,k);

    }
}
