package Practice;

public class second_largest_ele {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,3,2};
        int ans = find(arr);
        System.out.println(ans);
    }
    static int find(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        int second_largest = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }


}
