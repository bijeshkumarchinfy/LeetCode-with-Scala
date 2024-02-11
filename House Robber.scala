object Solution {
    def rob(nums: Array[Int]): Int = {
        var take = nums(0)
        var notTake = 0
        for(i<-nums){
            var takeTemp = take.max(i+notTake)
            var notTakeTemp = take.max(notTake)

            take = takeTemp
            notTake = notTakeTemp
        }
        take.max(notTake)
    }
}
