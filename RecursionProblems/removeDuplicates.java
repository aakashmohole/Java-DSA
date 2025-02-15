package RecursionProblems;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "appanacollage";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void remove(String str, int ind, StringBuilder newStr, boolean map[]){
        if(ind == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(ind);
        if (map[currChar - 'a'] == true){
            //duplicate
            remove(str, ind+1, newStr, map);
        }
        else {
            map[currChar-'a'] = true;
            remove(str, ind+1, newStr.append(currChar), map);
        }
    }
}
