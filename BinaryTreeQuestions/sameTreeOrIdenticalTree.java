package BinaryTreeQuestions;

public class sameTreeOrIdenticalTree {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null || p.val != q.val){
            return false;
        }

        if(!isSameTree(p.left, q.left)){
            return false;
        }
        if(!isSameTree(p.right, q.right)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        System.out.println(isSameTree(p, q));
    }
}
