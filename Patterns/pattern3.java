package Patterns;
/* In this problem statement we create pattern like

* * * *
* * *
* *
*

 */

public class pattern3 {
    public static void main(String[] args) {
        patterns3(8);
    }
    public static void patterns3(int n){
        for (int row = 1; row <=n; row++){
            for (int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
