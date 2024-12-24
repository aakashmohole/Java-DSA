package Patterns;
/* In this problem statement we create pattern like

 * * * *
 * * * *
 * * * *
 * * * *

 */

public class pattern2 {
    public static void main(String[] args) {
        patterns2(4);
    }
    public static void patterns2(int n){
        for(int row = 1; row <=n; row++){
            //for every row ittreate col loop
            for (int col = 1; col <=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
