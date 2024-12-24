package Backtracking;

public class findSubset {
    public static void main(String[] args) {

    }
    static void findSubsets(String str, String ans, int i){
        //base condition
        if (i ==  str.length()){
            System.out.println(ans);
            return;
        }
        //yes condition
        findSubsets(str, ans+str.charAt(i), i+1);

        //no condition
        findSubsets(str, ans, i+1);
    }
}
