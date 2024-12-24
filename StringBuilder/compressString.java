package StringBuilder;

public class compressString {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressWithStringBuilder(str));
    }

    public static String compressStr(String str){
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static String compressWithStringBuilder(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer c = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                c++;
                i++;
            }
            sb.append(str.charAt(i));
            if(c > 1){
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
