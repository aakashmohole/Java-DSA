package RecursionProblems;

public class qb_lengthOfString {
    public static void main(String[] args) {
        String str = "AakashMohole";
        System.out.println(findLenght(str, 0));
    }
    public static int findLenght(String str, int cha){
        if(cha == str.length()){
            return cha;
        }

        return findLenght(str, cha+1);
    }
}
