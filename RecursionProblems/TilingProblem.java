package RecursionProblems;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
    public static int tilingProblem(int n){
        //base
        if(n == 0 || n == 1){
            return 1;
        }
        // kaam
        // vertical choice
        int ver = tilingProblem(n-1);

        // horizontal choice
        int hor = tilingProblem(n-2);
        int totalWays = ver + hor;
        return totalWays;
    }
}
