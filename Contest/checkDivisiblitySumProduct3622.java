package Contest;

public class checkDivisiblitySumProduct3622 {

    public static boolean checkDivisibility(int n){
        int sum = 0, prod = 1;
        int num = n;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n = n/10;
        }
        return num % (sum + prod) == 0;
    }
    public static void main(String[] args) {
        int n = 99;
        System.out.println(checkDivisibility(n));
    }
}
