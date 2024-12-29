package stringProblems;

public class validPalindrom125 {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s)){
            System.out.println("Palindrome");
        }
    }
    public static boolean isPalindrome(String s) {
        int st=0, end = s.length()-1;
        while(st < end){
            if(!Character.isLetterOrDigit(s.charAt(st))){
                st++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else {
                if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                st++;
                end--;
            }

        }
        return true;
    }

}
