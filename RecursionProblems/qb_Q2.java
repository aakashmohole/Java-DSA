package RecursionProblems;

public class qb_Q2 {
    public static void main(String[] args) {
        int number = 1947;
        System.out.println(convert(number));
    }
    static String[] digits = {
            "Zero", "One", "Tow", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };
    static String str = "";
    public static String convert(int n){
        if (n<10) {
            return digits[n];
        }
        return convert(n / 10) + " " + digits[n % 10];
    }
}
