package Stack;

import java.util.Stack;

public class duplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s =  new Stack<>();

        for(int i = 0; i< str.length(); i++){
            char c =  str.charAt(i);

            //closing
            if(c == ')'){
                int count = 0;
                while(s.peek() != '('){ //check other elements
                    s.pop();
                    count++;
                }
                if (count < 1){
                    return true;
                }else{
                    s.pop(); //remove  closing bracket and all pair removed
                }
            }else {
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(isDuplicate(str2));
    }
}
