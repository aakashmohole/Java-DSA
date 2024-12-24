package RecursionProblems;

public class sum_and_pro_of_n_num {
    public static void main(String[] args) {
//        int ans = sum(5);
        int ans = prod(5);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n <2 ){
            return 1;
        }
        return(n+sum(n-1));
    }

    static int prod(int n){
        if(n <2){
            return 1;
        }
        return (n*sum(n-1));
    }
}
