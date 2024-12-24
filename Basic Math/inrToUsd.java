import java.util.Scanner;

public class inrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float ans = (float) (n *0.012);
        System.out.println(ans);
    }
}
