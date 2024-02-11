//gives count of unique elements
object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var uniques = 1
        for(i<- 0 to nums.size-2)
            if(nums(i)!=nums(i+1)){
                nums(uniques) = nums(i+1)
                uniques+=1
            }
        uniques
    }
}
