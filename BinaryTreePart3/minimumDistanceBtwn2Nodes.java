package BinaryTreePart3;

public class minimumDistanceBtwn2Nodes {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node lowestCommonAncestorApproach(Node root, int n1, int n2){
        if(root == null || root.val == n1 || root.val == n2){
            return root;
        }

        Node leftLCA = lowestCommonAncestorApproach(root.left, n1, n2);
        Node rightLCA = lowestCommonAncestorApproach(root.right, n1, n2);

        if(rightLCA == null){
            return leftLCA;
        }
        if (leftLCA == null) {
            return rightLCA;
        }

        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if (root.val == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if (leftDist == -1) {
            return rightDist +1;
        }else {
            return leftDist +1;
        }

    }

    public static int miniDist(Node root, int n1, int n2){
        Node lca = lowestCommonAncestorApproach(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }
    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4  5  6   7
        */


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 6;
        System.out.println(miniDist(root, n1, n2));
    }
}
