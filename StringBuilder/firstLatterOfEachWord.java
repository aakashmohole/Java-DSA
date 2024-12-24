package StringBuilder;

public class firstLatterOfEachWord {
    public static void main(String[] args) {

//        simple string builder
//        StringBuilder s = new StringBuilder("");
//        for (char ch = 'a'; ch <= 'z'; ch++ ){
//            s.append(ch);
//        }
//        System.out.println(s);

        //function call
        String str = "hello i am aakash";
        System.out.println(touppercase(str));
    }
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
