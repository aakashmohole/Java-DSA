package RecursionProblems;

import java.util.ArrayList;

public class NumberofDiceRollWithTargetSum {
    public static void main(String[] args) {
        System.out.println(DiceRet("", 4));
    }
    static void Dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            Dice(p + i, target-i);
        }

    }
    static ArrayList<String> DiceRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String > list  = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(DiceRet(p + i, target-i));
        }
        return  list;
    }
}
