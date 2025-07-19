package BinaryTreePart2;

public class DiameterOfTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight+rightHeight+1; //in leetcode we have to remove this added 1 becouse it asl for no of edges

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameterApproch2(Node root){ //O(n)
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameterApproch2(root.left);
        Info rightInfo = diameterApproch2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht+1);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) +1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right =  new Node(3);
//        root.left.left =  new Node(4);
//        root.left.right =  new Node(5);
//        root.right.left =  new Node(6);
//        root.right.right =  new Node(7);

        System.out.println(diameterApproch2(root).diam);
    }
}
