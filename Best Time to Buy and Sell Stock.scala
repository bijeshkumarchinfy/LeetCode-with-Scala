object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var preMin = prices(0)
        var ans = 0
        for(i<-1 until prices.size)
            if(prices(i)>preMin)
                ans = ans.max(prices(i)-preMin)
            else
                preMin = preMin.min(prices(i))
        ans
    }
}
