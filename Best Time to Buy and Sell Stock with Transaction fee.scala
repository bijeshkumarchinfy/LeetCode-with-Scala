object Solution {
    def maxProfit(prices: Array[Int], fee: Int): Int = {
        var buy = -prices(0) - fee   
        var sell = 0  
        for(index<- 1 until prices.size){
            val currBuy = sell - prices(index) - fee
            val tempBuyProfit = currBuy.max(buy)

            
            val currSell = buy + prices(index)
            val tempSellProfit = currSell.max(sell)

            buy = tempBuyProfit
            sell = tempSellProfit
        }
        //at last we can only sell
        sell
    }
}
