package RecursionProblems;

public class recursion_basic {
    public static void main(String[] args) {
//        print_n_to_1(5);
        System.out.println(fun(5));
    }
    static void print_n_to_1(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        print_n_to_1(n-1);
    }
    static void print_1_to_n(int n){
        if(n == 0){
            return;
        }
        print_1_to_n(n-1);
        System.out.println(n);
    }
    static void print_name_n_times(int n){
        if(n == 0){
            return;
        }
        System.out.println("Aakash");
        print_name_n_times(n-1);
    }

//    Sum of first N Natural Numbers
    static int fun(int n){
        if(n==0){
            return -1;
        }
        return n +fun(n-1);
    }
}
