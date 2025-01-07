package SearchingSortingProblems;

public class sticklerThiefEditorial {
    public static void main(String[] args) {
        int[] hval = {5, 5, 10, 100, 10, 5};
        System.out.println(maxAmount(hval));
    }
    public static int maxAmount(int[] hval){
        int maxValue = 0;
        int sum = 0;
        // If no houses are left, return 0.
        if (hval.length <= 0) return 0;

        // If only 1 house is left, rob it.
        if (hval.length == 1) return hval[0];

        for (int i = 0; i < hval.length; i++) {

            for (int j = i+2; j < hval.length; j ++) {
                sum = hval[i] + hval[j];
            }
            if (maxValue < sum){
                maxValue = sum;
            }
        }
        return maxValue;
    }
}
