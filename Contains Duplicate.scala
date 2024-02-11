import scala.collection.mutable.Map
object Solution {
    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        val pair = Map[Int, Int]()
        for(i<-0 until nums.size){
            if(pair.contains(nums(i))){
                if(i-pair(nums(i))<=k) return true
                else pair(nums(i)) = i
            }
            else{
                pair(nums(i)) = i
            }
        }
        false
    }
}
