import scala.collection.mutable.Map

object Solution {
    def myPow(x: Double, n: Int): Double = {
        val dp = Map[Int, Double]()
        val absoluteN = if(n<0) -n else n
        val ans = xPowN(x, absoluteN, dp)
        if(n<0)
            1/ans
        else
            ans
    }

    def xPowN(x:Double, n:Int, dp:Map[Int, Double]):Double={
        if(dp.contains(n)) return dp(n)
        if(n == 0) return 1
        if(n == 1) return x
        if(n == 2) return x*x
        if((n&1) == 0) 
            dp(n) = xPowN(x, (n/2).toInt, dp)*xPowN(x, (n/2).toInt, dp)
        else
            dp(n) = xPowN(x, (n/2).toInt, dp)*xPowN(x, (n/2).toInt+1, dp)
        dp(n)
    }

}
