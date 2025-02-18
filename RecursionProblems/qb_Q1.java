package RecursionProblems;

public class qb_Q1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        count(arr, key, 0);
    }
    public static void count(int[] arr, int key, int ind){
        if (ind == arr.length){
            return;
        }
        if (arr[ind] == key){
            System.out.print(ind+" ");
        }
        count(arr, key, ind+1);
    }
}
