package arrays;

public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int curr_profit = 0;
        int min_Val = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min_Val){
                min_Val= prices[i];
                continue;
            }else {
                curr_profit=prices[i]-min_Val;
                max_profit= Math.max(curr_profit,max_profit);
            }
        }
        return max_profit;
    }
}
