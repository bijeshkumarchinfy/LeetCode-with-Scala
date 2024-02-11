object Solution {
    def minPathSum(grid: Array[Array[Int]]): Int = {
        val dp = Array.ofDim[Int](grid.size, grid(0).size)
        for(r<- 0 until grid.size; c<- 0 until grid(0).size)
            dp(r)(c) = -1
        solver(grid, 0, 0, dp)
    }

    def solver(grid: Array[Array[Int]], row:Int, col:Int, dp:Array[Array[Int]]):Int={
        if(dp(row)(col) != -1) dp(row)(col)
        else{
            var ans = Int.MaxValue
            if(row==grid.size-1 && col==grid(0).size-1)
                ans = ans.min(grid(row)(col))
            else{
                //choose down path
                if(row+1<grid.size) ans = ans.min(grid(row)(col)+solver(grid, row+1, col, dp))

                //choose right path
                if(col+1<grid(0).size) ans = ans.min(grid(row)(col)+solver(grid, row, col+1, dp))
            }
            dp(row)(col) = ans
            ans
        }
    }
}
