package Array;

import java.util.Arrays;
import java.util.Scanner;

public class multidArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }

        int [][] newarray = new int[2][3];

        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                newarray[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                System.out.println(newarray[i][j]);
            }
        }
    }
}
