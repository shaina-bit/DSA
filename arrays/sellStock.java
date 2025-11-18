//question- best time to buy and sell stock
//time complexity- O(n)
//space complexity- O(1)

class sellStock {
    public int maxProfit(int[] prices) {
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){  //profit
                int profit= prices[i]-buyPrice; //today's profit
                maxProfit= Math.max(maxProfit,profit);
            } else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}