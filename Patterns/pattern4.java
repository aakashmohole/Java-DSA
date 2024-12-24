package Patterns;
/* In this problem statement we create pattern like

1
1 2
1 2 3
1 2 3 4
for (int col = 1; col<=row; col++){
                System.out.print(col); //change in row and col only
}

1
2 2
3 3 3
4 4 4 4
for (int col = 1; col<=row; col++){
                System.out.print(row); //change in row and col only
}
 */
public class pattern4 {
    public static void main(String[] args) {
        patterns4(6);
        patterns4_(5);
    }

    public static void patterns4(int  n){
        for(int row =1; row <= n; row ++){
            for (int col = 1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void patterns4_(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <row ; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
