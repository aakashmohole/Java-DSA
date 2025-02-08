package stringProblems;
/*
1. use simple if else if we get {} the replace with empty string in last we get empty string
then the re true
2. using stack for presance of { push in stack and the } presence remove it from stack
in end we gett empty stack then return true
*/
public class validParanthesis {
    public static void main(String[] args) {
        String s = "()[{}]";
        System.out.println(isValid(s));
    }

//    Simple use of if else to solve problem
    public static boolean isValid(String s){
        while(true){
            if(s.contains("{}")){
                s = s.replace("{}","");
            } else if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            }else {
                return s.isEmpty();
            }
        }
    }

}
