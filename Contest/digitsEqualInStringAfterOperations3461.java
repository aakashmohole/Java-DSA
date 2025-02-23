package Contest;

public class digitsEqualInStringAfterOperations3461 {
    public static void main(String[] args) {

        System.out.println(hasSameDigits("3902"));
    }
    public static boolean hasSameDigits(String s) {
        //loop until  s length is 2
        while(s.length() > 2){
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length()-1; i++) {
                //first and second digit extract
                int fd = s.charAt(i) - '0';
                int sd = s.charAt(i+1) - '0';

                //new digit
                int newDigit = (fd+sd) %10;

                sb.append(newDigit);
            }
            s = sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
