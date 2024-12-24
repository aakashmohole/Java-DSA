package RecursionProblems;

public class print_name_n_times {
    public static void main(String[] args) {
        printname(5);
    }
    static void printname(int n){
        if(n == 0){
            return;
        }
        System.out.print("GFG ");
        printname(n-1);
    }
}
