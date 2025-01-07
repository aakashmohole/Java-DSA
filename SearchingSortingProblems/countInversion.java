package SearchingSortingProblems;

public class countInversion {
    public static void main(String[] args) {
       int arr[] = {2, 4, 1, 3, 5};
        System.out.println(findCount(arr));
    }
    public static int findCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
