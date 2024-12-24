package ArrayProblems;

//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.


public class RichestCustomerWelth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {3,7},
                {3,5}
        };
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            //It simply add the elements of each row
            int welth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                welth = accounts[i][j];
            }

            //now we have sum of welth
            if (welth>ans){
                ans = welth;
            }
        }
        System.out.println(ans);

    }
}
