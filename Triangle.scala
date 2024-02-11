import scala.collection.mutable.Map
object Solution {
    def minimumTotal(triangle: List[List[Int]]): Int = {
        val dp = Map[(Int,Int), Int]()
        def dfs(row:Int, col:Int):Int={
            if(dp.contains((row, col))) return dp((row, col))
            if(row == triangle.size-1) return triangle(row)(col)
            dp((row, col)) = dfs(row+1, col).min(dfs(row+1, col+1)) + triangle(row)(col)
            dp((row, col))
        }

        dfs(0,0)
    }
}
