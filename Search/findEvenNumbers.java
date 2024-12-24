package Search;

public class findEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 234, 5, 54523, 5453};
        System.out.println(findEvenNumbers(nums));

    }

    static  int findEvenNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count ++;
            }
        }

        return  count;
    }

    static boolean even(int n){
        int noOfDigits = digits(n);
//        if (noOfDigits % 2 == 0){
//            return true;
//        }
        return noOfDigits % 2 ==0;
    }
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count ++;
            num = num / 10;
        }
        return count;
    }
}
