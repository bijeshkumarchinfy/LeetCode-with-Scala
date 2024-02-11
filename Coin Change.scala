import scala.collection.mutable.Map
object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        var dp = Map[Int, Tuple2[Boolean, Int]]()
        val ans = solver(coins, amount, dp)
        
        if(ans._1==true) ans._2
        else -1
    }

    def solver(coins:Array[Int], amount:Int, dp:Map[Int, Tuple2[Boolean, Int]]):Tuple2[Boolean, Int]={
        if(amount==0) return (true, 0)
        if(amount<0) return (false, 0)
        if(dp.contains(amount)) return dp(amount)
        var ans = (false, Int.MaxValue)
        for(currCoin<-coins){
            val tempAns = solver(coins, amount-currCoin, dp)
            
            if(tempAns._1)
                ans = (true, ans._2.min(tempAns._2+1))
        }
        dp(amount) = ans
        ans
    }
}
