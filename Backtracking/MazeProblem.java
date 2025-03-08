package Backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(find(3,3));
//        path("", 3,3);
//        System.out.println(pathArraylist("", 3,3));
//        System.out.println(count(3,3));
    }

    static int count(int r, int c){
        if(r == 1 || c ==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }

        if (r>1){
            path(p + "D", r-1,c);
        }
        if (c>1){
            path(p + "R", r, c-1);
        }
    }
    static ArrayList<String> pathArraylist(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<> ();
            list.add(p);
            return list;
        }

        ArrayList<String> list =  new ArrayList<>();

        if (r>1){
            list.addAll(pathArraylist(p + "D", r-1,c));
        }
        if (c>1){
            list.addAll(pathArraylist(p + "R", r, c-1));
        }
        return list;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<> ();
            list.add(p);
            return list;
        }

        ArrayList<String> list =  new ArrayList<>();
        if (r>1 && c>1){
            list.addAll(pathDiagonal(p + "D", r-1,c-1));
        }

        if (r>1){
            list.addAll(pathDiagonal(p + "V", r-1,c));
        }
        if (c>1){
            list.addAll(pathDiagonal(p + "H", r, c-1));
        }
        return list;
    }
}
