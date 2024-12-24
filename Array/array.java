package Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] rollno = {1,2,3,4,5,6,7,8};

        System.out.println(rollno[2]);
        System.out.println(rollno[1]);
        System.out.println(rollno[0]);

//        string object array

        String[] names = new String[5];
        names[0] = "aakash";
        names[1] = "om";
        names[2] = "sunil";
        names[3] = "saurabh";
        names[4] = "onkar";

        System.out.println(Arrays.toString(names));

    }
}
