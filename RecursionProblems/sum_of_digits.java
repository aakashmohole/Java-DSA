package RecursionProblems;

public class sum_of_digits {
    public static void main(String[] args) {
        int ans = sum(4927);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n == 0){
            return 1;
        }
        return (n%10 + sum(n/10));
    }
}
