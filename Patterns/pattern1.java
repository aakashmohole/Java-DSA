package Patterns;

/* In this problem statement we create pattern like

*
* *
* * *
* * * *

*/

public class pattern1 {
    public static void main(String[] args) {
        // call the function
        patterns(4);
    }

    public static void patterns(int n){
        for(int row = 1; row <=n; row++) {
            //for every row run col
            for (int col = 1; col <= row; col++)   {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
