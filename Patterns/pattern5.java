package Patterns;

/* In this problem statement we create pattern like

*
* *
* * *
* * * *
* * *
* *
*

*/


public class pattern5 {
    public static void main(String[] args) {
        patterns5(4);
    }

    public static void patterns5(int n){
        for (int row = 0; row <= 2*n ; row++) {
            int totalSpaceInRow = row >n ? 2*n-row:row;
            for (int col = 0; col < totalSpaceInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
