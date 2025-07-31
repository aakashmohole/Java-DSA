package BinaryTreeQuestions;

public class sumRootToLeafNumber {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void helper(Node root, int currSum, int[] total){
        if (root == null) return;

        currSum += root.val;

        if(root.left == null && root.right == null){
            total[0] =  total[0] + currSum;
            return;
        }
        if (root.left != null) {
            helper(root.left, currSum, total);
        }
        if (root.right != null) {
            helper(root.right, currSum, total);
        }
    }
    public static int sumNumbers(Node root){
        int[] total = new int[1];
        helper(root, 0, total);
        return total[0];
    }

    public static void main(String[] args) {
        // Sample tree:
        //      1
        //     / \
        //    2   3
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        int totalSum = sumNumbers(root);
        System.out.println("Total sum of root-to-leaf paths: " + totalSum);
    }
}
