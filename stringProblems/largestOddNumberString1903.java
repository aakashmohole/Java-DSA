package stringProblems;

public class largestOddNumberString1903 {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        int n = Integer.parseInt(num);

        if (n % 10 == 0){
            return "";
        }else{
            for (int i = 0; i < num.length(); i++) {
                int rem = Integer.parseInt(String.valueOf(num.charAt(i))) % 10;
                if (rem == 0){
                    return "";
                }else {
                    return  Integer.toString(num.charAt(i));
                }
            }
        }
        return num;
    }
}
