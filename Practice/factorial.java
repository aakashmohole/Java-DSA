package Practice;

public class factorial {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(findFactorial(n));
    }
    static int findFactorial(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum *i;
        }
        return sum;
    }
}
