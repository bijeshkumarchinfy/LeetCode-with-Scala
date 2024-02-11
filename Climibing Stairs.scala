import scala.collection.mutable.Map
object Solution {
    def climbStairs(n: Int): Int = {
        if(n==1) return 1
        if(n==2) return 2
        var arr = new Array[Int](n)
        arr(0) = 1
        arr(1) = 2
        for(i<- 2 until n)
            arr(i) = arr(i-1)+arr(i-2)
            
        arr(n-1)
    }
}
