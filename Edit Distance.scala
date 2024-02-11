import scala.collection.mutable.Map
object Solution {
    def minDistance(word1:String, word2: String): Int = {
        val dp = Map[(Int, Int), Int]()
        
        def solver(i:Int, j:Int):Int={
            if(j==word2.length) return word1.length-i
            if(i==word1.length) return word2.length-j
            if(dp.contains((i,j))) return dp((i,j))
            val insert = solver(i, j+1)+1
            val delete = solver(i+1, j)+1
            var update = solver(i+1, j+1)+1
            if(word1(i)==word2(j)) update -= 1
            dp((i,j)) = insert.min(delete.min(update))
            dp((i,j))
        }

        solver(0,0)
    }
    
}
