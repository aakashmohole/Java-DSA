package RecursionProblems;

public class powerCla {
    public static void main(String[] args) {
        System.out.println(optimizedPower(2,10));
    }
    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        int xpn = x * power(x, n-1);
        return xpn;
    }

    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower =  optimizedPower(x, n/2);
        int halfPowerSqr = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }
}
