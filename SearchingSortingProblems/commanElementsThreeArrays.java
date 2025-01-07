package SearchingSortingProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class commanElementsThreeArrays {
    public static void main(String[] args) {
        int A[] = {1, 5, 10, 20, 30} , B[] = {5, 13, 15, 20}, C[] = {5, 20};
        System.out.println(find(A, B, C));
    }
    public static ArrayList<Integer> find(int[] A, int[] B, int[] C){
        ArrayList <Integer> arrayList =  new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]){
                    for (int k = 0; k < C.length; k++) {
                        if (B[j] == C[k]){
                            arrayList.add(A[i]);
                        }
                    }
                }
            }
        }
        return arrayList;

    }
}
