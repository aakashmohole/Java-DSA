package BinaryTreePart3;

public class transformToSumTree {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int val = root.val;

        int newLeft = root.left == null ? 0 : root.left.val;
        int newRight = root.right == null ? 0 : root.right.val;

        root.val = newLeft + leftChild + newRight + rightChild;

        return val;
    }

    public static int sum(Node root) {
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        root.val += leftSum + rightSum;

        return root.val;
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
        /* original tree
                  1
                /   \
               2     3
              / \   / \
             4  5  6   7
        */

        /* expected tree
                  27
                /   \
              9     13
             / \   /  \
            0   0 0    0
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preorder(root);
        System.out.println();
//        sum(root);
        transform(root);
        preorder(root);
    }
}
