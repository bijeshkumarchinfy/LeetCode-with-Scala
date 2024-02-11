object Solution {
    def numIslands(grid: Array[Array[Char]]): Int = {
        def vis(r:Int, c:Int){
            grid(r)(c) = 0
            if(r-1>=0 && grid(r-1)(c)=='1') vis(r-1, c)
            if(r+1<grid.size && grid(r+1)(c)=='1') vis(r+1, c)
            if(c-1>=0 && grid(r)(c-1)=='1') vis(r, c-1)
            if(c+1<grid(0).size && grid(r)(c+1)=='1') vis(r, c+1)
        }

        var ans = 0
        for(row<- 0 until grid.size; col<- 0 until grid(0).size)
            if(grid(row)(col)=='1'){
                ans+=1
                vis(row, col)
            }
        ans
    }

}
