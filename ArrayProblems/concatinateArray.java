package ArrayProblems;

import java.util.Arrays;

public class concatinateArray {
    public static void main(String[] args) {
// Example with primitive data types
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length*2];

        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
            destinationArray[i+sourceArray.length] = destinationArray[i] = sourceArray[i];
        }
        System.out.println(Arrays.toString(destinationArray));
    }

}
