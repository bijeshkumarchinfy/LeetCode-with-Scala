import scala.collection.mutable.HashSet
object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        var ans = 0
        val set = HashSet[Int]()
        val start = HashSet[Int]()
        for(num<- nums) set.add(num)

        for(num<- nums) if(!set.contains(num-1)) start.add(num)

        for(num<- start){
            var currLen = 1
            var nextNum = num+1
            while(set.contains(nextNum)){
                currLen+=1
                nextNum+=1
            }
            ans = ans.max(currLen)
        }
        ans
    }
}
