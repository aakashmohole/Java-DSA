package stringProblems;

public class stringCompression443 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int ind =0;
        for(int i =0; i< chars.length; i++){
            char ch = chars[i];
            int count = 0;
            while (i <chars.length && chars[i] == ch){
                count++;
                i++;
            }

            // Store the character
            chars[ind++] = ch;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[ind++] = c;
                }
            }
            i--;
        }
        return ind;
    }
}
