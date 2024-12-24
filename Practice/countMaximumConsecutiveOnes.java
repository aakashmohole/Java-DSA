package Practice;

public class countMaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,1,0,0,1,1};
        System.out.println(find(arr));
    }

    static int find(int[] arr){
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count= count+1;
            }
            else {
                count = 0;
            }
            if (count > max){
                max = count;
            }

        }
        return max;
    }

}
