package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayUsingLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] newarray = new int[5];

//        Getting input by user
        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = sc.nextInt();
        }
        System.out.println();

//        Print the output using the loop
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
        }
        System.out.println();

//        getting output using for each loop
        for(int n : newarray){
            System.out.println(n);
        }
        System.out.println();

//        getting output using to string method
        System.out.println(Arrays.toString(newarray));
    }

}
