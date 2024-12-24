import java.util.Scanner;

public class largesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal,time,rate;
        principal = sc.nextInt();
        time = sc.nextInt();
        rate = sc.nextInt();

        if(principal > time && principal > rate){
            System.out.println(principal);
        } else if (time > principal && time > rate) {
            System.out.println(time);
        }else {
            System.out.println(rate);
        }
    }
}
