package BinaryTreeQuestions;

public class balancedBinaryTree {
    static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Simple height function
    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }


    //calculate tree height with balanced or not
    public static int checkHeight(Node root){
        if(root == null) return 0;

        int left =  checkHeight(root.left);
        if(left == -1) return -1;

        int right = checkHeight(root.right);
        if(right == -1) return -1;

        if(Math.abs(left -right) > 1) return -1; //current node not balanced

        return Math.max(left, right) + 1;
    }


    // Check balance at every node
    public static boolean isBalancedApproach1(Node root) {
        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        // Check recursively for left and right subtrees
        return isBalancedApproach1(root.left) && isBalancedApproach1(root.right);
    }

    public static boolean isBalancedApproach2(Node root){
        return checkHeight(root) != 1;
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
                  /
                 4
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);

        System.out.println(isBalancedApproach2(root));
    }
}
