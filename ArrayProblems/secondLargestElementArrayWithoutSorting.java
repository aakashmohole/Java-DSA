package ArrayProblems;

public class secondLargestElementArrayWithoutSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int n = 6;
        findValues(arr, n);
    }
    public static void findValues(int[] arr, int n){
        int small =Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < secSmall && arr[i] != small){
                secSmall = arr[i];
            }
            if(arr[i] > secLarge && arr[i] != large){
                secLarge = arr[i];
            }
        }
        System.out.println("sec small : " + secSmall);
        System.out.println("sec large : " + secLarge);
    }
}
