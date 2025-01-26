package Practice;

public class best_time_to_buy_sell_stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(find(prices));
    }
    static int find(int[] price){

        int minPrice = Integer.MAX_VALUE;
        int todayProfit = 0;
        int overAllProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice){
                minPrice = price[i];
            }
            todayProfit = price[i] - minPrice;

            if (todayProfit > overAllProfit){
                overAllProfit = todayProfit;
            }
        }
        return overAllProfit;
    }
}
