package Practice;

public class NumberAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int ans= 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if ( arr[j] == num){
                   count = count + 1;
                }
                if (count == 1){
                    return  num;
                }
            }
        }
        return -1;
    }
}
