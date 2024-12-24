package RecursionProblems;
/*
* Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Example 1:

    Input:
        n=5
    Output:
        225
    Explanation:
        1^3+2^3+3^3+4^3+5^3=225

*/
public class sum_of_first_NthTerm {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    static int fun(int n){
        if(n < 2){
            return 1;
        }
        return (fun(n) * fun(n) * fun(n));
    }
}
