import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }

    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;

        while(n > 0 ){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;

        }
        if (sum == orignal){
            return true;
        }
        return false;
    }
}
