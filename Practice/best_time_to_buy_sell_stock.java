package Practice;

public class best_time_to_buy_sell_stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(priceFind(prices));
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
    public static int priceFind(int[] price){
        int maxProf = Integer.MIN_VALUE;
        for (int i = 0; i < price.length; i++) {
            for (int j = i+1; j < price.length; j++) {
                if (price[j] > price[i]){
                    maxProf = Math.max(price[j] - price[i], maxProf);
                }
            }
        }
        return maxProf;
    }
}
