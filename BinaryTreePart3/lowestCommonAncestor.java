package BinaryTreePart3;

import java.util.ArrayList;

public class lowestCommonAncestor {
    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }

        path.add(root);

        if(root.val == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;

    }
    public static Node lowestCommonAncestorApproach1(Node root, int n1, int n2){  //O(n)
        ArrayList<Node> path1 =  new ArrayList<>();
        ArrayList<Node> path2 =  new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor
        int i = 0;
        for(; i < path1.size() && i< path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal node
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lowestCommonAncestorApproach2(Node root, int n1, int n2){
        if(root ==  null ||root.val == n1 || root.val == n2){
            return root;
        }

        Node leftLCA = lowestCommonAncestorApproach2(root.left, n1, n2);
        Node rightLCA = lowestCommonAncestorApproach2(root.right, n1, n2);
        if(rightLCA == null){
            return leftLCA;
        }
        if (leftLCA == null) {
            return rightLCA;
        }
        return root;
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

        int n1 = 4, n2 = 7;

        System.out.println(lowestCommonAncestorApproach2(root, n1, n2).val);
    }
}
