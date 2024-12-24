package Practice;

public class best_time_to_buy_sell_stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(find(prices));
    }
    static int find(int[] price){
        int smallPrice = price[0];
        int overAllProfit = 0;
        int todayProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if(price[i] < smallPrice){
                smallPrice = price[i];
            }
            todayProfit = price[i] - smallPrice;
            if (overAllProfit < todayProfit){
                overAllProfit = todayProfit;
            }
        }
        return overAllProfit;

    }
}
